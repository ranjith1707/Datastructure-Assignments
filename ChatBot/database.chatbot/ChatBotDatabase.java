package database.chatbot;

import java.util.Stack;

public class ChatBotDatabase {
	private static ChatBotDatabase chatBotDb;
	private Stack<String> stackMemory;

	private ChatBotDatabase() {
		stackMemory = new Stack<String>();
	}

	static public ChatBotDatabase getInstants() {

		if (chatBotDb == null) {
			chatBotDb = new ChatBotDatabase();
		}
		return chatBotDb;
	}

	public void addData(String data) {
		stackMemory.push(data);
	}

	public String removeData() {
		
		return stackMemory.pop();
		
	}

	public boolean status() {
		return stackMemory.isEmpty();
	}

}
