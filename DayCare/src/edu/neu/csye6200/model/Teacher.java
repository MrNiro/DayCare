package edu.neu.csye6200.model;

public class Teacher extends Person {

	private double review;
	private long employeeId;
	private String emailId;

	/**
	 * 
	 * @param emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * 
	 * @param review
	 */
	public void setReview(double review) {
		this.review = review;
	}

	public double getReview() {
		return this.review;
	}

	/**
	 * 
	 * @param emplpyeeId
	 */
	public void setEmployeeId(long emplpyeeId) {
		this.employeeId = emplpyeeId;
	}

	public long getEmployeeId() {
		return this.employeeId;
	}

}