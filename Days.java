package guvi;
import java.util.Scanner;
public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s;
		Scanner s1=new Scanner(System.in);
System.out.println("enter your character");
s=s1.next();
switch(s)
{
case "monday" :
	System.out.println("true");
	break;
case "tuesday" :
	System.out.println("true");
	break;
case "wednesday" :
	System.out.println("true");
	break;
case "thrusday":
	System.out.println("true");
	break;
case "friday" :
	System.out.println("true");
	break;
case "saturday":
	System.out.println("true");
	break;
case "sunday" :
	System.out.println("false");
	break;
default:
	System.out.println("not valid");
	break;
}

}

}
