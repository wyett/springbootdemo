package com.wyett.redisonecache.serializer;

import com.alibaba.fastjson.JSON;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;
import org.springframework.util.Assert;

import java.nio.charset.Charset;

/**
 * @author : wyettLei
 * @date : Created in 2020/11/9 11:45
 * @description: TODO
 */

public class StringRedisSerializer implements RedisSerializer {

    private final Charset charset;

    private final String target = "/";

    private final String replacement = "";


    public StringRedisSerializer() {
        this(Charset.forName("UTF-8"));
    }

    public StringRedisSerializer(Charset charset) {
        Assert.notNull(charset,"charset should not be none");
        this.charset = charset;
    }

    @Override
    public byte[] serialize(Object o) throws SerializationException {
        String s = JSON.toJSONString(o);
        if (s == null) {
            return null;
        }
        s = s.replace(target, replacement);
        return s.getBytes(charset);
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        return bytes == null ? null: new String(bytes, charset);
    }
}
