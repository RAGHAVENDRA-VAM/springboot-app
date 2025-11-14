package com.example.demo.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class JenkinsService {

    public void triggerPipeline(String environment, String pipeline) {
        String jenkinsUrl = "http://jenkins-server/job/" + pipeline +
                "/buildWithParameters";
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(jenkinsUrl)
            .queryParam("ENV", environment);

        HttpHeaders headers = new HttpHeaders();
        headers.setBasicAuth("Raghava", "117897e53ba2ca911b4ec4769975f9d65a");

        HttpEntity<String> entity = new HttpEntity<>(headers);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.exchange(builder.toUriString(), HttpMethod.POST,
                entity, String.class);
    }
}