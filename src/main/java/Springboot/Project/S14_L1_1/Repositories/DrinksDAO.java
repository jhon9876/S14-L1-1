package Springboot.Project.S14_L1_1.Repositories;

import Springboot.Project.S14_L1_1.Entities.Drinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinksDAO extends JpaRepository<Drinks,Long> {
}
