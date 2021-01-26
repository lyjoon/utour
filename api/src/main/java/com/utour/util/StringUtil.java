package com.utour.util;

import org.springframework.util.StringUtils;

public class StringUtil extends StringUtils {

	public static String voidString(String value) {
		return isEmpty(value) ? "" : value;
	}

	public static String defaultString(String value, String defaultString) {
		return isEmpty(value) ? defaultString : value;
	}
}
