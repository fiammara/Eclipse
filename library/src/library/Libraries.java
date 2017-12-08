package library;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.eisgroup.javaexam.library.Book;
import com.eisgroup.javaexam.library.Library;
import com.eisgroup.javaexam.library.test.BaseLibraryTest;

public class Libraries extends BaseLibraryTest implements Library {
	private List<Book> collect = new ArrayList<Book>();

	@Override
	protected Library getLibrary() {
		Library lib = new Libraries();

		// TODO Auto-generated method stub
		return lib;
	}

	@Override
	public List<Book> findByAuthor(String author) {
		List<Book> result = collect.stream().filter(c -> c.getAuthor() == author).collect(Collectors.toList());
		return result;
	}

	@Override
	public Book findByTitle(String title) {
		Book book = null;
		for (Book n : collect) {
			if (n.getTitle().equals(title)) {
				book = n;}
		}
		return book;
	}

	@Override
	public List<Book> getBooksSortedByPageCount() {
		Comparator<Book> comparator = new Comparator<Book>() {

			public int compare(Book o1, Book o2) {
				return o1.getPageCount() - o2.getPageCount();
			}
		};

		Collections.sort(collect, comparator);
		return collect;
	}

	@Override
	public int getNumberOfBooks() {
		return collect.size();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeABook(Book book) {
		// TODO Auto-generated method stub
		if (collect.contains(book) == false) {
			collect.add(book);
		}
	}

}
