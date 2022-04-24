import java.io.BufferedWriter;
import java.io.FileWriter;

public class CharacterStreamWrite {
public static void main(String[] args) throws Exception {
	char ch[]= {'a','b','c'};
	int a= 455;
	FileWriter fw=new FileWriter("character_stream.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("hello world");
	bw.newLine();
	bw.write(ch);
	
	bw.flush();
	bw.close();
}
}
