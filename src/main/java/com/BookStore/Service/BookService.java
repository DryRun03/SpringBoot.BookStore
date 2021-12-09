package com.BookStore.Service;

import com.BookStore.entities.*;
import java.util.List;
public interface BookService {
	public List<Book> getActionBook(); //GET All Action
	public List<Book> getSadBook(); //GET All Sad
	public List<Book> getRomanticBook(); //GET All Romantic
	
	public Book getActionId(long ActionId); //GET id Action
	public Book getSadId(long SadId); //GET id Sad
	public Book getRomanticId(long RomanticId); //GET id Romantic
	
	public Book addAction(Book action); //ADD Action
	public Book addSad(Book sad); //ADD Sad
	public Book addRomantic(Book romantic); //ADD Romantic
	
	public Book updateAction(Book action,long actionId);
	public Book updateSad(Book sad, long sadId);
	public Book updateRomantic(Book romantic, long romanticId);
	
	public Book deleteAction(Book action,long actionId);
	public Book deleteSad(Book sad, long sadId);
	public Book deleteRomantic(Book romantic, long romanticId);
}
