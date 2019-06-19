package ac.yedam.prod;

public class ProductVo {
	private String produCode;
	private String produName;
	
	public String getProduCode() {
		return produCode;
	}
	public void setProduCode(String string) {
		this.produCode = string;
	}
	public String getProduName() {
		return produName;
	}
	public void setProduName(String produName) {
		this.produName = produName;
	}
	public ProductVo(String produCode, String produName) {
		super();
		this.produCode = produCode;
		this.produName = produName;
	}
	@Override
	public String toString() {
		return "ProductVo [produCode=" + produCode + ", produName=" + produName + "]";
	}
	
	
}

/*
	private int employeeId;
	private String firstName;
	private String lastName;
	private int salary;
	private String email;
	private String jobId;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String firstName, String lastName, int salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
*/