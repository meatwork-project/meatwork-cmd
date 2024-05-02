/*
 * Copyright (c) 2016 Taliro.
 * All rights reserved.
 */
module com.meatwork.cmd {

	requires com.meatwork.core;
	requires info.picocli;
	requires org.slf4j;
	requires jakarta.inject;

	exports com.meatwork.cmd.api;
}