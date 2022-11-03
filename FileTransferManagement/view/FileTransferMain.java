package view;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import management.FileTransactionManagement;

public class FileTransferMain {
	FileTransactionManagement transactio=new FileTransactionManagement();
	 public static void main(String[] args) {
		   FileTransferMain transfer=new FileTransferMain();
		   transfer.fileView();
	   }
	   
	   public void init() {
		   System.out.println("Welcome to Transaction Portel");
		   
	   }
	  
	   
	   
	   private void fileView() {
		   String folderPath="E:\\quizAssignment\\copyFrom";
		   File file=new File(folderPath);
		  File[] allFiles=file.listFiles();
		  String[] fileNames=file.list();
		  ArrayList<File> fileList=new ArrayList<File>();
		 Collections.addAll(fileList,allFiles);
		  for(String m:fileNames) {
			  System.out.println(m);
		  }
		  
		  transactio.arrangement(fileList,allFiles);
		  try {
			transactio.transaction(allFiles);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
}
