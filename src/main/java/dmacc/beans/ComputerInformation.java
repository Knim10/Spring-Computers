package dmacc.beans;

import jakarta.persistence.Embeddable;

/**
 * @author Kenneth Nimmo - Knimmo CIS175 - Fall 2021 Oct 18, 2023
 */
@Embeddable
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

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ComputerInformation [Computer Owner=" + owner + ", userName=" + userName + ", password=" + password + "]";
	}

}
