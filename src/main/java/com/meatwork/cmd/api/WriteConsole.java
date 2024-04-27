package com.meatwork.cmd.api;

import java.util.ArrayList;
import java.util.List;

/*
 * Copyright (c) 2016 Taliro.
 * All rights reserved.
 */
public final class WriteConsole {

	public static void response(byte[] bytes) {
		StringBuffer sb = new StringBuffer();
		for (byte b : bytes) {
			sb.append(b);
		}
		System.out.println(sb);
	}

	public static void send(String responseEncoded) {
		System.out.println(responseEncoded);
	}

	public static String encode(String string) {
		List<String> result = new ArrayList<>();
		char[] chars = string.toCharArray();
		for (char aChar : chars) {
			result.add(
					String.format("%8s", Integer.toBinaryString(aChar))   // char -> int, auto-cast
					      .replaceAll(" ", "0")                         // zero pads
			);
		}
		return String.join(
				" ",
				result
		);
	}

	public void encodeAndSend(String string) {
		String encode = encode(string);
		send(encode);
	}

}
