package Springboot.Project.S14_L1_1.Repositories;

import Springboot.Project.S14_L1_1.Entities.Pizze;
import Springboot.Project.S14_L1_1.Entities.Toppings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToppingsDAO extends JpaRepository<Toppings,Long> {

    @Query("SELECT t FROM Toppings t")
    List<Toppings> findToppings();
}
