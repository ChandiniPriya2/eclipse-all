package ai.jobiak.services;
import ai.jobiak.exceptions.TransferException;
import ai.jobiak.exceptions.WithdrawException;

public interface AccountService {
public double withdraw(double amount)throws WithdrawException;
public double deposit(double amount);
public boolean transfer(Account account,double amount) throws TransferException;
public double getBalance(String actNo);
}
