# jackson-example
###Jackson Serialization Annotations

The **[@JsonAnyGetter](https://github.com/UnionOne/jackson-example/blob/master/src/main/java/com/github/union/jackson/serialization/bean/ExtendableBeanJsonAnyGetter.java#L21)** annotation allows the flexibility of using a *Map* field as standard properties.

The **[@JsonGetter](https://github.com/UnionOne/jackson-example/blob/master/src/main/java/com/github/union/jackson/serialization/bean/MyBeanJsonGetter.java#L15)** annotation is an alternative to *@JsonProperty* annotation to mark the specified method as a getter method.

The **[@JsonPropertyOrder](https://github.com/UnionOne/jackson-example/blob/master/src/main/java/com/github/union/jackson/serialization/bean/MyBeanJsonPropertyOrder.java#L5)** annotation is used to specify the order of properties on serialization.

The **[@JsonRawValue](https://github.com/UnionOne/jackson-example/blob/master/src/main/java/com/github/union/jackson/serialization/bean/MyBeanJsonRawValue.java#L8)** annotation  is used to instruct the Jackson to serialize a property exactly as is.

The **[@JsonRootName](https://github.com/UnionOne/jackson-example/blob/master/src/main/java/com/github/union/jackson/serialization/bean/MyBeanJsonRootName.java#L5)** annotation is used – if wrapping is enabled – to specify the name of the root wrapper to be used.

The **[@JsonSerialize](https://github.com/UnionOne/jackson-example/blob/master/src/main/java/com/github/union/jackson/serialization/bean/Event.java#L10)** annotation is used to indicate a custom serializer will be used to marshall the entity.

___

###Jackson Deserialization Annotations

The **[@JsonCreator](https://github.com/UnionOne/jackson-example/blob/master/src/main/java/com/github/union/jackson/derialization/bean/MyBeanJsonCreator.java#L10)** annotation is used to tune the constructor/factory used in deserialization. It’s very helpful when we need to deserialize some JSON that doesn’t exactly match the target entity we need to get.
