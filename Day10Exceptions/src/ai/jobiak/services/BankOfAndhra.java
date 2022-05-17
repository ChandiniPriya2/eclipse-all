package ai.jobiak.services;

import ai.jobiak.exceptions.TransferException;
import ai.jobiak.exceptions.WithdrawException;

public class BankOfAndhra {

	public static void main(String[] args) {
		Account account1=new Account("101","JohnDoe",5000);
		Account account2=new Account("102","Johnson",75000);
		Account account3=new Account("103","David",25000);
		AccountService service=account1;
	System.out.println(	service.deposit(1000));
	service =account2;
	try {
		System.out.println(service.withdraw(100000));
	} catch (WithdrawException e1) {
	
		System.out.println(e1);
	}
	service=account3;
	
	System.out.println(account1.getFullName()+"  "+account1.getBalance());
	System.out.println(account3.getFullName()+"  "+account3.getBalance());
	try {
		System.out.println(service.transfer(account1, 26000));
	}catch(TransferException e){
		System.out.println(e);
	}
	
	

	}

}
