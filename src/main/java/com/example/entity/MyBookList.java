package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "MyBooks")
public class MyBookList {

	public MyBookList(Object id2, Object name2, Object author2, Object getprice) {
		// TODO Auto-generated constructor stub
	}

	@Id
	private int id;
	private String name;
	private String author;
	private String price;

}
