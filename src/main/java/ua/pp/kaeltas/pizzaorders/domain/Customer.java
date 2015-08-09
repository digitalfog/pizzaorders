package ua.pp.kaeltas.pizzaorders.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	private String name;
	
	@OneToOne
	@JoinColumn(name="accumulativecard_id")
	private AccumulativeCard accumulativeCard;

	@OneToMany(mappedBy="customer")
	private List<Order> orders;
	
	public Customer() {
	}

	public Customer(String name) {
		this.name = name;
	}
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	
}
