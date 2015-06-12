package com.appdirect.isv.integration.service;

import com.appdirect.isv.integration.remote.service.AppDirectIntegrationAPI;
import com.appdirect.isv.integration.remote.vo.APIResult;

public interface IntegrationService {
	String SAML_IDP_LINK = "samlIdp";

	AppDirectIntegrationAPI getAppDirectIntegrationApi(String basePath);

	public APIResult processEvent(String eventUrl, String token);
}
