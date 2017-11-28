import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="orderDetails")
@Table(name="orderDetails")
public class orderDetails {

	@Id
	@Column(name="order_id")
	private String order_id;
	@Column(name="order")
	private String order;
	@Column(name="payment_type")
	private String payment_type;
	public orderDetails() {
		super();
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	
}
