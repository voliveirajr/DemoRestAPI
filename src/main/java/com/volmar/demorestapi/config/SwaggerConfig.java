package com.volmar.demorestapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.collect.Sets;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

  public static final Contact DEFAULT_CONTACT = new Contact(
      "Volmar Oliveira Jr", "https://github.com/voliveirajr", "volmar.oliveira.jr@gmail.com");
  
  public static final ApiInfo V1_API_INFO = new ApiInfo(
      "DemoRest 1.0", "Demo Rest Api", "1.0",
      "urn:tos", DEFAULT_CONTACT, 
      "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
  
  public static final ApiInfo V2_API_INFO = new ApiInfo(
	      "DemoRest 2.0", "Demo Rest Api", "2.0",
	      "urn:tos", DEFAULT_CONTACT, 
	      "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
  
  @Bean
  public Docket swaggerPersonApi10() {
      return new Docket(DocumentationType.SWAGGER_2)
          .groupName("demorestapi-1.0")
          .select()
              .apis(RequestHandlerSelectors.basePackage("com.volmar.demorestapi.controller"))
              .paths(PathSelectors.ant("/api/v1/**"))
          .build()
          //.pathMapping("/api/v1")
          .produces(Sets.newHashSet(APPLICATION_JSON_VALUE))
          .consumes(Sets.newHashSet(APPLICATION_JSON_VALUE))
          .apiInfo(V1_API_INFO);
  }
   
  @Bean
  public Docket swaggerPersonApi20() {
      return new Docket(DocumentationType.SWAGGER_2)
    	  .groupName("demorestapi-2.0")
          .select()
              .apis(RequestHandlerSelectors.basePackage("com.volmar.demorestapi.controller"))
              .paths(PathSelectors.ant("/api/v2/**"))
          .build()
          //.pathMapping("/api/v2")
          .produces(Sets.newHashSet(APPLICATION_JSON_VALUE))
          .consumes(Sets.newHashSet(APPLICATION_JSON_VALUE))
          .apiInfo(V2_API_INFO);
  }
}
