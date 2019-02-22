package com.oakdemir.kafka.mlproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MlProducer implements CommandLineRunner {
	@Autowired
	private Sender sender;

	public static void main(String[] args) {
		SpringApplication.run(MlProducer.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		String data = "Spring Kafka Producer and Consumer Example";
		sender.send(data);
	}
}
