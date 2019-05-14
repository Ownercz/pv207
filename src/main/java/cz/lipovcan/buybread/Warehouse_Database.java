package cz.lipovcan.buybread;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Warehouse_Database implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "WAREHOUSE_DATABASE_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "WAREHOUSE_DATABASE_ID_SEQ", name = "WAREHOUSE_DATABASE_ID_GENERATOR")
	private java.lang.Long id;

	private java.lang.Integer amount;

	public Warehouse_Database() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.Integer getAmount() {
		return this.amount;
	}

	public void setAmount(java.lang.Integer amount) {
		this.amount = amount;
	}

	public Warehouse_Database(java.lang.Long id, java.lang.Integer amount) {
		this.id = id;
		this.amount = amount;
	}

}