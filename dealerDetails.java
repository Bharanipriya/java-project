import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="dealerDetails")
@Table(name="dealerDetails")
public class dealerDetails {

	@Column(name="dealer_username")
	private String dealer_username;
	@Column(name="dealer_name")
	private String dealer_name;
	@Id
	@Column(name="dealer_id")
	private Integer dealer_id;
	@Column(name="dealer_mailid")
	private String dealer_mailid;
	@Column(name="dealer_phonum")
	private String dealer_phonum;
	@Column(name="dealer_pincode")
	private String dealer_pincode;
	public dealerDetails() {
		super();
	}
	public String getDealer_username() {
		return dealer_username;
	}
	public void setDealer_username(String dealer_username) {
		this.dealer_username = dealer_username;
	}
	public String getDealer_name() {
		return dealer_name;
	}
	public void setDealer_name(String dealer_name) {
		this.dealer_name = dealer_name;
	}
	public Integer getDealer_id() {
		return dealer_id;
	}
	public void setDealer_id(Integer dealer_id) {
		this.dealer_id = dealer_id;
	}
	public String getDealer_mailid() {
		return dealer_mailid;
	}
	public void setDealer_mailid(String dealer_mailid) {
		this.dealer_mailid = dealer_mailid;
	}
	public String getDealer_phonum() {
		return dealer_phonum;
	}
	public void setDealer_phonum(String dealer_phonum) {
		this.dealer_phonum = dealer_phonum;
	}
	public String getDealer_pincode() {
		return dealer_pincode;
	}
	public void setDealer_pincode(String dealer_pincode) {
		this.dealer_pincode = dealer_pincode;
	}

	
}
