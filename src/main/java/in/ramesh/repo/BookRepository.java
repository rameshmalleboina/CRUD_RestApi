package in.ramesh.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ramesh.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {
	
	

}
