package me.jastz.oauth2.client.credentials.web;

import com.google.common.collect.Maps;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by zhiwen on 2017/8/10.
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public Map<String, Object> hello() {
        Map<String, Object> data = Maps.newHashMap();
        data.put("Hello", "World");
        return data;
    }
}
