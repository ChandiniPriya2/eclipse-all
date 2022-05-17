package ai.jobiak.iostreams;
import java.io.*;

public class FileToFile {
public static void main(String args[])throws IOException{
	FileInputStream source=null;
	FileOutputStream target=null;
	source=new FileInputStream("C:\\jobiak\\java\\Day15IoStreams\\src\\ai\\jobiak\\iostreams\\FileToConsole.java");
	target=new FileOutputStream("C:\\jobiak\\java\\Day15IoStreams\\src\\target.txt");
	int temp;
	while((temp=source.read())!=-1) {
		target.write((byte)temp);
		
	}

		if(source!=null)
			source.close();
		if(target!=null)
			target.close();

}
}
