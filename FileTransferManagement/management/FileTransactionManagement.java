package management;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class FileTransactionManagement {

	Queue<Long> sizeofFiles = new PriorityQueue<Long>();

	public void transaction(File[] files) throws IOException {
		System.out.println(Arrays.toString(files));
		fileCreation("E:\\FileTransfer");
		
		
		
		
		String fileName;
//		for (int i = 0; i < files.length; i++) {
//
//			fileName = files[i].getName();
//			File newFile = new File("E:\\FileTransfer\\" + fileName);
//
//			System.out.println(newFile.createNewFile());
//			
//            
//		}

		try {
			for (int i = 0; i < files.length; i++) {

				FileReader read = new FileReader(files[i]);
				fileName = files[i].getName();

				System.out.println(fileName);
				File newFile = new File("E:\\FileTransfer\\" + fileName);

				System.out.println(newFile.createNewFile());
				FileWriter write = new FileWriter("E:\\FileTransfer\\" + fileName);

				BufferedReader bufferRead = new BufferedReader(read);
				BufferedWriter bufferWrite = new BufferedWriter(write);
				String line = bufferRead.readLine();
				String data="";
				while (line != null) {
//					bufferWrite.write(line);
//					
//					bufferWrite.newLine();	
					data+=line+"\n";
					line = bufferRead.readLine();
					
				}
				bufferWrite.write(data);
				bufferWrite.flush();
				//bufferRead.close();
				System.out.println(data);
				bufferWrite.close();
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void fileCreation(String path) {
		File creation = new File(path);
		if (!creation.exists()) {
			creation.mkdir();
		}

	}

	public void arrangement(ArrayList<File> files, File[] allfile) {
		int size = files.size();

		long max = 0;
		File file;
		for (int i = 0; i < size; i++) {
			file = files.get(i);
			sizeofFiles.add(file.length());
		}

		for (int i = 0; i < size; i++) {
			long min = sizeofFiles.remove();
			for (int j = 0; j < size; j++) {
				if (min == files.get(j).length()) {
					allfile[i] = files.get(j);
					files.remove(j);
					break;
				}
			}
		}

	}
}
