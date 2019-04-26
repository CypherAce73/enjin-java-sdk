package com.enjin.enjincoin.sdk.service.ethereum;

import com.enjin.enjincoin.sdk.http.Result;

import java.io.IOException;
import java.math.BigInteger;

public interface SynchronousEthereumService {

    Result<BigInteger> getAllowanceSync(String ethAddr) throws IOException;

}