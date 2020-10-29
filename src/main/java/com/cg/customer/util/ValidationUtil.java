package com.cg.customer.util;

import com.cg.customer.exception.InvalidArgumentException;
import com.cg.customer.exception.InvalidCustomerNameException;

public class ValidationUtil {

	public static void checkArgumentNotNull(Object arg) {
		if (arg == null) {
			throw new InvalidArgumentException("argument cannott be null");
		}
	}

	public static void checkName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidCustomerNameException("NOT A VALID NAME");
		}

	}

}