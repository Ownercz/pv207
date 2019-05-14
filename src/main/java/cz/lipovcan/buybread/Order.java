package cz.lipovcan.buybread;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Order implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "ORDER_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "ORDER_ID_SEQ", name = "ORDER_ID_GENERATOR")
	private java.lang.Long id;

	private float price;

	private java.lang.Boolean is_payed;

	private java.lang.String first_name;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private cz.lipovcan.buybread.Product product;

	public Order() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public java.lang.Boolean getIs_payed() {
		return this.is_payed;
	}

	public void setIs_payed(java.lang.Boolean is_payed) {
		this.is_payed = is_payed;
	}

	public java.lang.String getFirst_name() {
		return this.first_name;
	}

	public void setFirst_name(java.lang.String first_name) {
		this.first_name = first_name;
	}

	public cz.lipovcan.buybread.Product getProduct() {
		return this.product;
	}

	public void setProduct(cz.lipovcan.buybread.Product product) {
		this.product = product;
	}

	public Order(java.lang.Long id, float price, java.lang.Boolean is_payed,
			java.lang.String first_name, cz.lipovcan.buybread.Product product) {
		this.id = id;
		this.price = price;
		this.is_payed = is_payed;
		this.first_name = first_name;
		this.product = product;
	}

}