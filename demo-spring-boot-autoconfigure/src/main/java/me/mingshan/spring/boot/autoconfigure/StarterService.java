package me.mingshan.spring.boot.autoconfigure;

import org.springframework.util.StringUtils;

/**
 * @author mingshan
 */
public class StarterService {
    private String config;

    public StarterService(String config) {
        this.config = config;
    }

    public String[] split(String separatorChar) {
        return StringUtils.split(this.config, separatorChar);
    }
}
