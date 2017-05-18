
package com.owen.spring.boot.web.util;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Utils - JSON.
 * @author  owen
 * @version 1.0_beta
 */
public final class JsonUtils {
    
    private static ObjectMapper JSON = new ObjectMapper();

    /***
     * 对象转换Json字符串
     * @param obj
     * @return
     */
    public static String getJsonFromObject(Object obj) {
        if (obj == null) {
            return null;
        }

        try {
            return JSON.writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    
    public static <T> T getObjectFromJson(String json, Class<T> valueType) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }

        try {
            return JSON.readValue(json, valueType);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T getObjectFromJson(String json, TypeReference<T> valueTupeRef) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }

        try {
            return JSON.readValue(json, valueTupeRef);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


//	Øß

}
