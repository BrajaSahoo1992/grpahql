package com.walmart.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import graphql.Scalars;
import graphql.language.FieldDefinition;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;

@SpringBootApplication
public class GraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}
	
	
	/*
	 * @Bean GraphQLSchema schema() {
	 * 
	 * return GraphQLSchema.newSchema() .query(GraphQLObjectType.newObject()
	 * .name("Query")
	 * 
	 * .field(field -> field .name("bankAccount")
	 * 
	 * 
	 * 
	 * 
	 * .type(Scalars.GraphQLString) .dataFetcher(environment -> "response") )
	 * .build()) .build(); }
	 */

}
