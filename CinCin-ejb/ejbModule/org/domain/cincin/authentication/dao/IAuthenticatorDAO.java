package org.domain.cincin.authentication.dao;

import javax.ejb.Local;

@Local
public interface IAuthenticatorDAO {

	boolean isTheUserRegistered(String login);
	String getUserPassword(String login);
}
