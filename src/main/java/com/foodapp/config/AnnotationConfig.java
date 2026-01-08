package com.foodapp.config;

import com.foodapp.bean.DeliveryPartner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.foodapp.bean"})
public class AnnotationConfig {

    @Bean
    public DeliveryPartner deliveryPartner() {
        return new DeliveryPartner("Zomato Rider");
    }
}