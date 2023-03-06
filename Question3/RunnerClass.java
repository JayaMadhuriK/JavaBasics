
public class RunnerClass {
    public static void main(String args[]){
        
        SavingsAccount sav = new SavingsAccount();
        System.out.println("Account details:");
        sav.setAccountNo(12345678);
        sav.setName("Madhuri");
        sav.setPhoneNo(123);
        sav.setAddress("salur");
        sav.setDob("23-01-2001");
        sav.setBalance(10000);

        sav.accountHolder();

        System.out.println("deposit 1000 and withdraw 500");
        sav.deposit(1000);
        sav.withdraw(500);
        sav.getBalance();
        System.out.println("fixed deposit");
        sav.fixedDeposit(10000, 2);
        System.out.println(sav.getfixedDepositDetails());
        System.out.println("savings account details:");

        System.out.println(sav);

        System.out.println("\n\n");

        LoanAccount la = new LoanAccount();
        la.setAccountNo(123456789);
        la.setName("Madhuri");
        la.setPhoneNo(123);
        la.setAddress("salur");
        la.setDob("23-01-2001");
        la.setBalance(10000);
        la.setLimit(100000);
        la.setAvailableLimit(80000);

        la.accountHolder();

        System.out.println("EMI:");
        System.out.println(la.payEMI(500));
        System.out.println("Top up loan:");
        System.out.println(la.topUpLoan(5000));
        System.out.println("repayment:");
        System.out.println(la.repayment(1000));
        System.out.println("Loan account details:");

        System.out.println(la);

        System.out.println("\n\n");

        System.out.println("deleting savings account"+sav.accountNo);
        sav.closeAccount(sav);
    

     }
}
