package cz.lipovcan.buybread;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class cv_form implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String first_name;
	private java.lang.String last_name;
	private java.lang.String phone_number;
	private java.lang.Boolean is_qualified;

	public cv_form() {
	}

	public java.lang.String getFirst_name() {
		return this.first_name;
	}

	public void setFirst_name(java.lang.String first_name) {
		this.first_name = first_name;
	}

	public java.lang.String getLast_name() {
		return this.last_name;
	}

	public void setLast_name(java.lang.String last_name) {
		this.last_name = last_name;
	}

	public java.lang.String getPhone_number() {
		return this.phone_number;
	}

	public void setPhone_number(java.lang.String phone_number) {
		this.phone_number = phone_number;
	}

	public java.lang.Boolean getIs_qualified() {
		return this.is_qualified;
	}

	public void setIs_qualified(java.lang.Boolean is_qualified) {
		this.is_qualified = is_qualified;
	}

	public cv_form(java.lang.String first_name, java.lang.String last_name,
			java.lang.String phone_number, java.lang.Boolean is_qualified) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_number = phone_number;
		this.is_qualified = is_qualified;
	}

}