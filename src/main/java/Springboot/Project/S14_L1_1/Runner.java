package Springboot.Project.S14_L1_1;

import Springboot.Project.S14_L1_1.Entities.Pizze;
import Springboot.Project.S14_L1_1.Entities.Toppings;
import Springboot.Project.S14_L1_1.Repositories.ToppingsDAO;
import Springboot.Project.S14_L1_1.Services.PizzeServices;
import Springboot.Project.S14_L1_1.Services.ToppingsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private ToppingsServices toppingsServices;
    @Autowired
    private PizzeServices pizzeServices;
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S14L11Application.class);

        Toppings t1= (Toppings) ctx.getBean("bacon");
        System.out.println(t1.getCalorie());
 Toppings t2= (Toppings) ctx.getBean("mozzarella");
        System.out.println(t1.getCalorie());

        Pizze p1= (Pizze) ctx.getBean("pizzaConMozzarella");
        System.out.println(p1.getNamePizza());

        toppingsServices.saveTopping(t1);
        toppingsServices.saveTopping(t2);
        System.out.println(toppingsServices.findAllTopping());

       /* toppingsServices.deleteToppings(t1);*/

        toppingsServices.updateTopping(1);

        pizzeServices.savePizza(p1);




    }
}
