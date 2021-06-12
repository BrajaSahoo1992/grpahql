package com.walmart.graphql.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.tokens.Token.ID;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;

import graphql.servlet.GraphQLProvider;
import graphql.servlet.GraphQLQueryProvider;
import graphql.servlet.GraphQLRootObjectBuilder;

@Component
public class  BankAccountResolver implements GraphQLQueryResolver {
	
	@Autowired
	private BankAccountRepositories bankAccountRepositories;
	
	public BankAccount bankAccount(String id) {
		System.out.println("queryResolver");
		/*
		 * return
		 * BankAccount.builder().id(id).name("braja").address(Address.builder().city(
		 * "bhubaneswar").country("India")
		 * .state("Odisha").pin("754001").build()).build();
		 */
		
		/* return BankAccount.builder().id(id).name("braja").build(); */
		return bankAccountRepositories.getById(id);
	}
	 

}
