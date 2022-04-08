package com.example.BS41;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("classpath:myConfiguration.properties")
public class MyConfiguration {

  @Value("${valor1}")
  private String valor1;

  @Value("${valor2}")
  private String valor2;
}
