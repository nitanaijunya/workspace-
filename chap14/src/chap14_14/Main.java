package chap14_14;

public class Main {

	public static void main(String[] args) {
		Account a = new Account();
		a.accountNumber = "4649";
		a.balance = 1592;
		Account a2 = new Account();
		a2.accountNumber = " 4649";
		a2.balance = 8000;

		System.out.println(a);
		System.out.println(a2);
		System.out.println("上記の二つの口座が等価であるか:");
	}

}
