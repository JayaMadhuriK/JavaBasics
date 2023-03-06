package account;
public class Account{
    public int accountNo,phoneNo;
    public String name, address, dob;
    public double balance;
    public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

    public Account() {
    }

    public Account(int accountNo, int phoneNo, String name, String address, String dob, double balance) {
        this.accountNo = accountNo;
        this.phoneNo = phoneNo;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.balance = balance;
    }

    public void accountHolder(){
        System.out.println("Account Number:"+accountNo);
        System.out.println("Phone Number:"+phoneNo);
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Date of Birth:"+dob);
        System.out.println("Balance:"+balance);
      
    }

    public void closeAccount(Account a){
        
            a=null;
            System.out.println("Account Closed");
         
    }
        
      
        
}

