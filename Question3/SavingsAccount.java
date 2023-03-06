import account.*;
public class SavingsAccount extends Account{
    String fixedDepositDetails;

    public String getfixedDepositDetails(){
        return fixedDepositDetails;
    }
    public double withdraw(double amount)
    {
        super.balance = super.balance-amount;
        return super.balance;
    }
    
    public double deposit(double amount){
        super.balance = super.balance+amount;
        return super.balance;
    }

     public void fixedDeposit(double amount, int yr){
        
        double finalAmount = ((amount*yr*5.5)/100) + amount;
        this.fixedDepositDetails = amount+"deposited for the timeperiod of"+yr+"years, and the final amount would be "+finalAmount;

      }
      public String toString() {
		return "SavingsAccount [accountNo=" + accountNo + ", Name=" + name + ", phoneNo=" + phoneNo + ", dateofbirth=" + dob
				+ ", address=" + address+ ", balance=" + balance +", fixedDepositDetails=" + fixedDepositDetails + "]";
	}
}
