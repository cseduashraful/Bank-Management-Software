package information;
public class information implements essentialfunc
{
	private String name;
	private String address;
	private String telephone;
	private String email;
	private String username;
	private String password;
	public int ac[];
	public void set_ac(int ar[])
	{
		ac=ar;
	}
	public void add_account(int ac1)
	{
		int acc[]= new int[ac.length+1];
		int i;
		for(i=0;i<ac.length;i++)
		{
			acc[i]=ac[i];
		}
		acc[i]=ac1;
		ac=acc;
		
	}
	public void delete_a_account(int ac1)
	{
		int i,j=0;
		int tempac[] = new int[ac.length-1];
		for(i=0;i<ac.length;i++)
		{
			if(ac[i]!=ac1)
			{
				tempac[j]=ac[i];
				j++;
			}
			
		}
		ac = tempac;
		
	}
	public void set_password(String pass)
	{
		password = pass;
	}
	public void set_username(String name)
	{
		username=name;
	}
	
	public void set_name(String n)
	{
		name=n;
	}
	
	public String get_name()
	{
		return name;
	}
	
	public void set_address(String n)
	{
		address=n;
	}
	
	public String get_address()
	{
		return address;
	}
	public void set_telephone(String n)
	{
		telephone=n;
	}
	
	public String get_telephone()
	{
		return telephone;
	}
	public void set_email(String n)
	{
		email=n;
	}
	
	public String get_email()
	{
		return email;
	}
	public String get_password()
	{
		return password;
	}
	public boolean isMatch(String name, String pass)
	{
		if(username.equals(name) && password.equals(pass))
		return true;
		return false;
	}
	public boolean isMatch(String name)
	{
		if(username.equals(name))
		return true;
		return false;
	}
	public String get_username()
	{
		return username;
	}
}