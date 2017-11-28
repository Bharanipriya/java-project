import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="branchDetails")
@Table(name="branchDetails")
public class branchDetails {

	@Id
	@Column(name="branch_id")
	private Integer branch_id;
	@Column(name="branch_name")
	private String branch_name;
	@Column(name="branch_address")
	private String branch_address;
	public branchDetails() {
		super();
	}
	public Integer getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(Integer branch_id) {
		this.branch_id = branch_id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getBranch_address() {
		return branch_address;
	}
	public void setBranch_address(String branch_address) {
		this.branch_address = branch_address;
	}

	
}
