package com.github.union.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.union.jackson.derialization.bean.MyBeanJsonCreator;
import com.github.union.jackson.serialization.bean.MyBeanJsonGetter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class JacksonDeserializationAnnotationsTest {

    @Before
    public void setUp() {

    }

    @Test
    public void jsonCreatorTest() throws IOException {
        MyBeanJsonGetter beanJsonGetter = new MyBeanJsonGetter(1, "My bean");

        String json = new ObjectMapper().writeValueAsString(beanJsonGetter);

        MyBeanJsonCreator bean = new ObjectMapper().readerFor(MyBeanJsonCreator.class).readValue(json);
        Assert.assertEquals("My bean", bean.getName());
        System.out.println(json);
    }

    @After
    public void clean() {

    }
}
