package Springboot.Project.S14_L1_1.Services;

import Springboot.Project.S14_L1_1.Entities.Pizze;
import Springboot.Project.S14_L1_1.Repositories.PizzeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzeServices {
    @Autowired
    private PizzeDAO pizzeDAO;

    public void savePizza(Pizze p){
pizzeDAO.save(p);
        System.out.println("pizza salvata correttamente");
    }
}
