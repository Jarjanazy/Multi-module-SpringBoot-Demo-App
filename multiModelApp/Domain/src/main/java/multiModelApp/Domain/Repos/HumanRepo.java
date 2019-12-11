package multiModelApp.Domain.Repos;

import multiModelApp.Domain.Human;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HumanRepo extends JpaRepository<Human, Integer> {

}
