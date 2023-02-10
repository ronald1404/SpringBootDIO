package dio.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("CREATING REMETENTE OBJECT");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com.br");
        remetente.setName("DIO");
        return remetente;
    }

}
