package com.miqueias.r.conf_servico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfServicoApplication{

	public static void main(String[] args) {
		SpringApplication.run(ConfServicoApplication.class, args);
	}

}
