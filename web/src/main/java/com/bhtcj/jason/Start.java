package com.bhtcj.jason;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by HX0010080 on 2018/5/22 0022.
 */
@SpringBootApplication
@MapperScan("com.bhtcj.mapper.jason")
@ComponentScan({"com.fc","com.bhtcj.jason"})
public class Start extends SpringBootServletInitializer {




}