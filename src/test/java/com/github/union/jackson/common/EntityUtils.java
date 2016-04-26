package com.github.union.jackson.common;

import com.github.union.jackson.bean.ExtendableBeanJsonAnyGetter;
import com.github.union.jackson.bean.MyBeanJsonGetter;
import com.github.union.jackson.bean.MyBeanJsonPropertyOrder;
import com.github.union.jackson.bean.MyBeanJsonRawValue;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class EntityUtils {
    private static final int MAX_STRING_LENGTH = 25;
    private static final int MAX_NUMBER = 1000;

    private static String getRandomString(int length) {
        return RandomStringUtils.random(length, true, true);
    }

    private static Integer getRandomInteger(int bound) {
        return RandomUtils.nextInt(1, bound);
    }

    public static ExtendableBeanJsonAnyGetter generateExtendableBean() {
        ExtendableBeanJsonAnyGetter bean = new ExtendableBeanJsonAnyGetter(getRandomString(MAX_STRING_LENGTH));
        bean.add(getRandomString(MAX_STRING_LENGTH), getRandomString(MAX_STRING_LENGTH));
        bean.add(getRandomString(MAX_STRING_LENGTH), getRandomString(MAX_STRING_LENGTH));
        return bean;
    }

    public static MyBeanJsonGetter generaeMyBeanJsonGetter() {
        return new MyBeanJsonGetter(getRandomInteger(MAX_NUMBER), getRandomString(MAX_STRING_LENGTH));
    }

    public static MyBeanJsonPropertyOrder generateMyBeanJsonPropertyOrder() {
        return new MyBeanJsonPropertyOrder(getRandomInteger(MAX_NUMBER), getRandomString(MAX_STRING_LENGTH));
    }

    public static MyBeanJsonRawValue generateMyBeanJsonRawValue() {
        return new MyBeanJsonRawValue("{" + getRandomString(MAX_STRING_LENGTH) + ":" + getRandomString(MAX_STRING_LENGTH) + "}",
                getRandomString(MAX_STRING_LENGTH));
    }
}
