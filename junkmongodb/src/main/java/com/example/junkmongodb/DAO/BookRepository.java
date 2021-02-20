package com.example.junkmongodb.DAO;

import com.example.junkmongodb.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer> {

}
