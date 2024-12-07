package com.infotech.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.infotech.dto.SSARequest;
import com.infotech.dto.SSAResponse;

@Service
public class SsaWebServiceImpl implements SsaWebService{
	private static Map<Integer, String> stateMap = new HashMap<Integer, String>();
	static {
		stateMap.put(1, "NewJersy");
		stateMap.put(2, "Texas");
		stateMap.put(3, "Ohio");
		stateMap.put(4, "NewJersy");
		stateMap.put(5, "Rohde Island");
		stateMap.put(6, "Kentucky");
		stateMap.put(7, "Missori");
		stateMap.put(8, "Michigan");
		stateMap.put(9, "NewYork");
	}

	@Override
	public SSAResponse getCitizenSsaDetails(SSARequest request) {
		String ssnString = request.getSsn().toString();
		Integer stateKey=Integer.parseInt(ssnString.substring(0, 1));
		String ssnState = stateMap.get(stateKey);

		SSAResponse response = new SSAResponse();
		response.setSsn(request.getSsn());
		response.setStateName(ssnState);
		
		return response;
	}

}
