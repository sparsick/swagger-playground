package com.github.sparsick.swagger.playground;

import io.swagger.client.ApiClient;
import org.springframework.web.client.RestTemplate;

public class TestClient {

    private ApiClient apiClient = new ApiClient(new RestTemplate());
}
