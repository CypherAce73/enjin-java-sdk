package com.enjin.coin.sdk.mockServer;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.enjin.coin.sdk.TokensService;
import com.enjin.coin.sdk.vo.token.GetTokenRequestVO;
import com.enjin.coin.sdk.vo.token.GetTokenResponseVO;
import com.enjin.coin.sdk.vo.token.ListTokensRequestVO;
import com.enjin.coin.sdk.vo.token.ListTokensResponseVO;

public class TokensServiceTestsAgainstMockServer extends BaseMockServer{

	private TokensService tokens;
	
	
	@Before
	public void init() {
		tokens = new TokensService(getURL(), true);
	}
	
	@Test
	public void testGetToken() {
		GetTokenRequestVO getTokenRequestVO = new GetTokenRequestVO();
		getTokenRequestVO.setTokenId("12345");
		GetTokenResponseVO getTokenResponseVO = tokens.getToken(getTokenRequestVO);
		assertNotNull(getTokenResponseVO);
		assertNotNull(getTokenResponseVO.getAdapter());
		assertNotNull(getTokenResponseVO.getCreator());	
		assertNotNull(getTokenResponseVO.getDecimals());	
		assertNotNull(getTokenResponseVO.getExchangeRate());	
		assertNotNull(getTokenResponseVO.getIcon());	
		assertNotNull(getTokenResponseVO.getMaxMeltFee());	
		assertNotNull(getTokenResponseVO.getMeltFee());	
		assertNotNull(getTokenResponseVO.getName());		
		assertNotNull(getTokenResponseVO.getTokenId());	
		assertNotNull(getTokenResponseVO.getTotalSupply());
		assertNotNull(getTokenResponseVO.getTransferable());
	}
	
	@Test
	public void testListIdentities() {		
		ListTokensRequestVO listTokensRequestVO = new ListTokensRequestVO();
		listTokensRequestVO.setAfterTokenId("123456");
		listTokensRequestVO.setAppId("352");
		listTokensRequestVO.setLimit("limit1");
		
		ListTokensResponseVO listTokensResponseVOArray = tokens.listTokens(listTokensRequestVO);

		for (GetTokenResponseVO getTokenResponseVO : listTokensResponseVOArray.getGetTokensResponseVOArray()) {
			assertNotNull(getTokenResponseVO);
			assertNotNull(getTokenResponseVO.getAdapter());
			assertNotNull(getTokenResponseVO.getCreator());	
			assertNotNull(getTokenResponseVO.getDecimals());	
			assertNotNull(getTokenResponseVO.getExchangeRate());	
			assertNotNull(getTokenResponseVO.getIcon());	
			assertNotNull(getTokenResponseVO.getMaxMeltFee());	
			assertNotNull(getTokenResponseVO.getMeltFee());	
			assertNotNull(getTokenResponseVO.getName());	
			assertNotNull(getTokenResponseVO.getTokenId());	
			assertNotNull(getTokenResponseVO.getTotalSupply());
			assertNotNull(getTokenResponseVO.getTransferable());
		}
	}
	
	
}
