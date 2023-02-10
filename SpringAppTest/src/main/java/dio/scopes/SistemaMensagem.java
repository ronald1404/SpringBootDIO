package dio.scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente financeiro;
    public void sendRegisterConfirm(){
        System.out.println(noreply);
        System.out.println("Register confirmed");
    }
    public void welcomeMesagge(){
        financeiro.setEmail("tech@dio.com.br");
        System.out.println(financeiro);
        System.out.println("Bem vindo a tech elite");
    }
}
