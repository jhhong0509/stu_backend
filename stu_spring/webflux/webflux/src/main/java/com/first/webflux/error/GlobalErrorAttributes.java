package com.first.webflux.error;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.reactive.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Component
public class GlobalErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(ServerRequest request, ErrorAttributeOptions options) {
        Map<String, Object> map = new HashMap<>();
        Throwable error = getError(request);
        if (error instanceof GlobalException) {
            GlobalException exception = (GlobalException) error;
            map.put("error", exception.getErrorCode().getError());
            map.put("code", exception.getErrorCode().getStatus());
        } else {
            map.put("error", error.getMessage().substring(3));
            map.put("code", error.getMessage().substring(0, 3));
        }
        return map;

    }

}
