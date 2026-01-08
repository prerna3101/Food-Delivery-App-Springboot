package com.foodapp.food_delivery_app;

import com.foodapp.config.AnnotationConfig;
import com.foodapp.bean.DeliveryPartner;
import com.foodapp.bean.Restaurant;
import com.foodapp.bean.Order;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class FoodDeliveryAppApplication {
    public static void main(String[] args) {

        // XML context for Order
        ApplicationContext xmlCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Order order = xmlCtx.getBean("order", Order.class);
        order.showOrder();

        // Annotation context for Restaurant + DeliveryPartner
        ApplicationContext annoCtx = new AnnotationConfigApplicationContext(AnnotationConfig.class);

        Restaurant restaurant = annoCtx.getBean(Restaurant.class);
        restaurant.showRestaurant();
        restaurant.confirmOrder();

        DeliveryPartner partner = annoCtx.getBean(DeliveryPartner.class);
        partner.deliverOrder();
    }
}