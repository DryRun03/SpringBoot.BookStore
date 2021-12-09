package com.BookStore.Service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.BookStore.entities.*;
@Service
public class BookServiceImpl implements BookService {
		List<Book> actionList;
		List<Book> sadList;
		List<Book> romanticList;
		public BookServiceImpl() {
			actionList = new ArrayList<>();
			sadList = new ArrayList<>();
			romanticList = new ArrayList<>();
			
			actionList.add(new Book(1,"Marvels Avengers",4.5f));
			actionList.add(new Book(2,"Marvels IronMan", 4.3f));
			actionList.add(new Book(3,"DC's Suicide Squad",4.4f));
			actionList.add(new Book(4,"DC's Justice League",4.6f));
			
			sadList.add(new Book(1,"The fault in out Stars",4.2f));
			sadList.add(new Book(2,"When Breath becomes Air",3.9f));
			sadList.add(new Book(3,"The Diary of Anne Frank",3.8f));
			sadList.add(new Book(4,"Where the red ferns grows",4.4f));
			
			romanticList.add(new Book(1,"Red white and Royal Blue",4.0f ));
			romanticList.add(new Book(2,"The Fault in our Stars",4.2f));
			romanticList.add(new Book(3,"Call me by your Name",3.7f));			
		}
		@Override
		public List<Book> getSadBook() {
			return sadList;
		}
		@Override
		public List<Book> getActionBook() {
			return actionList;
		}
		@Override
		public List<Book> getRomanticBook() {
			return romanticList;
		}
		@Override
		public Book getActionId(long ActionId) {
			Book b = null;
			for(Book book:actionList) {
				if(book.getId()==ActionId) {
					b= book;
					break;
				}
			}
			return b;
			}
		@Override
		public Book getSadId(long SadId) {
			Book b = null;
			for(Book book:sadList) {
				if(book.getId()==SadId) {
					b= book;
					break;
				}
			}
			return b;
			}
		@Override
		public Book getRomanticId(long RomanticId) {
			Book b = null;
			for(Book book:romanticList) {
				if(book.getId()==RomanticId) {
					b= book;
					break;
				}
			}
			return b;
			}
		@Override
		public Book addAction(Book action) {
			actionList.add(action);
			return action;
		}
		@Override
		public Book addSad(Book sad) {
			sadList.add(sad);
			return sad;
		}
		@Override
		public Book addRomantic(Book romantic) {
			romanticList.add(romantic);
			return romantic;
		}
		@Override
		public Book updateAction(Book action, long actionId) {
			Book b = null;
			for(Book book:actionList) {
				if(book.getId()==actionId) {
					b = book;
					actionList.remove(b);
					actionList.add(book);
				}
			}
			return null;
		}
		@Override
		public Book updateSad(Book sad, long sadId) {
			Book b = null;
			for(Book book:sadList) {
				if(book.getId()==sadId) {
					b = book;
					sadList.remove(b);
					sadList.add(book);
				}
			}
			return null;
		}
		@Override
		public Book updateRomantic(Book romantic, long romanticId) {
			Book b = null;
			for(Book book:romanticList) {
				if(book.getId()==romanticId) {
					b = book;
					romanticList.remove(b);
					romanticList.add(book);
				}
			}
			return null;
		}
		@Override
		public Book deleteAction(Book action, long actionId) {
			Book b = null;
			for(Book book:actionList) {
				if(book.getId()==actionId) {
					b = book;
					actionList.remove(b);
				}
			}
			return null;
		}
		@Override
		public Book deleteSad(Book sad, long sadId) {
			Book b = null;
			for(Book book:sadList) {
				if(book.getId()==sadId) {
					b = book;
					sadList.remove(b);
				}
			}
			return null;
		}
		@Override
		public Book deleteRomantic(Book romantic, long romanticId) {
			Book b = null;
			for(Book book:romanticList) {
				if(book.getId()==romanticId) {
					b = book;
					romanticList.remove(b);
				}
			}
			return null;
		}
}