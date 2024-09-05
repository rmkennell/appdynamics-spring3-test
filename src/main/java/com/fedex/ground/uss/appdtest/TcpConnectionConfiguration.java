package com.fedex.ground.uss.appdtest;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.util.List;

@ConfigurationProperties(prefix = "uss.tcp")
public record TcpConnectionConfiguration(@DefaultValue("10") Integer connectionTimeout,
                                         @DefaultValue("10000") Integer connectionRetryMs,
                                         @DefaultValue("3600000") Integer messageTimeoutMs,
                                         @DefaultValue("true") Boolean autoConnect, List<Connection> connections) {
    public record Connection(String name, String host, String facilityId, int port) {
    }
}
