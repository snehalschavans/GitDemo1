
public class StringReverse {

	public static void main(String[] args) {
		String org_s="snehal";
		String org_str=new String("Madam");
		String temp_str="";
		for(int i=org_str.length()-1;i>=0;i--)
		{
			temp_str=temp_str+org_str.charAt(i);
		}
		if(org_str.equalsIgnoreCase(temp_str))
		{
			System.out.println("String is palindrom!!!");
		}
		else
		{
			System.out.println("String is not Palindrom!!!");
		}
		
 System.out.println("Hi I am changed");
 System.out.println("Add no of changes");
 System.out.println("Please check");
	}

	}


