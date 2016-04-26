package com.github.union.jackson.common;

import com.github.union.jackson.jsonanygetter.ExtendableBean;
import org.apache.commons.lang3.RandomStringUtils;

public class EntityUtils {
    private static final int MAX_STRING_LENGTH = 25;

    private static String getRandomString(int length) {
        return RandomStringUtils.random(length, true, true);
    }

    public static ExtendableBean generateExtendableBean() {
        ExtendableBean bean = new ExtendableBean(getRandomString(MAX_STRING_LENGTH));
        bean.add(getRandomString(MAX_STRING_LENGTH), getRandomString(MAX_STRING_LENGTH));
        bean.add(getRandomString(MAX_STRING_LENGTH), getRandomString(MAX_STRING_LENGTH));
        return bean;
    }
}
