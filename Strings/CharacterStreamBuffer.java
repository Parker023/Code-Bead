
import java.io.BufferedReader;
import java.io.FileReader;
public class CharacterStreamBuffer {

	public static void main(String[] args) throws Exception {
			FileReader fr=new FileReader("character_stream.txt");
			BufferedReader br=new BufferedReader(fr);
			String st="";
			while((st=br.readLine())!=null) {
				System.out.println(st);
			}
			br.close();fr.close();
	}
}
