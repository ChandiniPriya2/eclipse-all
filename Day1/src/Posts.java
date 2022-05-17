import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Posts {
	@Setter
	@Getter
	 public String status;
	@Setter
	@Getter
	 private String msg;
	@Setter
	@Getter
	 public long no;
	@Setter
	@Getter
	 private long trxn;
	
		/*
		 * public String getMsg() { return msg; } public void setMsg(String msg) {
		 * this.msg = msg; } public long getTrxn() { return trxn; } public void
		 * setTrxn(long trxn) { this.trxn = trxn; }
		 * 
		 * 
		 */
	 
}

