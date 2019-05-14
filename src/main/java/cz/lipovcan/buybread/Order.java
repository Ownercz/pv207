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

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	private cz.lipovcan.buybread.product item;

	private float total_price;

	private java.lang.String first_name;

	private java.lang.String last_Name;

	private java.lang.String address;

	private int phone_number;

	private java.lang.String email;

	@org.kie.api.definition.type.Description(value = "Is payed beforehand?")
	private java.lang.Boolean payed;

	public Order() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public cz.lipovcan.buybread.product getItem() {
		return this.item;
	}

	public void setItem(cz.lipovcan.buybread.product item) {
		this.item = item;
	}

	public float getTotal_price() {
		return this.total_price;
	}

	public void setTotal_price(float total_price) {
		this.total_price = total_price;
	}

	public java.lang.String getFirst_name() {
		return this.first_name;
	}

	public void setFirst_name(java.lang.String first_name) {
		this.first_name = first_name;
	}

	public java.lang.String getLast_Name() {
		return this.last_Name;
	}

	public void setLast_Name(java.lang.String last_Name) {
		this.last_Name = last_Name;
	}

	public java.lang.String getAddress() {
		return this.address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public int getPhone_number() {
		return this.phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.Boolean getPayed() {
		return this.payed;
	}

	public void setPayed(java.lang.Boolean payed) {
		this.payed = payed;
	}

	public Order(java.lang.Long id, cz.lipovcan.buybread.product item,
			float total_price, java.lang.String first_name,
			java.lang.String last_Name, java.lang.String address,
			int phone_number, java.lang.String email, java.lang.Boolean payed) {
		this.id = id;
		this.item = item;
		this.total_price = total_price;
		this.first_name = first_name;
		this.last_Name = last_Name;
		this.address = address;
		this.phone_number = phone_number;
		this.email = email;
		this.payed = payed;
	}

}