package com.walmart.graphql.component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.yaml.snakeyaml.tokens.Token.ID;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;


@Value

@Entity
@Table(name = "BANKACCOUNT")
@NoArgsConstructor(force = true)
public class BankAccount {
	
	
	String name;
	@Id
	String id;
	

}
