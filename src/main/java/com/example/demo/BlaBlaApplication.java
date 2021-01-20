package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entities.Account;

import dao.EntityRepository;

@SpringBootApplication
public class BlaBlaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BlaBlaApplication.class, args);
		EntityRepository<Account> er = ctx.getBean(EntityRepository.class);
		// enter new Client names in DB
		er.save(new Account("Pera"));
		er.save(new Account("Zika"));
		er.save(new Account("Laza"));
		// Find all the clients and put in the acco list
		List<Account> acco = er.findAll();
		// printing the list
		for (Account a : acco) {
			System.out.print("Client name" + a.getClientName());
		}
		// search names par lettre
		List<Account> acco2 = er.findByName("%a%");
		// printing the list
		for (Account a : acco2) {
			System.out.print("Client name" + a.getClientName());
		}

	}
}
