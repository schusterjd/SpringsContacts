/**
 * @author Jaden Schuster - jdschuster
 * CIS175 - Spring 2021
 * Mar 11, 2021
 */
package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String phone;
	private String relationship;
	@Autowired
	private Address address;

	public Contact() {
		
		super();
		this.relationship = "spouse";
		
	}

	public Contact(String name) {
		super();
		this.name = name;
	}

	public Contact(String name, String phone, String relationship) {
		super();
		this.name = name;
		this.phone = phone;
		this.relationship = relationship;
	}

	public Contact(int id, String name, String phone, String relationship) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.relationship = relationship;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the relationship
	 */
	public String getRelationship() {
		return relationship;
	}

	/**
	 * @param relationship the relationship to set
	 */
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", phone=" + phone + ", relationship=" + relationship
				+ ", address=" + address + "]";
	}

}
