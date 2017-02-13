/**
 * 
 */
package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
//import org.springframework.context.annotation.ComponentScan;

/**
 * @author Sunjian
 * @version 1.0
 * @since jdk1.7
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableConfigurationProperties({ApplicationProfile.class})
public class Application extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {  
	  
    @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {  
        return builder.sources(Application.class);  
    }  
       
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
  
  
    @Override  
    public void customize(ConfigurableEmbeddedServletContainer container) {  
        container.setPort(8081);  
    }  
}  