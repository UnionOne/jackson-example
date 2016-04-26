package com.github.union.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.github.union.jackson.common.EntityUtils;
import com.github.union.jackson.serialization.bean.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JacksonSerializationAnnotationsTest {

    private ExtendableBeanJsonAnyGetter beanJsonAnyGetter;
    private MyBeanJsonGetter myBeanJsonGetter;
    private MyBeanJsonPropertyOrder myBeanJsonPropertyOrder;
    private MyBeanJsonRawValue myBeanJsonRawValue;
    private MyBeanJsonRootName myBeanJsonRootName;

    @Before
    public void setUp() {
        beanJsonAnyGetter = EntityUtils.generateExtendableBean();
        myBeanJsonGetter = EntityUtils.generaeMyBeanJsonGetter();
        myBeanJsonPropertyOrder = EntityUtils.generateMyBeanJsonPropertyOrder();
        myBeanJsonRawValue = EntityUtils.generateMyBeanJsonRawValue();
        myBeanJsonRootName = EntityUtils.generateMyBeanJsonRootName();
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

    @Test
    public void jsonPropertyOrderTest() throws JsonProcessingException {
        Integer id = myBeanJsonPropertyOrder.getId();
        String name = myBeanJsonPropertyOrder.getName();

        String result = new ObjectMapper().writeValueAsString(myBeanJsonPropertyOrder);
        Assert.assertEquals(true, result.contains(id.toString()));
        Assert.assertEquals(true, result.contains(name));
        System.out.println(result);
    }

    @Test
    public void jsonRawValueTest() throws JsonProcessingException {
        String json = myBeanJsonRawValue.getJson();
        String name = myBeanJsonRawValue.getName();

        String result = new ObjectMapper().writeValueAsString(myBeanJsonRawValue);
        Assert.assertEquals(true, result.contains(json));
        Assert.assertEquals(true, result.contains(name));
        System.out.println(result);
    }

    @Test
    public void jsonRootNameTest() throws JsonProcessingException {
        String name = myBeanJsonRootName.getName();

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        String result = mapper.writeValueAsString(myBeanJsonRootName);

        Assert.assertEquals(true, result.contains(name));
        Assert.assertEquals(true, result.contains("user"));
        System.out.println(result);
    }

    @Test
    public void jsonSerializeTest() throws ParseException, JsonProcessingException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        String toParse = "26-04-2016 01:18:00";
        Date date = dateFormat.parse(toParse);
        Event event = new Event("party", date);

        String result = new ObjectMapper().writeValueAsString(event);
        System.out.println(result);
        Assert.assertEquals(true, result.contains(toParse));
    }

    @After
    public void clean() {

    }
}
