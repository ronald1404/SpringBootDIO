package dio.project.project;

import com.google.gson.Gson;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class Beans {
    @Bean
    public Gson gson(){
        return new Gson();
    }
}
