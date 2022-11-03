package management;

import view.*;

import database.chatbot.ChatBotDatabase;

public class StackManagement {
	public void reversCall() {
		if (!ChatBotDatabase.getInstants().status()) {
			String name = ChatBotDatabase.getInstants().removeData();
			System.out.println(name);
			methodCalling(name);

		} else {
			System.out.println("Thank You For Visiting");
		}
	}

	private void methodCalling(String methodName) {
		Developer develop = new Developer();
		Designer design = new Designer();
		ChatBotMain main = new ChatBotMain();
		WebDeveloper webDevelop = new WebDeveloper();
		System.out.println("method Name"+methodName);
		switch (methodName) {
		case "init":
			main.init();
			break;
		case "developer":
			develop.developer();
			break;
		case "designer":
			design.designer();
			break;
		case "webDeveloper":
			webDevelop.webDeveloper();
			break;

		}
	}
}
