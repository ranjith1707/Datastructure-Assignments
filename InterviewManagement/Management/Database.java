package management;

import java.util.LinkedList;
import java.util.Queue;

public class Database {
	public static Database db;
	private Queue<String> nameList;
	private Queue<String> selected;
	private Queue<String> waitingList;
	
	private Database() {
		nameList=new LinkedList<String>();
		selected=new LinkedList<String>();
		waitingList=new LinkedList<String>();
	}
	
	
	public static Database getInstanse() {
		if(db==null) {
			db=new Database();
		}
		return db;
		
	}
	
	
	public void addNamelist(String name) {
		nameList.add(name);
	}
	public void select(String name) {
		selected.add(name);
	}
	public void addWaitingList(String name) {
		waitingList.add(name);
	}
	
   public Queue<String> getNameList(){
	   return nameList;
   }
   public Queue<String> getSelectedList(){
	   return selected;
   }
	public Queue<String> getWaitingList(){
		return waitingList;
	}
	public String getNames() {
	     String name= nameList.poll();
	     
	     nameList.add(waitingList.poll());
	     return name;
		
	}
	

	
		
}
