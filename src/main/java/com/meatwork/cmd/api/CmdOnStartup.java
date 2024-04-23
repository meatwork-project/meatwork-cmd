package com.meatwork.cmd.api;

import com.meatwork.tools.api.service.ApplicationStartup;
import com.meatwork.tools.api.di.CDI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;

/*
 * Copyright (c) 2016 Taliro.
 * All rights reserved.
 */
public class CmdOnStartup implements ApplicationStartup {

	private static final Logger LOGGER = LoggerFactory.getLogger(CmdOnStartup.class);

	@Override
	public int priority() {
		return 999;
	}

	@Override
	public void run(String[] args) throws Exception {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("running command line with args {}", String.join(" ", args));
		}
		CmdLine cmdLine = CDI.get(CmdLine.class);
		int exitCode = new CommandLine(cmdLine).execute(args);
		System.exit(exitCode);
	}
}
