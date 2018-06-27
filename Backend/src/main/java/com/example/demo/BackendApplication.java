package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Product;
import com.example.demo.repositories.ProductRepository;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
		
	}
	
	public void run(String... args) throws Exception {
		
		productRepository.save(new Product("Serrucho", 140000));
		productRepository.save(new Product("Martillo", 100000));
		productRepository.save(new Product("Alargador", 15000));
		productRepository.save(new Product("Destornillador", 100000));

		
	}

	
	
}