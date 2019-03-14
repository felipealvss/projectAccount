package projectAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in); 
		
		System.out.print("Enter account number: ");
		int nmbAccount = read.nextInt();
		
		read.nextLine();
		
		System.out.print("Enter account holder: ");
		String nmAccount = read.nextLine();
		
		System.out.print("Is there an initial deposit? [y/n]? ");
		char value = read.next().charAt(0);
		
		// IF ELSE (DEPOSIT)
		Account ac1;
		if (value == 'y') {
			System.out.print("Enter initial deposit value: ");
			double vlAccount = read.nextDouble();
			
			ac1 = new Account(nmbAccount, nmAccount, vlAccount);
		} else {
			ac1 = new Account(nmbAccount, nmAccount);
		}
		
		System.out.printf("%nAccount data:%n");
		System.out.println(ac1.toString());
		System.out.printf("%n");
		
		System.out.print("Enter a deposit value: ");
		ac1.depositMoney(read.nextDouble());

		System.out.printf("Updated account data:%n");
		System.out.println(ac1.toString());
		System.out.printf("%n");
		
		System.out.print("Enter a withdraw value: ");
		ac1.takeMoney(read.nextDouble());
		
		System.out.printf("Updated account data:%n");
		System.out.println(ac1.toString());
		System.out.printf("%n");		
		
		read.close();
		
	}

}