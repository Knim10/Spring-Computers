package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Computer;

/**
 * @author Kenneth Nimmo - Knimmo
 * CIS175 - Fall 2021
 * Oct 18, 2023
 */
@Repository
public interface ComputerRepository extends JpaRepository<Computer, Long>{
	
}
