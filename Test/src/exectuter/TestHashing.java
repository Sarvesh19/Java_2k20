package exectuter;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class TestHashing {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String password = "Sarvesh123";
		
		String password1 = "Sarvesh123";

		
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
		String encoded1 = Base64.getEncoder().encodeToString(hash);

		
		MessageDigest digest1 = MessageDigest.getInstance("SHA-256");
		byte[] hash1 = digest1.digest(password1.getBytes(StandardCharsets.UTF_8));
		String encoded2 = Base64.getEncoder().encodeToString(hash);

		
		System.out.println(encoded1.equals(encoded2));
	}
}
