package com.walmart.graphql.component;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Address {
	String city;
	String state;
	String country;
	String pin;
	

}
