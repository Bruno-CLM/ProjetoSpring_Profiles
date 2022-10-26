package io.github.brunoclm.app;

import java.math.BigInteger;
import java.security.MessageDigest;

public class HashMD5 {
	public HashMD5(String input) {
		try {
			 MessageDigest md= MessageDigest.getInstance("MD5");
			 BigInteger hash = new BigInteger(1, md.digest(input.getBytes()));
			 System.out.println(hash.toString(16));
			
			 System.out.println(md.equals(hash));
			 
			 
			 
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
