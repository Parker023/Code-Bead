import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
          Scanner s= new Scanner(System.in);
          int v=s.nextInt();
          if(v>=18)
        	  System.out.println(v+" "+"candidate is eligible");
          else
        	  System.out.println(v+" "+"candidate is not eligible");
          s.close();
	}

}
