import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="flavourDetails")
@Table(name="flavourDetails")
public class flavourDetails {
	
	@Id
	@Column(name="flavour_name")
	private String flavour_name;
	@Column(name="flavour_id")
	private Integer flavour_id;
	@Column(name="flavour_price")
	private Integer flavour_price;
	@Column(name="flavour_rating")
	private Integer flavour_rating;
	public flavourDetails() {
		super();
	}
	public String getFlavour_name() {
		return flavour_name;
	}
	public void setFlavour_name(String flavour_name) {
		this.flavour_name = flavour_name;
	}
	public Integer getFlavour_id() {
		return flavour_id;
	}
	public void setFlavour_id(Integer flavour_id) {
		this.flavour_id = flavour_id;
	}
	public Integer getFlavour_price() {
		return flavour_price;
	}
	public void setFlavour_price(Integer flavour_price) {
		this.flavour_price = flavour_price;
	}
	public Integer getFlavour_rating() {
		return flavour_rating;
	}
	public void setFlavour_rating(Integer flavour_rating) {
		this.flavour_rating = flavour_rating;
	}
	
	
}
