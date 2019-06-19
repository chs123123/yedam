package ac.yedam.prod;

public class InOutVo {
	private String p_code;
	private int txn_qty;
	private String date;
	
	public String getP_code() {
		return p_code;
	}
	public void setP_code(String p_code) {
		this.p_code = p_code;
	}
	public int getTxn_qty() {
		return txn_qty;
	}
	public void setTxn_qty(int txn_qty) {
		this.txn_qty = txn_qty;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "InOutVO [p_code=" + p_code + ", txn_qty=" + txn_qty + ", date=" + date + "]";
	}
	
	
	
}
