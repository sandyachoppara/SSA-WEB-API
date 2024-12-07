package com.infotech.service;

import com.infotech.dto.SSARequest;
import com.infotech.dto.SSAResponse;

public interface SsaWebService {
	SSAResponse getCitizenSsaDetails(SSARequest request);
}
