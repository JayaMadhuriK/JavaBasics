import account.*;
public class LoanAccount extends Account{
    double limit, availableLimit;

    public double getLimit(){
        return limit;
    }
    public double getAvailableLimit(){
        return availableLimit;
    }
    public void setLimit(double limit){
        this.limit = limit;
    }
    public void setAvailableLimit(double availableLimit){
        this.availableLimit = availableLimit;
    }

    public String payEMI(int amount){
        availableLimit = availableLimit+amount;
        return "amount paid"+amount;
    }

    public String topUpLoan(int amount){
        availableLimit = availableLimit+amount;
        limit = limit+amount;
        return "credit limit extended to "+limit;
    }

    public String repayment(int amount){
        availableLimit = availableLimit+amount;
        return "amount paid"+amount;
    }

    public String toString() {
		return "LoanAccount [accountNo=" + accountNo + ", Name=" + name + ", phoneNo=" + phoneNo + ", dateofbirth=" + dob
				+ ", address=" + address+ ", balance=" + balance +", LoanLimit=" + limit + ", AvailableLoanAmount=" + availableLimit +"]";
	}

}
