package ua.pp.kaeltas.pizzaorders.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Address {
	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	
	private String street;
	
	private String houseNumber;
	
	/*@OneToMany(mappedBy="address", cascade={CascadeType.ALL})
	private List<Order> orders;*/
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getHouseNumber() {
		return houseNumber;
	}
	
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	public Integer getId() {
		return id;
	}

	
}