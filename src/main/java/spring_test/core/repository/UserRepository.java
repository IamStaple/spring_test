package spring_test.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import spring_test.core.model.EnrichedUser;

import java.util.List;

public interface UserRepository extends JpaRepository<EnrichedUser, Long> {

    @Query("SELECT eu FROM EnrichedUser eu")
    List<EnrichedUser> getEnrichedUsers();
}
