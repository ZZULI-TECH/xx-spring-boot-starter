package me.mingshan.spring.boot.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author mingshan
 */
@ConfigurationProperties("example.service")
public class StarterServiceProperties {
    private boolean enable;
    private String config;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}