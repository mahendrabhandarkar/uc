package com.uc.common;

import java.security.SecureRandom;



public class Utility {

	public static long generateOTP() {
		
		 SecureRandom random = new SecureRandom();
			return (100000 + random.nextInt(900000));
	}
	
	public static void main(String[] args) {
		generateOTP();
	}
}
