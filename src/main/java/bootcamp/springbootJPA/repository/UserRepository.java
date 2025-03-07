package bootcamp.springbootJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bootcamp.springbootJPA.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
