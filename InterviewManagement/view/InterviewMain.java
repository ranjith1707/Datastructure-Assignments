package view;
import management.*;     
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class InterviewMain {
	//Queue<String> nameList=new LinkedList<String>();
   public static void main(String[] args) {
	   InterviewMain interview=new InterviewMain();
	   interview.init();
   }
   
   
   public void init() {
	   System.out.println("Welcome To Zoho Interview portel");
	   dataCollection();
	   view();
	   
	   
   }
   
   
   private void dataCollection() {
	   Scanner scanner=new Scanner(System.in);
	   String name;
	   for(int i=1; i<7; i++) {
		   System.out.print("Enetr Your Name : ");
		 Database.getInstanse().addNamelist(scanner.nextLine());
	   }
	   for(int i=1; i<=5; i++) {
		   System.out.print("Enter The Name : ");
		   Database.getInstanse().addWaitingList(scanner.nextLine());
	   }
   }
   
   public void view() {
	   InterviewManagement proccesing=new InterviewManagement();
	   System.out.println(" 1 > View Selected Canditate \n 2 > view Waiting List \n 3 > interview Process \n 4 > show Remaining Candidates \n 5 > Exid");
	   Scanner scanner=new Scanner(System.in);
	   String option=scanner.nextLine();
	   switch(option) {
	   case"1":proccesing.showSelect();
	   break;
	   case"2":proccesing.showWaitingList();
	   break;
	   case"3":proccesing.interviewProccessing();
	   break;
	   case"4":proccesing.showAllpeople();
		   break;
	   case"5":
	   }
	   if(!option.equals("5")) {
	   view();
	   }
   }
}
