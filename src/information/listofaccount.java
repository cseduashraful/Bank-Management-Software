package information;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.StringTokenizer;

public class listofaccount implements fileworks
{
	public account account_array[];
	public listofaccount()
	{
		account_array=new account[0];
		try(DataInputStream din = new DataInputStream(new FileInputStream("information/accounts.txt")))
		{
			String str = din.readLine();
			String delim = ",";
			StringTokenizer tok = new StringTokenizer(str, delim, true);
			int i=0;
			String num=null,bal=null,type=null,nu=null,nom=null;
			while(tok.hasMoreTokens())
			{
				String s = tok.nextToken();
				if(!s.equalsIgnoreCase(delim))
				{
					//System.out.println(s);
					if(i%5==0) num=s;
					else if(i%5==1) bal=s;
					else if(i%5==2) type=s;
					else if(i%5==3) nom=s;
					else if(i%5==4)
					{
						nu=s;
						int intna=Integer.parseInt(nu);
						account inf = new account();
						inf.set_account_number(Integer.parseInt(num));
						inf.set_balance(Integer.parseInt(bal));
						inf.set_account_type(type);
						String ar[]= new String[intna];
						for(int j=0;j<intna;)
						{
							String sk = tok.nextToken();
							if(!sk.equals(delim))
							{
								ar[j]=sk;
								j++;
							}
						}
						inf.set_owner(ar);
						inf.set_nominee(nom);
						add_an_account(inf);
					}
					i++;
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}
	public void add_an_account(account ac1)
	{
		account acc[]= new account[account_array.length+1];
		int i;
		for(i=0;i<account_array.length;i++)
		{
			acc[i]=account_array[i];
		}
		acc[i]=ac1;
		account_array=acc;
		writeinfile();
	}
	public account return_account(int ac1)
	{
		int i;
		for(i=0;i<account_array.length;i++)
		{
			if(ac1==account_array[i].get_account_number()) return account_array[i];
		}
		return null;
	}
	public String balance_transfer(int ac1, int ac2, int amount, String unam)
	{
		account a1, a2;
		a1 = return_account(ac1);
		a2 = return_account(ac2);
		if(a1==null && a2==null) return "Recheck account numbers";
		if(a1==null) return "Recheck account number "+ac1;
		int i;
		for(i=0;i<a1.owners.length;i++)
		{
			if(a1.owners[i].equals(unam)) break;
		}
		if(i==a1.owners.length) return "You are not owner of "+ac1;
		if(a2==null) return "Recheck account number "+ac2;
		int bal = a1.get_balance()-amount;
		if(bal<500) return "Not possible to transfer "+amount+" taka.";
		a2.set_balance(a2.get_balance()+amount);
		a1.set_balance(bal);
		writeinfile();
		return "balance transfered successfully";
	}
	public String deposit_money(int ac1, int amount, String unam)
	{
		account a1 = return_account(ac1);
		if(a1==null) return "Check Your Account Number";
		int i;
		for(i=0;i<a1.owners.length;i++)
		{
			if(a1.owners[i].equals(unam)) break;
		}
		if(i==a1.owners.length) return "You are not owner of "+ac1;
		a1.set_balance(a1.get_balance()+amount);
		writeinfile();
		return "Tk."+amount+" deposited successfully";
	}
	public String withdraw_money(int ac1, int amount, String unam)
	{
		account a1 = return_account(ac1);
		if(a1==null) return "Check Your Account Number";
		int i;
		for(i=0;i<a1.owners.length;i++)
		{
			if(a1.owners[i].equals(unam)) break;
		}
		if(i==a1.owners.length) return "You are not owner of "+ac1;
		int bal = a1.get_balance()-amount;
		if(bal<500) return "Your account balance is too low to withdraw Tk."+amount;
		a1.set_balance(bal);
		writeinfile();
		return "Receive Your Money.Amount Tk."+amount;
	}
	public String show_balance(int ac1, String unam)
	{
		account a1 = return_account(ac1);
		if(a1==null) return "Check Your Account Number";
		int i;
		for(i=0;i<a1.owners.length;i++)
		{
			if(a1.owners[i].equals(unam)) break;
		}
		if(i==a1.owners.length) return "You are not owner of "+ac1;
		double m;
		int mm;
		String s= "Your account balance is Tk. "+a1.get_balance()+". Interest/year for this account ";
		if(a1.get_account_type().equals("savings"))  m= a1.get_balance()*0.5;
		else m=a1.get_balance()*0.025;
		mm=(int)m;
		return s+m;
	}
	public void delete_an_account(account ac1)
	{
		int i,j=0;
		account tempac[] =  new account[account_array.length-1];
		for(i=0;i<account_array.length;i++)
		{
			if(account_array[i]!=ac1)
			{
				tempac[j]=account_array[i];
				j++;
			}
		}
		account_array=tempac;
		writeinfile();
	}
	public void writeinfile()
	{
		int i;
		String s="";
		for(i=0;i<account_array.length;i++)
		{
			s=s+account_array[i].account_number+","+account_array[i].balance+","+account_array[i].account_type+",";
			s=s+account_array[i].nominee+","+account_array[i].owners.length+",";
			int j;
			for(j=0;j<account_array[i].owners.length;j++)
			{
				s=s+account_array[i].owners[j]+",";
			}
		}
		byte buf[] = s.getBytes();
		FileOutputStream file = null;
		try
		{
			file = new FileOutputStream("information/accounts.txt");
			file.write(buf);
		}
		catch(Exception e)
		{
			
		}
	}
		
}