package ai.jobiak.bank;
public class BankOfBaroda {
public static void main(String[] args) {
		AccountDetails account1=new AccountDetails("savings","john@gmail.com",6783938490L,"JohnDoe",5000);
		AccountDetails account2=new AccountDetails("Savings","johnson@gmail.com",456789903L,"Johnson",75000);
	AccountService service=account1;
		service.deposit(1000);
		System.out.println(account1.getFullName()+"  "+account1.getBalance());
        service =account2;
	try {
		System.out.println(service.withdraw(100000));
	} catch (WithdrawException e1) {
	
		System.out.println(e1);
	}
  service=account2;
	try {
		System.out.println(service.transfer(account1, 80000));
	}catch(TransferException e){
		System.out.println(e);
	}
}
}
