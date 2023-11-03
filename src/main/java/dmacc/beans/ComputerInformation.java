package dmacc.beans;

import jakarta.persistence.Embeddable;
import lombok.Data;

/**
 * @author Kenneth Nimmo - Knimmo CIS175 - Fall 2021 Oct 18, 2023
 */
@Embeddable
@Data
public class ComputerInformation {

	private String owner;
	private String userName;
	private String password;

	/**
	 * 
	 */
	public ComputerInformation() {
		super();
	}

	/**
	 * @param owner
	 * @param userName
	 * @param password
	 */
	public ComputerInformation(String owner, String userName, String password) {
		super();
		this.owner = owner;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "ComputerInformation [Computer Owner=" + owner + ", userName=" + userName + ", password=" + password + "]";
	}

}
