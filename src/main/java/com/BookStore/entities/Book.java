package com.BookStore.entities;

public class Book {
	private long id;
	private String title;
	private float rating;	
	public Book(long id, String title, float rating) {
		super();
		this.id = id;
		this.title = title;
		this.rating = rating;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", rating=" + rating + "]";
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
