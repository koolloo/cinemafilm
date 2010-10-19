package org.domain.cincin.authentication.ejb;

import javax.ejb.Local;

@Local
public interface IPasswordHashManager {
	
	String hash(String plainTextPassword);
	void setDigestAlgorithm(String algorithm);
	void setCharset(String charset);
}