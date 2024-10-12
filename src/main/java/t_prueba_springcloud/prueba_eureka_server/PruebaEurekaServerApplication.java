package t_prueba_springcloud.prueba_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class PruebaEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaEurekaServerApplication.class, args);
	}

}
