package com.bridgelabz.pincodevalidation;

import java.util.regex.Pattern;

public class PinCode {

	public static void validatePinCode(String pincode) {

		boolean result = Pattern.matches("[0-9]{6}", pincode);
		if(result == true) {
			System.out.println("Valid Pincode");
		}
		else {
			System.out.println("Invalid Pincode");
		}
	}

	public static void main(String[] args) {

		validatePinCode("400088");
		validatePinCode("A400088");
		validatePinCode("400088B");
	}
}
