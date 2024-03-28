package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.MyBookList;
import com.example.repository.MyBookRepository;

@Service
public class MyBookListService {

	private MyBookRepository mybook;

	public void saveMyBooks(MyBookList book) {
		mybook.save(book);
	}

	public List<MyBookList> getAllMyBooks() {
		return mybook.findAll();
	}

	public void deleteById(int id) {
		mybook.deleteById(id);
	}

}
