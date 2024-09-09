package Springboot.Project.S14_L1_1.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Entity
@Table(name = "Topping")
public class Toppings{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String toppingName;
    private int calorie;
    private double prezzo;
    public Toppings(int calorie,double prezzo, String toppingName){
        this.calorie=calorie;
        this.prezzo=prezzo;
        this.toppingName=toppingName;
    }
    public Toppings(){}

    @Override
    public String toString() {
        return "Toppings{" +
                "toppingName='" + toppingName + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
