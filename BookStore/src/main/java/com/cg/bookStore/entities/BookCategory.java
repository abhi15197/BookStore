package com.cg.bookStore.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
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
@Table(name="bookstore_book_category")
@DynamicInsert
@DynamicUpdate
public class BookCategory implements Serializable{

	private static final long serialVersionUID = 3709347784257171018L;

	@Id
	@Column(name="category_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="categoryIdGenerator")
	@SequenceGenerator(name="categoryIdGenerator", initialValue=100)
	private int categoryId;
	
	@Column(name="category_name")
	@Size(min=5, max=30)
	private String categoryName;
	
	@JsonIgnore
	@OneToMany(mappedBy = "category")
	private Set<BookInformation> book =new HashSet<>();

}
