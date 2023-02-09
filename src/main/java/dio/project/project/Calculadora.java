package dio.project.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int soma(int a, int b){
        int i = a +b;
        return i;
    }
    public int subtrair(int a, int b){
        int i = a - b;
        return i;
    }
}
