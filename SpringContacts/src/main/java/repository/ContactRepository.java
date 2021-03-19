/**
 * @author Jaden Schuster - jdschuster
 * CIS175 - Spring 2021
 * Mar 18, 2021
 */
package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import beans.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
	
}
