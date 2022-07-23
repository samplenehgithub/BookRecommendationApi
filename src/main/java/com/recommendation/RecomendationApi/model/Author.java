package com.recommendation.RecomendationApi.model;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "author")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "author_id")
	private int authorId;

	//@Column(name = "author_name")
	private String authorName;
    
	@OneToMany(mappedBy = "author",cascade=CascadeType.ALL)
	//@JsonBackReference
	@JsonIgnoreProperties("author")
	private List<Book> books = new ArrayList<Book>();
    public Author() {
		
	}
	public Author(int authorId, String authorName, String category, List<Book> books) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.books = books;
	}



	
	public int getAuthorId() {
		return authorId;
	}



	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}



//	public List<Book> getBooks() {
//		return books;
//	}



	public void setBooks(List<Book> books) {
		this.books = books;
	}



	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	



	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", books="
				+ books + "]";
	}





}
