package com.owen.spring.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * springboot程序启动 
 * @author owen
@Configuration Application类说明自己是Spring Boot的入口类，那么需要加入注解。
@EnableAutoConfiguration习惯放在主方法类Application上，当项目运行时，Spring容器去自动查找带特定注解的类，如：带@Entity、@Service等类。
@ComponentScan如果不带basePackage 属性的话，它会自动扫描以入口类所在的包为父节点下所有子包下的类。这也是Spring Boot会提议我们把Application类放于根包路径下。
@SpringBootApplication 如果我们的项目和Spring Boot建议的代码结构一样，Application类放在根包路径下。那么我们可以使用@SpringBootApplication来代替上面三个注解。
 */
@Configuration
@ComponentScan(basePackages = "com.owen.springbootweb")
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class}) 
public class SpringBootWebApplication extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {  
  
    @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {  
        return builder.sources(SpringBootWebApplication.class);  
    }  
      
    public static void main(String[] args) {  
        SpringApplication.run(SpringBootWebApplication.class, args);  
    }

    
    /**
     * 设置项目 port contextPath
     * 也可以通过application.properties进行配置
     */
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(9090);
        container.setContextPath("/springbootwebxml");
    }  
   
}  
