package management;

import java.util.Scanner;

public class Teams {
	StackManagement manage = new StackManagement();
	Scanner scanner = new Scanner(System.in);

	public void crm() {
		System.out.println("Thank You for Choosing Costomer relationShip Management\n");
		System.out.println("Press 1  to Conform ! \n press 0 to  < Back ");
		String option = scanner.next();
		switch (option) {
		case "1":
			System.out.println("Request Successfully Submitted");
			break;
		case "0":
			manage.reversCall();
		}

	}

	public void people() {
		System.out.println("Thank You for Choosing Zoho People");
		System.out.println("Press 1  to Conform ! \n press 0 to  < Back ");
		String option = scanner.next();
		switch (option) {
		case "1":
			System.out.println("Request Successfully Submitted");
			break;
		case "0":
			manage.reversCall();
		}
		return;
	}

	public void books() {
		System.out.println("Thank You for Choosing Zoho Books");
		System.out.println("Press 1  to Conform ! \n press 0 to  < Back ");
		String option = scanner.next();
		switch (option) {
		case "1":
			System.out.println("Request Successfully Submitted");
			break;
		case "0":
			manage.reversCall();
		}
		return;
	}

	public void desk() {
		System.out.println("Thank You for Choosing Zoho Desk");
		System.out.println("Press 1  to Conform ! \n press 0 to  < Back ");
		String option = scanner.next();
		switch (option) {
		case "1":
			System.out.println("Request Successfully Submitted");
			break;
		case "0":
			manage.reversCall();
		}
		return;
	}
}
