package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author Kenneth Nimmo - Knimmo CIS175 - Fall 2021 Oct 18, 2023
 */
@Entity
@Data
public class Computer {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private int numCores;
	private double storageSpace;
	@Autowired
	private ComputerInformation computerInfo;

	/**
	 * 
	 */
	public Computer() {
		// TODO Auto-generated constructor stub
		this.name = "Knim Desktop";
	}

	/**
	 * @param name
	 */
	public Computer(String name) {
		super();
		this.name = name;
	}

	/**
	 * @param name
	 * @param numCores
	 * @param storageSpace
	 */
	public Computer(String name, int numCores, double storageSpace) {
		super();
		this.name = name;
		this.numCores = numCores;
		this.storageSpace = storageSpace;
	}

	/**
	 * @param id
	 * @param name
	 * @param numCores
	 * @param storageSpace
	 */
	public Computer(long id, String name, int numCores, double storageSpace) {
		super();
		this.id = id;
		this.name = name;
		this.numCores = numCores;
		this.storageSpace = storageSpace;
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", name=" + name + ", Number of Cores=" + numCores + ", Storage Space in TB=" + storageSpace
				+ ", computerInfo=" + computerInfo + "]";
	}

}
