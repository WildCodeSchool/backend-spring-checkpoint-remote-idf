package checkpoint.spring.remote;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import checkpoint.spring.remote.repository.UserRepository;

@SpringBootApplication
public class RemoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemoteApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			repository.save(new User("Joe", "Start"));
			repository.save(new User("Baden", "Powell"));
		};
	}
}
