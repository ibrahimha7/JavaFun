package com.example.demo.services;

//For the list we need to use Util.list
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Book;
import com.example.demo.rep.BookRep;


@Service
public class BookService {
	
private final BookRep bookRep;
    
    public BookService(BookRep bookRep) {
        this.bookRep = bookRep;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRep.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRep.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRep.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
 // Update a book
    public Book updateBook(Long id, String title, String desc, String lang, Integer numberOfPages) {
		Optional<Book> optionalBook = bookRep.findById(id);
		  if(optionalBook.isPresent()) {
			  Book optionalBook1 = optionalBook.get();
			  optionalBook1.setTitle(title);
			  optionalBook1.setDescription(desc);
			  optionalBook1.setLanguage(lang);
			  optionalBook1.setNumberOfPages(numberOfPages);
			  return bookRep.save(optionalBook1);   
	        } else {
	            return null;
	        }
		
	}
    

 // delete a book
    public void deleteBook(Long id) {
        bookRep.deleteById(id);
    }
}
