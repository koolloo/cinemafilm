package org.domain.cincin.authentication.ejb;

import javax.ejb.Local;

@Local
public interface IAuthenticator {

	boolean authenticate();
}