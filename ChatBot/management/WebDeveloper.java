package management;

import java.util.Scanner;

import database.chatbot.ChatBotDatabase;

public class WebDeveloper {
	Teams team = new Teams();

	public void webDeveloper() {
		System.out.println(" welcome to Designer portal");
		System.out.println("Select Teams \n 1 > CRM \n 2 > Peoples \n 3 > Books \n 4 > Desk \n 0 < press 0 to Back !");
		Scanner scanner = new Scanner(System.in);
		StackManagement manage = new StackManagement();
		String option = scanner.nextLine();
		switch (option) {
		case "1":ChatBotDatabase.getInstants().addData("webDeveloper");
			team.crm();
			
			break;
		case "2":ChatBotDatabase.getInstants().addData("webDeveloper");
			team.people();
			
			break;
		case "3":ChatBotDatabase.getInstants().addData("webDeveloper");
			team.books();
			
			break;
		case "4":ChatBotDatabase.getInstants().addData("webDeveloper");
			team.desk();
			
			break;
		case "0":
			manage.reversCall();
			break;
		default:
			webDeveloper();

		}
	}
}
