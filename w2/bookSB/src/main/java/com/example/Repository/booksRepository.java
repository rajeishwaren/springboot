package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.books;

@Repository
public interface booksRepository extends JpaRepository<books,Integer>{

}
