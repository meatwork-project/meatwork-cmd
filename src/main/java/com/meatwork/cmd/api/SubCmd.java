package com.meatwork.cmd.api;

import com.meatwork.core.api.di.IService;

import java.util.concurrent.Callable;

/*
 * Copyright (c) 2016 Taliro.
 * All rights reserved.
 */
@IService(scope = IService.Scope.MULTIPLE)
public interface SubCmd extends Callable<Integer> {}
