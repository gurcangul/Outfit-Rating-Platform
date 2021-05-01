import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFeedback {
    private void writeToFile(String list) throws IOException{
///
              File f = new File("E:\\test1.txt");
              System.out.println(f);
              FileWriter fw = new FileWriter(f,true);
              System.out.println(fw);
              try{
                  BufferedWriter bw = new BufferedWriter(fw);
                  System.out.println(bw);
                  bw.newLine();
                  bw.write(list);
                  bw.flush();
                  bw.close();
              }
              catch(Exception e){
                  System.out.println(e);
              }
              ///
    }
    private void readFile(){
		File f = new File("E:\\test1.txt");
		try{
		  FileReader fr = new FileReader(f);
		  BufferedReader br = new BufferedReader(fr);
		  while(br.ready()){
			  System.out.println(br.readLine());
		  }
		}catch(Exception e){
			System.out.println(e);
		}
	}
}