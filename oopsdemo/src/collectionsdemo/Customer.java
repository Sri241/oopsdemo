package collectionsdemo;

import java.util.Objects;

public class Customer {

	private long id;
    private String name;
    private String city;
    
 //generate constructor using fields   
	public Customer(long id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
//generate source from hascode & equals method
	@Override
	public int hashCode() {
		return Objects.hash(city, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(city, other.city) && id == other.id && Objects.equals(name, other.name);
	}
//generate tostring methods
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
//generate getters
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}
	
	
    
	
    
}
