import java.util.*;
import java.lang.*;
import java.io.*;
class JavaProgram
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1,n2,lcm;
      Scanner s=new Scanner(System.in);
      n1=s.nextInt();
      n2=s.nextInt();

        lcm = (n1 > n2) ? n1 : n2;


        while(true)
        {
            if( lcm % n1 == 0 && lcm % n2 == 0 )
            {
                System.out.println( lcm);
                break;
            }
            ++lcm;
        }
	}
}
