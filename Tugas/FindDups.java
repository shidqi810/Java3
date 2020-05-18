import java.util.*;

public class FindDups
{
	public static void main(String[] args)
	{
		//implementasi Set dalam Hash.
		Set<String> s = new HashSet<String>();
		for (String a : args) 

			if(!s.add(a))
				System.out.println("Duplikasi terdeteksi : " + a);

				System.out.println(s.size() + " yaitu kata : " + s);
			
		}
	}