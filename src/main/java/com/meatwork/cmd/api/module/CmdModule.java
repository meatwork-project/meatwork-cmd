package com.meatwork.cmd.api.module;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import com.meatwork.cmd.api.CmdOnStartup;
import com.meatwork.tools.api.service.ApplicationStartup;

/*
 * Copyright (c) 2016 Taliro.
 * All rights reserved.
 */
public class CmdModule extends AbstractModule {

	@Override
	protected void configure() {
		Multibinder
				.newSetBinder(
						binder(),
						ApplicationStartup.class
				)
				.addBinding()
				.to(CmdOnStartup.class);
	}
}
