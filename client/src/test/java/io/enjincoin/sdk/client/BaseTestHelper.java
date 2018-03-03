package io.enjincoin.sdk.client;

import io.enjincoin.sdk.client.config.Config;
import io.enjincoin.sdk.client.config.ImmutableConfig;
import io.enjincoin.sdk.client.config.ImmutablePlatform;
import io.enjincoin.sdk.client.config.Platform;
import org.junit.Ignore;

/**
 * <p>Utility class used when running test.</p>
 */
@Ignore
public class BaseTestHelper {

    /**
     * Method to get the endjinConfig
     *
     * @return
     */
    public static Config getEnjinConfig() {
        Platform trustedPlatform = ImmutablePlatform.builder()
                .setHost("localhost")
                .setPort(80)
                .setProtocol("http")
                .build();

        Config enjinConfig = ImmutableConfig.builder()
                .setInTestMode(false)
                .setTotalExecutors(1)
                .setTrustedPlatform(trustedPlatform)
                .build();

        return enjinConfig;
    }

}