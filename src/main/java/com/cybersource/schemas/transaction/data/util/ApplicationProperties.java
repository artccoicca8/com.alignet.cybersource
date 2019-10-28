package com.cybersource.schemas.transaction.data.util;

import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationProperties {

	private static final Logger logger = LoggerFactory.getLogger(ApplicationProperties.class);

	private ApplicationProperties() {

	}

	public static String getAppName(String value) {
		ResourceBundle bundle = ResourceBundle.getBundle("application");
		String dato = "";

		try {
			dato = bundle.getString(value);
		} catch (Exception e) {
			logger.info("Error ,", e.getCause());
			e.printStackTrace();
		}
		return dato;
	}

}
