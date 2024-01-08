package in.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Book;
import in.ashokit.service.BookService;

@RestController
public class BookRestController {
	@Autowired
	private BookService service;
	@PostMapping("/book")
	public ResponseEntity<String> saveBook(@RequestBody Book book)
	{
		String msg=service.upstr(book);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	@GetMapping("/book")
	public ResponseEntity<List<Book>> getAllBooks()
	{
		List<Book> books=service.getAllBookDetails();
		return new ResponseEntity<>(books,HttpStatus.OK);
	}
	@PutMapping("/book")
	public ResponseEntity<String> updateBook(@RequestBody Book book)
	{
		String msg=service.upstr(book);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	@DeleteMapping("/book/{bookid}")
	public ResponseEntity<String> updateBook(@PathVariable Integer bookid)
	{
		String msg=service.delete(bookid);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}

}
