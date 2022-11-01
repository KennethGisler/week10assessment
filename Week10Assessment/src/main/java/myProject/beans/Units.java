package myProject.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Kenneth Gisler - kgisler@dmacc.edu
 * CIS171 22149
 * Nov 1, 2022
 */
@Entity
public class Units {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String type;
	private int cost;
	@Autowired
	private Stats stats;
	
	//constructors
	public Units() {
		super();
	}
	public Units(String name, String type, int cost, Stats stats) {
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.stats = stats;
	}
	public Units(String name, String type, int cost) {
		this.name = name;
		this.type = type;
		this.cost = cost;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getCost() {
		return cost;
	}
	public Stats getStats() {
		return stats;
	}
	public long getId() {
		return this.id;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public void setStats(Stats stats) {
		this.stats = stats;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	//methods
	@Override
	public String toString() {
		return "Units [id=" + id +", name=" + name + ", type=" + type + ", cost=" + cost + ", stats=" + stats + "]";
	}
	
}
