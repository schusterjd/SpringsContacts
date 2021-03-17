/**
 * @author Jaden Schuster - jdschuster
 * CIS175 - Spring 2021
 * Mar 11, 2021
 */

package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.sterotype.Repository;

import beans.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
