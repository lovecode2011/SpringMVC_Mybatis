package test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.booksales.model.Book;
import com.booksales.service.BookServiceI;

public class testModifybook {
	@Autowired
	BookServiceI bookService;
	
	@Test
	public String update(){
		
	Book book1 = bookService.selectBook(32);
	System.out.println(book1);
	book1.setAuthor("修改修改下");
	int i =bookService.updateBook(book1);
	Book book2 = bookService.selectBook(32);
	System.out.println(book2);
	System.out.println(i);
		return null;
		
	}
}
