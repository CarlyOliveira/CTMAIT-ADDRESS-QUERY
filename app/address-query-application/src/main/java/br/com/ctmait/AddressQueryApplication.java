package br.com.ctmait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AddressQueryApplication {
    public static void main(String[] args) {
        SpringApplication.run(AddressQueryApplication.class, args);

    }
}
