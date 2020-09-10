package com.wyett.httpdemo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @author : wyettLei
 * @date : Created in 2020/9/9 16:51
 * @description: TODO
 */

@Component
public class UrlUtil {
    public static final String TOKEN = "e7de3773-142-4c2c-be5c-e46bafad13ab";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 生成http-Body
     * @param jsonMap
     * @return
     */
    public HttpEntity<Map<String, String>> generatePostJson(Map<String, String> jsonMap) {
        HttpHeaders httpHeaders = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json;charset=UTF-8");
        httpHeaders.setBearerAuth(TOKEN);
        httpHeaders.setContentType(type);
        HttpEntity<Map<String, String>> httpEntity = new HttpEntity<>(jsonMap, httpHeaders);
        return httpEntity;
    }


    /**
     *
     * @param protocol
     * @param uri
     * @param params
     * @return
     */
    public String generateRequestParameters(String protocol, String uri, Map<String, String> params) {
        StringBuilder sb = new StringBuilder(protocol).append("://").append(uri);
        if (ToolUtil.isNotEmpty(params)) {
            sb.append("?");
            for (Map.Entry map : params.entrySet()) {
                sb.append(map.getKey())
                        .append("=")
                        .append(map.getValue())
                        .append("&");
            }
            uri = sb.substring(0, sb.length() - 1);
            return uri;
        }
        return sb.toString();
    }



}
