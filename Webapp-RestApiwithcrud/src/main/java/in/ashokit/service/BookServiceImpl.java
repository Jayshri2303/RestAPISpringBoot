package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	private BookRepository repo;

	public BookServiceImpl(BookRepository repo) {
		this.repo = repo;
	}

	@Override
	public String upstr(Book book) {
		Integer BookId = book.getBookId();
		repo.save(book);
		if (BookId == null) {
			return "record inserted";
		} else {
			return "record updated";
		}
	}

	@Override
	public String delete(Integer bookid) {
		repo.deleteById(bookid);
		return "record deleted";
	}

	@Override
	public List<Book> getAllBookDetails() {
		return repo.findAll();
		
		
	}

}
