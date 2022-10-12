package com.example.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.server.ServerOAuth2AuthorizedClientRepository;

@SpringBootTest
class GatewayApplicationTest {

    @MockBean
    ReactiveClientRegistrationRepository clientRegistrationRepository;

//    @MockBean
//    ServerOAuth2AuthorizedClientRepository authorizedClients;

    @Test
    void contextLoads() {
    }
}