package ai.jobiak.bank;
import java.util.Random;
public class AccountDetails implements AccountService {
	private String actType;
	private String mailId;
	private Long mobile;
	private String fullName;
	private double balance;
	public AccountDetails(String actType,String mailId, Long mobile,String fullName, double balance) {
	    this.actType=actType;
		this.mailId=mailId;
		this.mobile=mobile;
		this.fullName = fullName;
		this.balance = balance;
	}
	Random random=new Random();
	Long actNo=random.nextLong();
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getActType() {
		return actType;
	}
	public void setActType(String actType) {
		this.actType = actType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double withdraw(double amount) throws WithdrawException {
		if(this.balance-amount<0) {
			throw new WithdrawException("insufficient funds to withdraw cash in"+this.actNo);
		}
		else {
		this.balance-=amount;
		}	return this.balance;
	}
	public double deposit(double amount) {
		this.balance+=amount;
		return this.balance;
	}
	public boolean transfer(AccountDetails account,double amount) throws TransferException {
		if(account.getBalance()>=amount) {
			this.balance-=amount;
		     account.setBalance(account.getBalance()+amount);
		
		}
		else {
			throw new TransferException("Insufficient funds to carryout transaction "+ account.actNo);
		}
		return true;
	}
}
