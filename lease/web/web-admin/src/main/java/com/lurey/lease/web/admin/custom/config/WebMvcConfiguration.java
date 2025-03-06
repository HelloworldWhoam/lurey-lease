package com.lurey.lease.web.admin.custom.config;

import com.lurey.lease.web.admin.custom.converter.StringToItemTypeConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
    @Autowired
    private StringToItemTypeConverter stringToItemTypeConverter;
    @Override
    public void addFormatters(FormatterRegistry registry) {//通过registry注册属于自己的converter
//        registry.addConverter(new StringToItemTypeConverter());//传入一个我们自定义的converter对象
        //下面是改进后的
        registry.addConverter(this.stringToItemTypeConverter);
    }
}
