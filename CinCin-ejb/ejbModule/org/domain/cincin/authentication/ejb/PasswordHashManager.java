package org.domain.cincin.authentication.ejb;

import javax.ejb.Stateless;
import org.domain.cincin.authentication.ejb.IPasswordHashManager;
import java.security.MessageDigest;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.util.Hex;

@Stateless
@Name("passHashManager")
public class PasswordHashManager implements IPasswordHashManager {

	private String digestAlgorithm = "SHA-1";
	private String charset = "UTF-8";

	public void setDigestAlgorithm(String algorithm) {
		this.digestAlgorithm = algorithm;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String hash(String plainTextPassword) {
		try {
			MessageDigest digest = MessageDigest.getInstance(digestAlgorithm);
			digest.update(plainTextPassword.getBytes(charset));
			byte[] rawHash = digest.digest();
			return new String(Hex.encodeHex(rawHash));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}