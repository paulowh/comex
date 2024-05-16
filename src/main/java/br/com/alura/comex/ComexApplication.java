package br.com.alura.comex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComexApplication {
    public static void main(String[] args) {
        /*
        Configuração do Spring
        Em palavras de paulin, roda a aplicação web
        * */
        SpringApplication.run(ComexApplication.class, args);
    }
}
