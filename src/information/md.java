package information;
import java.io.*;
import java.util.*;
public class md implements essentialfunc
{
	String username;
	String password;
	String Name;
	public md()
	{
		try(DataInputStream din = new DataInputStream(new FileInputStream("information/md.txt")))
		{
			String str = din.readLine();
			String delim = ",";
			StringTokenizer tok = new StringTokenizer(str, delim, true);
			int i=0;
			while(tok.hasMoreTokens())
			{
				String s = tok.nextToken();
				if(!s.equalsIgnoreCase(delim))
				{
					if(i==0) Name=s;
					else if(i==1) username=s;
					else if(i==2) password=s;
					i++;
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}
	public void add_employee(String n1,String n2, String n3,listofemployees ob)
	{
		employees a=new employees();
		a.set_name(n1);
		a.set_username(n2);
		a.set_password(n3);
		ob.add_employee(a);
	}
	public boolean isMatch(String name, String pass)
	{
		if(username.equals(name) && password.equals(pass)) return true;
		return false;
	}
	public boolean isMatch(String pass)
	{
		if(password.equals(pass)) return true;
		return false;
	}
	public void set_username(String name)
	{
		username=name;
	}
	public void set_password(String pass)
	{
		password = pass;
	}
	public String get_password()
	{
		return password;
	}
	public void set_name(String name)
	{
		Name=name;
	}
	public String get_name()
	{
		return Name;
	}
	public String get_username()
	{
		return username;
	}
	
}