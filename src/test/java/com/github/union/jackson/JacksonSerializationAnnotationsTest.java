package com.github.union.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.union.jackson.bean.ExtendableBeanJsonAnyGetter;
import com.github.union.jackson.bean.MyBeanJsonGetter;
import com.github.union.jackson.common.EntityUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JacksonSerializationAnnotationsTest {

    private ExtendableBeanJsonAnyGetter beanJsonAnyGetter;
    private MyBeanJsonGetter myBeanJsonGetter;

    @Before
    public void setUp() {
        beanJsonAnyGetter = EntityUtils.generateExtendableBean();
        myBeanJsonGetter = EntityUtils.generaeMyBeanJsonGetter();
    }

    @Test
    public void jsonAnyGetterTest() throws JsonProcessingException {
        String name = beanJsonAnyGetter.getName();

        String result = new ObjectMapper().writeValueAsString(beanJsonAnyGetter);
        Assert.assertEquals(true, result.contains(name));
        System.out.println(result);
    }

    @Test
    public void jsonGetterTest() throws JsonProcessingException {
        Integer id = myBeanJsonGetter.getId();
        String name = myBeanJsonGetter.getName();

        String result = new ObjectMapper().writeValueAsString(myBeanJsonGetter);
        Assert.assertEquals(true, result.contains(id.toString()));
        Assert.assertEquals(true, result.contains(name));
        System.out.println(result);
    }

    @After
    public void clean() {

    }
}
