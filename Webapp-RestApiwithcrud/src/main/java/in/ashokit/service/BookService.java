package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Book;

public interface BookService {
	public String upstr(Book book);
	public String delete(Integer bookid);
	public List<Book> getAllBookDetails();
	
}
