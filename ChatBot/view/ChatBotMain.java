package view;

import database.chatbot.*;
import management.*;

import java.util.Scanner;

public class ChatBotMain {
	Developer develop = new Developer();
	Designer design = new Designer();
	WebDeveloper webDevelop = new WebDeveloper();

	public static void main(String[] args) {
		ChatBotMain chatBot = new ChatBotMain();

		chatBot.init();
	}

	public void init() {
		System.out.println(
				"Welcome To Jop Application portal \n 1 > Apply for Developer \n 2 > Apply for Designer \n 3 > Apply for Web Developer \n "
						+ "0 < press 0 to Back ! ");

		Scanner scanner = new Scanner(System.in);
		StackManagement manage = new StackManagement();
		String option = scanner.nextLine();
		switch (option) {
		case "1":
			ChatBotDatabase.getInstants().addData("init");
			
			develop.developer();
			break;
		case "2":
			ChatBotDatabase.getInstants().addData("init");
			
			design.designer();
			break;
		case "3":
			ChatBotDatabase.getInstants().addData("init");
			
			webDevelop.webDeveloper();
			break;
		case "0":
			manage.reversCall();
			break;
			default:init();
		}
	}

}
