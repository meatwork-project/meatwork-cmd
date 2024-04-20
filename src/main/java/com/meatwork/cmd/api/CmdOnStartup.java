package com.meatwork.cmd.api;

import com.meatwork.tools.api.service.ApplicationStartup;
import com.meatwork.tools.api.di.CDI;
import picocli.CommandLine;

/*
 * Copyright (c) 2016 Taliro.
 * All rights reserved.
 */
public class CmdOnStartup implements ApplicationStartup {
	@Override
	public int priority() {
		return 999;
	}

	@Override
	public void run(String[] args) throws Exception {
		CmdLine cmdLine = CDI.get(CmdLine.class);
		int exitCode = new CommandLine(cmdLine).execute(args);
		System.exit(exitCode);
	}
}
