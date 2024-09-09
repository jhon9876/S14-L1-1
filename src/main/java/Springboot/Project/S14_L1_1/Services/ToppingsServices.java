package Springboot.Project.S14_L1_1.Services;

import Springboot.Project.S14_L1_1.Entities.Toppings;
import Springboot.Project.S14_L1_1.Repositories.ToppingsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToppingsServices {
    @Autowired
    private ToppingsDAO toppingsDAO;

    public void saveTopping(Toppings t){
        if(t.getToppingName().length()<10){
            t.setToppingName("nuovoNome");
        }
        toppingsDAO.save(t);

        System.out.println("topping salvato correttamente");
    }

    public List<Toppings> findAllTopping(){
        return toppingsDAO.findAll();
    }

    public void deleteToppings(Toppings t){

        toppingsDAO.delete(t);
        System.out.println("Topping " + t.getToppingName() + " eliminato correttamente");
    }

    public void updateTopping(long ID){
        Optional <Toppings> optionalValue=toppingsDAO.findById(ID);
        if(optionalValue.isEmpty()){
            System.out.println("valore mancante");
        }else{
            System.out.println(optionalValue.get());
        }

    }




}
