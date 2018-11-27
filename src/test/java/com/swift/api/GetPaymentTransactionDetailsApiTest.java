package com.swift.api;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.swift.ApiException;
import com.swift.ApiResponse;
import com.swift.model.CamtA0200102;
import com.swift.model.CamtA0200202;
import com.swift.model.GetPaymentTransactionDetailsRequest;

/**
 * API tests for GetPaymentTransactionDetailsApi
 */

public class GetPaymentTransactionDetailsApiTest {

	ApiResponse<CamtA0200202> mock_ApiResponse = (ApiResponse<CamtA0200202>) mock(ApiResponse.class);
	GetPaymentTransactionDetailsApi test = mock(GetPaymentTransactionDetailsApi.class);

	@Test
	public void getPaymentTransactionDetailsPostTest() throws ApiException {
		CamtA0200102 requestBody = new CamtA0200102();
		requestBody.setGetPaymentTransactionDetailsRequest(new GetPaymentTransactionDetailsRequest());

		List<String> myInstitution = asList("CCLABEB0");
		requestBody.getGetPaymentTransactionDetailsRequest().setMyInstitution(myInstitution);
		requestBody.getGetPaymentTransactionDetailsRequest()
				.setTransactionIdentification("b916a97d-a699-4f20-b8c2-2b07e2684a27");

		when(test.getPaymentTransactionDetailsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
				"e802ab96-bb3a-4965-9139-5214b9f0f074",
				"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
				"U1khA8h9Lm1PqzB99fG6uw", "yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B", requestBody, "0"))
						.thenReturn(mock_ApiResponse);

		Assert.assertEquals(
				test.getPaymentTransactionDetailsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
						"e802ab96-bb3a-4965-9139-5214b9f0f074",
						"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
						"U1khA8h9Lm1PqzB99fG6uw", "yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B", requestBody, "0"),
				mock_ApiResponse);

		System.out.println("Passed Test getPaymentTransactionDetailsPostWithHttpInfoShouldReturnResponse");
		// TODO: test validations
	}

}
