import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="cardDetails")
@Table(name="cardDetails")
public class cardDetails {
	@Column(name="card_holder")
	private String card_holder;
	@Id
	@Column(name="card_num")
	private Integer card_num;
	@Column(name="expiry_date")
	private String expiry_date;
	public cardDetails() {
		super();
	}
	public String getCard_holder() {
		return card_holder;
	}
	public void setCard_holder(String card_holder) {
		this.card_holder = card_holder;
	}
	public Integer getCard_num() {
		return card_num;
	}
	public void setCard_num(Integer card_num) {
		this.card_num = card_num;
	}
	public String getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}
}
