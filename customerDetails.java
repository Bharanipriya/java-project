import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name="customerDetails")
@Table(name="customerDetails")
public class customerDetails {
	@Id
	@Column(name="cust_id")
	private Integer cust_id;
	@Column(name="cust_name")
	private String cust_name;
	@Column(name="cust_mailid")
	private String cust_mailid;
	@Column(name="cust_address")
	private String cust_address;
	@Column(name="cust_phonum")
	private Long cust_phonum;
	public customerDetails() {
		super();
	}
	public Integer getCust_id() {
		return cust_id;
	}
	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_mailid() {
		return cust_mailid;
	}
	public void setCust_mailid(String cust_mailid) {
		this.cust_mailid = cust_mailid;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public Long getCust_phonum() {
		return cust_phonum;
	}
	public void setCust_phonum(Long cust_phonum) {
		this.cust_phonum = cust_phonum;
	}

	  
    
}
