package bootcamp.springbootJPA;

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
        System.out.println("Hello World");
        User user = new User();
        user.setName("Perry");
        user.setUsername("Erryp");
        user.setPassword("1234443");
        repository.save(user);

        for(User u : repository.findAll()){
            System.out.println(u);
        }
    }

}
