package information;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.StringTokenizer;

public class listofinformation  implements fileworks
{
	public information information_array[];
	
	
	public listofinformation()
	{
		information_array = new information[0];
		try(DataInputStream din = new DataInputStream(new FileInputStream("information/clients.txt")))
		{
			String str = din.readLine();
			String delim = "#";
			StringTokenizer tok = new StringTokenizer(str, delim, true);
			int i=0;
			String N=null,A=null, T=null,E=null,U=null, P=null,NA=null;
			while(tok.hasMoreTokens())
			{
				String s = tok.nextToken();
				if(!s.equalsIgnoreCase(delim))
				{
					//System.out.println(s);
					if(i%7==0) N=s;
					else if(i%7==1) A=s;
					else if(i%7==2) T=s;
					else if(i%7==3) E=s;
					else if(i%7==4) U=s;
					else if(i%7==5) P=s;
					else if(i%7==6)
					{
						NA=s;
						int intna=Integer.parseInt(NA);
						information inf = new information();
						inf.set_name(N);
						inf.set_address(A);
						inf.set_telephone(T);
						inf.set_email(E);
						inf.set_username(U);
						inf.set_password(P);
						int ar[]= new int[intna];
						for(int j=0;j<intna;)
						{
							String sk = tok.nextToken();
							if(!sk.equals(delim))
							{
								int num = Integer.parseInt(sk);
								ar[j]=num;
								j++;
							}
						}
						inf.set_ac(ar);
						add_a_client(inf);
					}
					i++;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Not found");
		}
		
	}
	public void add_a_client(information ob)
	{
		information temp[] = new information[information_array.length+1];
		int i;
		for(i=0;i<information_array.length;i++)
		{
			temp[i]=information_array[i];
		}
		temp[i]=ob;
		information_array=temp;
		writeinfile();
	}
	public void delete_a_client(information inf)
	{
		int i,j=0;
		information temp[] = new information[information_array.length-1];
		for(i=0;i<information_array.length;i++)
		{
			if(information_array[i]!=inf)
			{
				temp[j] = information_array[i];
				j++;
			}
		}
		information_array=temp;
	}
	public void delete_account(String unam, int acnam)
	{
		int i;
		for(i=0;i<information_array.length;i++)
		{
			if(information_array[i].isMatch(unam))
			{
				information_array[i].delete_a_account(acnam);
				break;
			}
		}
		if(information_array[i].ac.length==0)
		{
			System.out.println("hu hu");
			delete_a_client(information_array[i]);
		}
		writeinfile();
	}
	public void writeinfile()
	{
		int i;
		String s="";
		for(i=0;i<information_array.length;i++)
		{
			
			s=s+information_array[i].get_name()+"#"+information_array[i].get_address()+"#"+information_array[i].get_telephone()+"#";
			s=s+information_array[i].get_email()+"#"+information_array[i].get_username()+"#"+information_array[i].get_password()+"#";
			s=s+information_array[i].ac.length+"#";
			int j;
			for(j=0;j<information_array[i].ac.length;j++)
			{
				s=s+information_array[i].ac[j]+"#";
			}
		}
		byte buf[] = s.getBytes();
		FileOutputStream file = null;
		try
		{
			file = new FileOutputStream("information/clients.txt");
			file.write(buf);
		}
		catch(Exception e)
		{
			
		}
	}
	
}