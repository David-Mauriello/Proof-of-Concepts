package com.example.featurecreep.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "roles")
public class Role {
	@Id
	public String id;
	
	private ERole name;
}
