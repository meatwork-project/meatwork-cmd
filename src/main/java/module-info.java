import com.google.inject.Module;
import com.meatwork.cmd.api.module.CmdModule;

/*
 * Copyright (c) 2016 Taliro.
 * All rights reserved.
 */
module com.meatwork.cmd {

	requires com.meatwork.tools;
	requires info.picocli;
	requires com.google.guice;

	uses Module;
	provides Module with CmdModule;

	exports com.meatwork.cmd.api;

}