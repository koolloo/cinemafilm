package org.domain.cincin.authentication.ejb;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.domain.cincin.authentication.dao.IAuthenticatorDAO;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;
import org.jboss.seam.security.Credentials;
import org.jboss.seam.security.Identity;

@Stateless
@Name("authenticator")
public class Authenticator implements IAuthenticator
{
    @Logger private Log log;

    @In Identity identity;
    @In Credentials credentials;
    
    @In(create=true) IPasswordHashManager passHashManager;

    @EJB
    IAuthenticatorDAO authenticatorDAO;
    
    public boolean authenticate()
    {
    	log.info("{0}", passHashManager.hash("Fryze"));
        log.info("Authenticating the user with login : [{0}].", credentials.getUsername());
        if (authenticatorDAO.isTheUserRegistered(credentials.getUsername()))
        {
        	log.info("{0}, {1}", authenticatorDAO.getUserPassword(credentials.getUsername()), passHashManager.hash(credentials.getPassword()));
        	if(authenticatorDAO.getUserPassword(credentials.getUsername()).equals(passHashManager.hash(credentials.getPassword()))) {
        		identity.addRole("admin");
        		return true;
        	}
        	return false;
        }
        return false;
    }
}