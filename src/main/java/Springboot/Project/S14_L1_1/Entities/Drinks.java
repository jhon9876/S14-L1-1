package Springboot.Project.S14_L1_1.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Bevande")
public class Drinks{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    private String drinkName;
    private int calorie;
    private double prezzo;
    public Drinks(int calorie,double prezzo, String drinkName){
        this.calorie=calorie;
        this.prezzo=prezzo;
        this.drinkName=drinkName;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinkName='" + drinkName + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
