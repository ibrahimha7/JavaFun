package com.example.demo.rep;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Book;

//For the list we need to use Util.list
import java.util.List;

@Repository
public interface BookRep extends CrudRepository<Book,Long> {
	List<Book> findAll();
    // this method finds books with descriptions containing the search string
    List<Book> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String search);
    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);
    
    //delete
   
    

}
