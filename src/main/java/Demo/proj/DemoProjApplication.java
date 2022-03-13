package Demo.proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("Demo.*")
@EntityScan("Demo.entity")
@EnableJpaRepositories("Demo.repository")
public class DemoProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjApplication.class, args);
	}

}
