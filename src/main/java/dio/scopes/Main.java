package dio.scopes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    @Bean
    public CommandLineRunner run(SistemaMensagem sistema){
        return args -> {
          sistema.sendRegisterConfirm();
          sistema.welcomeMesagge();
          sistema.sendRegisterConfirm();
          sistema.welcomeMesagge();
          sistema.sendRegisterConfirm();
          sistema.welcomeMesagge();
        };
    }
}