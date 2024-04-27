package com.meatwork.cmd.api;

import java.util.concurrent.Callable;

/*
 * Copyright (c) 2016 Taliro.
 * All rights reserved.
 */
public interface SubCmd extends Callable<Integer> {
	String getModuleInfoName();
	String getModuleName();
	String getIconName();
}
