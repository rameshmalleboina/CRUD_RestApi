package in.ramesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ramesh.entity.Book;
import in.ramesh.repo.BookRepository;
@Service
public class BookServiceImpl implements BookService {
 @Autowired
	private BookRepository repository;

	@Override
	public String upsertBook(Book book) {
		repository.save(book);
		return"Sucess(Record inserted/updated";
		
		
	}

	@Override
	public List<Book> getAllBooks() {
		return repository.findAll();
		
	}

	@Override
	public String deleteBook(Integer bookId) {
		repository.deleteById(bookId);
		return "Book deleted" ;
	}

}
