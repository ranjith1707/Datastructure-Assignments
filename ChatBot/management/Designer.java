package management;

import java.util.Scanner;

import database.chatbot.ChatBotDatabase;

public class Designer {
	Teams team = new Teams();

	public void designer() {
		System.out.println(" welcome to Designer portal");
		System.out
				.println("Select Teams \n 1 > CRM \n 2 > Peoples \n 3 > Books \n 4 > Desk  \n 0 < press 0 to Back ! ");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();
		StackManagement manage = new StackManagement();
		switch (option) {
		case "1":ChatBotDatabase.getInstants().addData("designer");
			team.crm();
			
			break;
		case "2":ChatBotDatabase.getInstants().addData("designer");
			team.people();
			
			break;
		case "3":ChatBotDatabase.getInstants().addData("designer");
			team.books();
			
			break;
		case "4":ChatBotDatabase.getInstants().addData("designer");
			team.desk();
			
			break;
		case "0":
			manage.reversCall();
			break;
		default:
			designer();
		}
	}
}
