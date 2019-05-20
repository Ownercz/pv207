package cz.lipovcan.buybread;

import org.hibernate.validator.constraints.NotBlank;
/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class CV implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "CV_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "CV_ID_SEQ", name = "CV_ID_GENERATOR")
	private java.lang.Long id;

	private java.lang.Boolean rejected;

	private java.lang.String first_name;

	private java.lang.String last_name;

	public CV() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.Boolean getRejected() {
		return this.rejected;
	}

	public void setRejected(java.lang.Boolean rejected) {
		this.rejected = rejected;
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

	public CV(java.lang.Long id, java.lang.Boolean rejected,
			java.lang.String first_name, java.lang.String last_name) {
		this.id = id;
		this.rejected = rejected;
		this.first_name = first_name;
		this.last_name = last_name;
	}

}