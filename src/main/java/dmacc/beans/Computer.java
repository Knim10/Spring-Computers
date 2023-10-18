package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Kenneth Nimmo - Knimmo CIS175 - Fall 2021 Oct 18, 2023
 */
@Entity
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

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
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
	 * @return the numCores
	 */
	public int getNumCores() {
		return numCores;
	}

	/**
	 * @param numCores the numCores to set
	 */
	public void setNumCores(int numCores) {
		this.numCores = numCores;
	}

	/**
	 * @return the storageSpace
	 */
	public double getStorageSpace() {
		return storageSpace;
	}

	/**
	 * @param storageSpace the storageSpace to set
	 */
	public void setStorageSpace(double storageSpace) {
		this.storageSpace = storageSpace;
	}

	/**
	 * @return the computerInfo
	 */
	public ComputerInformation getComputerInfo() {
		return computerInfo;
	}

	/**
	 * @param computerInfo the computerInfo to set
	 */
	public void setComputerInfo(ComputerInformation computerInfo) {
		this.computerInfo = computerInfo;
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", name=" + name + ", Number of Cores=" + numCores + ", Storage Space in TB=" + storageSpace
				+ ", computerInfo=" + computerInfo + "]";
	}

}
