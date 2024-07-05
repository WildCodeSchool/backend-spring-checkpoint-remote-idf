package checkpoint.spring.remote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RemoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemoteApplication.class, args);
	}

	// @Bean
	// public CommandLineRunner demo(UserRepository repository) {
	// return (args) -> {
	// repository.save(new User("Joe", "Start"));
	// repository.save(new User("Baden", "Powell"));
	// };
	// }
}
