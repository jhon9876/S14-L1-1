package Springboot.Project.S14_L1_1.Entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class ConfigurationFile {
    @Bean(name = "bacon")
    public Toppings bacon(){
        return new Toppings(20,5,"bacon");
    }
    @Bean(name = "mozzarella")
    public Toppings mozzarella(){
        return new Toppings(20,10,"mozzarella");
    }

    @Bean(name="pizzaConMozzarella")
    public Pizze pizzaConMozzarella(){
        List<Toppings> t1= new ArrayList<>();
        t1.add(bacon());
        t1.add(mozzarella());

        return new Pizze(1500,20,"PizzaConMozzarella",t1);
    }
}
