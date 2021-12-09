package com.BookStore.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.BookStore.Service.BookService;
import com.BookStore.entities.Book;

@RestController
public class MyController {
	@Autowired
	private BookService Bookservice;
	
	//Home Page.
	@GetMapping("/home")
	public String home() {
		return "Welcome to the book store.";
	}
	
	//Genre info.
	@GetMapping("/genre")
	public String genre() {
		return 	"We have many books of Multiple Genres. \n"
				+ "1. Action\n"
				+ "2. Sad\n"
				+ "3. Romantic.";
	}
	//Genre -> Action. //Get All
	@GetMapping("/genre/Action")
	public List<Book> getActionBooks(){
		return this.Bookservice.getActionBook();
	}
	
	//Genre -> Sad. //Get All
	@GetMapping("/genre/Sad")
	public List<Book> getSadBooks(){
		return this.Bookservice.getSadBook();
	}
	
	//Genre -> Romantic. //Get All
	@GetMapping("genre/Romantic")
	public List<Book> getRomanticBooks(){
		return this.Bookservice.getRomanticBook();
	}
	
	//Genre -> Action. //Get Id
	@GetMapping("/Action/{ActionId}")
	public Book getActionId(@PathVariable String ActionId) {
		return this.Bookservice.getActionId(Long.parseLong(ActionId));
	}
	
	//Genre -> Sad. //Get Id
	@GetMapping("/Sad/{SadId}")
	public Book getSadId(@PathVariable String SadId) {
		return this.Bookservice.getSadId(Long.parseLong(SadId));
	}
	
	//Genre -> Romantic. //Get Id
	@GetMapping("/Romantic/{RomanticId}")
	public Book getRomanticId(@PathVariable String RomanticId) {
		return this.Bookservice.getRomanticId(Long.parseLong(RomanticId));
	}
	
	//Genre -> Action //Add new
	@PostMapping("/Action")
	public Book addAction(@RequestBody Book action) {
		return this.Bookservice.addAction(action);
	}
	
	//Genre-> Sad //Add new
	@PostMapping("/Sad")
	public Book addSad(@RequestBody Book sad) {
		return this.Bookservice.addSad(sad);
	}
	//Genre-> Romantic // Add new
	@PostMapping("/Romantic")
	public Book addromatic(@RequestBody Book romantic) {
		return this.Bookservice.addRomantic(romantic);
	}
	//Genre-> Action //Update
	@PutMapping("/Action/{actionId}")
	public Book updateAction(@RequestBody Book action,@PathVariable String actionId) {
		return this.Bookservice.updateAction(action,Long.parseLong(actionId)); 
	}	
	
	//Genre-> Sad //Update
	@PutMapping("/Sad/{sadId}")
	public Book updateSad(@RequestBody Book sad,@PathVariable String sadId) {
		return this.Bookservice.updateSad(sad,Long.parseLong(sadId)); 
	}
	
	//Genre-> Romantic //Update
	@PutMapping("/Romantic/{romanticId}")
	public Book updateRomantic(@RequestBody Book romantic,@PathVariable String romanticId) {
		return this.Bookservice.updateRomantic(romantic,Long.parseLong(romanticId)); 
	}
	
	//Genre-> Action //Delete
	@DeleteMapping("/Action/{actionId}")
	public Book deleteAction(@RequestBody Book action,@PathVariable String actionId) {
		return this.Bookservice.deleteAction(action, Long.parseLong(actionId));
	}
	
	//Genre-> Sad //Delete
	@DeleteMapping("/Sad/{sadId}")
	public Book deleteSad(@RequestBody Book sad,@PathVariable String sadId) {
	return this.Bookservice.deleteSad(sad, Long.parseLong(sadId));
	}
	
	//Genre-> Romantic //Delete
	@DeleteMapping("/Romantic/{romanticId}")
	public Book deleteRomantic(@RequestBody Book romantic,@PathVariable String romanticId) {
	return this.Bookservice.deleteRomantic(romantic, Long.parseLong(romanticId));
	}
	
}
