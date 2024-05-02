package com.meatwork.cmd.api;

import com.meatwork.core.api.di.IService;

/*
 * Copyright (c) 2016 Taliro.
 * All rights reserved.
 */
@IService(scope = IService.Scope.MULTIPLE)
public interface ModuleInfo {
	String getModuleInfoName();
	String getModuleName();
	String getIconName();
}
