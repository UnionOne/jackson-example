package com.github.union.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.union.jackson.common.EntityUtils;
import com.github.union.jackson.jsonanygetter.ExtendableBean;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JsonAnyGetterTest {

    private ExtendableBean bean;

    @Before
    public void setUp() {
        bean = EntityUtils.generateExtendableBean();
    }

    @Test
    public void jsonAnyGetterTest() throws JsonProcessingException {
        String name = bean.getName();

        String result = new ObjectMapper().writeValueAsString(bean);
        Assert.assertEquals(true, result.contains(name));
        System.out.println(result);
    }

    @After
    public void clean() {

    }
}
