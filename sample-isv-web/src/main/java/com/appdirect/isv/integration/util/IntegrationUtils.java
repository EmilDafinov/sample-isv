package com.appdirect.isv.integration.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import org.apache.commons.lang3.StringUtils;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class IntegrationUtils {
	public static String extractBasePath(String eventUrl) {
		return StringUtils.substringBefore(eventUrl, "/api/integration/v1");
	}

	public static String extractToken(String eventUrl) {
		return StringUtils.substringAfterLast(eventUrl, "/");
	}
}
