package Springboot.Project.S14_L1_1.Entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;
@Getter
@Entity
@Table
public class Pizze {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    @ManyToMany
    @JoinTable(name = "toppings_pizzas", joinColumns = @JoinColumn(name = "pizzas"), inverseJoinColumns = @JoinColumn(name = "toppings"))
    private List<Toppings> t;
    private String namePizza;
    private int calorie;
    private double prezzo;
    public Pizze(int calorie, double prezzo, String namePizza, List<Toppings> t){
        this.calorie=calorie;
        this.prezzo=prezzo;
        this.namePizza=namePizza;
        this.t=t;
        this.calorie=calcolaCalorie(t);
        this.prezzo=calcolaPrezzoTotale(t);
    }

    public int calcolaCalorie(List <Toppings> topping){
        int calorieTot=1500;
        if(topping!=null){
            for (int i = 0; i < topping.size(); i++) {
                calorieTot+=topping.get(i).getCalorie();
            }
        }
        return calorieTot;
    }

    public double calcolaPrezzoTotale(List <Toppings> topping){
        double prezzoTotale=2.5;
        if(topping!=null) {
            for (int i = 0; i < topping.size(); i++) {
                prezzoTotale+=topping.get(i).getPrezzo();
            }
        }
        return prezzoTotale;
    }

    @Override
    public String toString() {
        return "Pizze{" +
                "namePizza='" + namePizza + '\'' +
                ", t=" + t +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
