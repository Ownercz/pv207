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

    public Order() {
    }
    
    public Order(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getId() {
        return this.id;
    }
    
    public void setId(java.lang.Long id) {
        this.id = id;
    }




}