package checkpoint.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(apiInfo());
    }

    private Info apiInfo() {
        return new Info()
                .title("Checkpoint API")
                .description("API pour votre checkpoint")
                .version("1.0")
                .contact(apiContact())
                .license(apiLicence());
    }

    private License apiLicence() {
        return new License()
                .name("Unlicenced")
                .url("https://google.com");
    }

    private Contact apiContact() {
        return new Contact()
                .name("Wild Code School remote IDF")
                .email("nomail@wildcodeschool.com")
                .url("https://github.com/WildCodeSchool");
    }
}


