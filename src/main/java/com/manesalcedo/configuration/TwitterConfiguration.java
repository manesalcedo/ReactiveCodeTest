package com.manesalcedo.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.stereotype.Component;

@Component
public class TwitterConfiguration {
    @Value("${spring.social.twitter.appId}")
    private String appId;

    @Value("${spring.social.twitter.appSecret}")
    private String appSecret;

    @Bean
    public TwitterTemplate getTwitterTemplate() {
        return new TwitterTemplate(appId,
                appSecret);
    }
}