import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name="cakesWithoutEggDetails")
@Table(name="cakesWithoutEggDetails")
public class cakesWithoutEgg {
	@Id
	@Column(name="product_name")
	private String product_name;
	@Column(name="product_id")
	private Integer product_id;
	@Column(name="product_price")
	private Integer product_price;
	@Column(name="product_rating")
	private Integer product_rating;
	
	public cakesWithoutEgg() {
		super();
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public Integer getProduct_price() {
		return product_price;
	}
	public void setProduct_price(Integer product_price) {
		this.product_price = product_price;
	}
	public Integer getProduct_rating() {
		return product_rating;
	}
	public void setProduct_rating(Integer product_rating) {
		this.product_rating = product_rating;
	}
	
	
}
