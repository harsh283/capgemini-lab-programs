package com.capg.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.capg.dao","com.capg.labbook.ui","com.capg.labbook.model","com.capg.service","com.capg.configuration"})
@PropertySource(value="app.properties")
public class ConfigurationClas {

}
