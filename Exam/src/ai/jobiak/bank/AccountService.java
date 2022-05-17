package ai.jobiak.bank;

public interface AccountService {
public double withdraw(double amount)throws WithdrawException;
public double deposit(double amount);
public boolean transfer(AccountDetails account,double amount) throws TransferException;

}
