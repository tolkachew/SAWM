package it.step.grant.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import it.step.grant.model.User;

public interface UserRepo extends CrudRepository<User, Long> {
//JPQL - обязательно узнать!
    //JpaRepository  отличия CrudRepository
    @Query("SELECT user FROM User user WHERE user.username = :username")
    public User getUserByUsername(@Param("username") String username);
}