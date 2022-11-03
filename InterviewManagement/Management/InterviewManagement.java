package management;
import java.util.Scanner;
public class InterviewManagement {
	
   public void interviewProccessing() {
	   Scanner scanner=new Scanner(System.in);
	   int size=Database.getInstanse().getNameList().size();
	   String name;
	  
		  name= Database.getInstanse().getNames();
		  System.out.println(name);
		  System.out.println(" 1 > selected  \n 2 > rejected");
		  String option=scanner.nextLine();
		  switch(option) {
		  case"1": Database.getInstanse().select(name);
			  break;
			  default: Database.getInstanse().addWaitingList(name);
		  }
		  
	  
   }
   public void showAllpeople() {
	   int i=1; 
	   for(String names:Database.getInstanse().getNameList()) {
		   System.out.println(i++ +" > "+names);
	   }
	   if(Database.getInstanse().getNameList().isEmpty()) {
		   System.out.println("No Data Found ! ");
	   }
   }
   public void showSelect() {
	   int i=1;
	   if(Database.getInstanse().getSelectedList().isEmpty()) {
		   System.out.println("No Data Found ! ");
	   }
	   for(String names:Database.getInstanse().getSelectedList()) {
		   System.out.println(i++ +" > "+names);
	   }
   }
   public void showWaitingList() {
	   int i=1; 
	   for(String names:Database.getInstanse().getWaitingList()) {
		   System.out.println(i++ +" > "+names);
	   }
	   if(Database.getInstanse().getWaitingList().isEmpty()) {
		   System.out.println("No Data Found ! ");
	   }
   }
   
}
