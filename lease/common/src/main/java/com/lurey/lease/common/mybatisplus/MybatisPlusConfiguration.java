package com.lurey.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.lurey.lease.web.*.mapper")
public class MybatisPlusConfiguration {

}