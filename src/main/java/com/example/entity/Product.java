package com.example.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productid;
	private String name;
	
	
	@ManyToMany
    @JoinTable(
        name="PRODUCT_CATEGORY",
        joinColumns=
            @JoinColumn(name="product_id", referencedColumnName="productid"),
        inverseJoinColumns=
            @JoinColumn(name="category_id", referencedColumnName="categoryid")
    )
	private Collection<Category> categories;

	public Collection<Category> getPlayers() {
		return categories;
	}

	public void setPlayers(Collection<Category> categories) {
		this.categories = categories;
	}
}
