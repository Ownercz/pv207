package cz.lipovcan.buybread;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Supplier implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "SUPPLIER_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "SUPPLIER_ID_SEQ", name = "SUPPLIER_ID_GENERATOR")
	private java.lang.Long id;

	private java.lang.String supplier_name;

	@org.kie.api.definition.type.Description(value = "0 - less, 1 - same, 2 - more goods")
	private java.lang.Integer supplier_stats;

	private java.lang.Integer supplier_actual_amount;

	public Supplier() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getSupplier_name() {
		return this.supplier_name;
	}

	public void setSupplier_name(java.lang.String supplier_name) {
		this.supplier_name = supplier_name;
	}

	public java.lang.Integer getSupplier_stats() {
		return this.supplier_stats;
	}

	public void setSupplier_stats(java.lang.Integer supplier_stats) {
		this.supplier_stats = supplier_stats;
	}

	public java.lang.Integer getSupplier_actual_amount() {
		return this.supplier_actual_amount;
	}

	public void setSupplier_actual_amount(
			java.lang.Integer supplier_actual_amount) {
		this.supplier_actual_amount = supplier_actual_amount;
	}

	public Supplier(java.lang.Long id, java.lang.String supplier_name,
			java.lang.Integer supplier_stats,
			java.lang.Integer supplier_actual_amount) {
		this.id = id;
		this.supplier_name = supplier_name;
		this.supplier_stats = supplier_stats;
		this.supplier_actual_amount = supplier_actual_amount;
	}

}