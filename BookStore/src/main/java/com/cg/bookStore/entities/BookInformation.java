package com.cg.bookStore.entities;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="bookstore_book")
@DynamicInsert
@DynamicUpdate
public class BookInformation implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8166273208411036037L;

	@Id
	@Column(name="book_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="bookIdGenerator")
	@SequenceGenerator(name="bookIdGenerator", initialValue=1000)
	private int bookId;
	
	@Column(name="title")
	@Size(min=10, max=128)
	private String title;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="category_id")
	@NotNull
	private BookCategory category;
	
	@Column(name="author")
	@Size(min=5, max= 64)
	private String author;
	
	@Column(name="description")
	@Size(min=200, max=2000)
	private String description;
	
	@Column(name="isbn_number")
	@Size(min=10, max=15)
	private String isbnNumber;
	
	@Column(name="publish_date")
	private LocalDate publishDate;
	
	@Column(name="last_update_time")
	private LocalDate lastUpdateTime;
	
	@Column(name="copies_sold")
	private int copies_sold;
	
	@Column(name="price")
	private float price;
}
