package bootcamp.springbootJPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import bootcamp.springbootJPA.Model.User;
import bootcamp.springbootJPA.repository.UserRepository;


@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.findByNameContaining("Perry");
        System.out.println("Filtrando por nome");
        for(User u: users){
            System.out.println(u);
        }
    }

    private void insertUser(){
        User user = new User();
        user.setName("GABRIEL NUNES");
        user.setUsername("gabriel");
        user.setPassword("santos");
        repository.save(user);
        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }

}
