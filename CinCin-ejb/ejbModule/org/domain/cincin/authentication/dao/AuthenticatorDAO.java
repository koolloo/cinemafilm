package org.domain.cincin.authentication.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.domain.cincin.authentication.dao.IAuthenticatorDAO;
import org.domain.cincin.entities.UsersCustomers;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.log.Log;

@Stateless
@Name("authenticatorDAO")
public class AuthenticatorDAO implements IAuthenticatorDAO {

	@PersistenceContext
	EntityManager em;

    @Logger private Log log;
    
    @Out(scope=ScopeType.SESSION, value="loggedUser")
    UsersCustomers loggedUser;
	
	public boolean isTheUserRegistered(String login) {

		Query query = em.createQuery("from UsersCustomers u where u.userlogin=:givenlogin");
		query.setParameter("givenlogin", login);
		List<UsersCustomers> userFromDb = (List<UsersCustomers>) query.getResultList();

    	if(!userFromDb.isEmpty()) {
    		loggedUser = userFromDb.get(0);
    		log.info("The user under the login [{0}] is registered user.", login);
			return true;
		} else {
			log.info("The user under the login [{0}] is not-registered user.", login);
			return false;
		}
	}

	public String getUserPassword(String login) {
		
		Query query = em.createQuery("from UsersCustomers u where u.userlogin=:givenlogin");
		query.setParameter("givenlogin", login);
		UsersCustomers userFromDb = (UsersCustomers) query.getSingleResult();
		return userFromDb.getUserpassword();
	}
}