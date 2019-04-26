

// Question 3
// total: 10 points

//===============================================
// todo: complete the following program
//===============================================

public class CheckingAccount extends Account{

    CheckingAccount() {
        super();
    }
    CheckingAccount(int id, double balance) {
        super(id,balance);
    }

    @Override
    public void withdraw(double amt) {
        super.setBalance(getBalance()-amt);
        if(super.getBalance()<-5000) {
            System.out.println("over limit");
            super.setBalance(-5000);
        }

    }


}




//===============================================
// test case
//===============================================

/*

Input:

public class TestCheckingAccount {

	public static void main(String[] args) {

		CheckingAccount myCheckAcc = new CheckingAccount(1024, 8000.0);
		myCheckAcc.deposit(2000);
		myCheckAcc.withdraw(15000);

		System.out.println(myCheckAcc.getBalance());
		myCheckAcc.withdraw(200);
		System.out.println(myCheckAcc.getBalance());	
		myCheckAcc.deposit(7000);
		myCheckAcc.withdraw(200);
		System.out.println(myCheckAcc.getBalance());		
	}

}


Expected Output: 

-5000.0
over limit
-5000.0
1800.0
*/

