package cz.lipovcan.buybread;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.xml.bind.annotation.XmlRootElement
public class PromotionInventory implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private int daysToExpire;

	public PromotionInventory() {
	}

	public int getDaysToExpire() {
		return this.daysToExpire;
	}

	public void setDaysToExpire(int daysToExpire) {
		this.daysToExpire = daysToExpire;
	}

	public PromotionInventory(int daysToExpire) {
		this.daysToExpire = daysToExpire;
	}

}