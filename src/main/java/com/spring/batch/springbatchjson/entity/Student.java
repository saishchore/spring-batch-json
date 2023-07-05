package com.spring.batch.springbatchjson.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
	
	private Long id;
    private String name;
    private String rollNumber;
}
