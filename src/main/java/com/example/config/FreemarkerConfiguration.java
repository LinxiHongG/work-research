package com.example.config;

import freemarker.template.Configuration;

public class FreemarkerConfiguration {
	private static Configuration config = null;

	/**
	 * Static initialization.
	 * 
	 * Initialize the configuration of Freemarker.
	 */
	static {
		config = new Configuration();
		config.setClassForTemplateLoading(FreemarkerConfiguration.class, "/template");
	}

	public static Configuration getConfiguation() {
		return config;
	}
}
