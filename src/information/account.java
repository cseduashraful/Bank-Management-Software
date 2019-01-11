package information;
public class account
{
	int account_number;
	int balance;
	String account_type;
	String nominee;
	public String owners[];
	public void set_account_number(int x)
	{
		account_number = x;
	}
	public void set_balance(int x)
	{
		balance = x;
	}
	public void set_account_type(String n)
	{
		account_type=n;
	}
	public void set_nominee(String n)
	{
		nominee=n;
	}
	public int get_account_number()
	{
		return account_number;
	}
	public String get_account_type()
	{
		return account_type;
	}
	public String get_nominee()
	{
		return nominee;
	}
	public int get_balance()
	{
		return balance;
	}
	public void set_owner(String ar[])
	{
		owners =ar;
	}
	public boolean isPossible(account ac1)
	{
		if(account_number==ac1.get_account_number()) return false;
		int i;
		if(owners.length != ac1.owners.length) return false;
		for(i=0;i<owners.length;i++)
		{
			int j;
			for(j=0;j<ac1.owners.length;j++)
			{
				if(owners[i].equals(ac1.owners[j]))
					break;
			}
			if(j==ac1.owners.length) return false;
		}
		System.out.println("hu hi");
		return true;
	}
	
}