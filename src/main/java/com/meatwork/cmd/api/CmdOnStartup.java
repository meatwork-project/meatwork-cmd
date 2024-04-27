package com.meatwork.cmd.api;

import com.google.inject.Inject;
import com.meatwork.tools.api.service.ApplicationStartup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;

import java.util.List;

/*
 * Copyright (c) 2016 Taliro.
 * All rights reserved.
 */
public class CmdOnStartup implements ApplicationStartup {

	private final CmdLine cmdLine;
	private final List<SubCmd> subCmdList;

	private static final Logger LOGGER = LoggerFactory.getLogger(CmdOnStartup.class);

	@Inject
	public CmdOnStartup(CmdLine cmdLine,
	                    List<SubCmd> subCmdList) {
		this.cmdLine = cmdLine;
		this.subCmdList = subCmdList;
	}

	@Override
	public int priority() {
		return 999;
	}

	@Override
	public void run(String[] args) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("running command line with args {}", String.join(" ", args));
		}

		CommandLine commandLine = new CommandLine(cmdLine);

		if(subCmdList != null) {
			for (SubCmd subCmd : subCmdList) {
				if (LOGGER.isDebugEnabled()) {
					LOGGER.debug("sub command founded {}", subCmd.getClass());
				}
				commandLine.addSubcommand(subCmd);
			}
		}

		int exitCode = commandLine.execute(args);
		System.exit(exitCode);
	}
}
