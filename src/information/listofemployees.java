package information;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.StringTokenizer;

public class listofemployees  implements fileworks
{
	public employees employee_array[];
	public listofemployees()
	{
		employee_array=new employees[0];
		try(DataInputStream din = new DataInputStream(new FileInputStream("information/employees.txt")))
		{
			String str = din.readLine();
			String delim = ",";
			StringTokenizer tok = new StringTokenizer(str, delim, true);
			int i=0;
			String N=null,U=null, P=null;
			while(tok.hasMoreTokens())
			{
				String s = tok.nextToken();
				if(!s.equalsIgnoreCase(delim))
				{
					if(i%3==0) N=s;
					else if(i%3==1) U=s;
					else if(i%3==2)
					{
						P=s;
						employees temp = new employees();
						temp.em_name=N;
						temp.em_username=U;
						temp.em_password=P;
						add_employee(temp);
					}
					i++;
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}
	public void add_employee(employees ac1)
	{
		employees acc[]= new employees[employee_array.length+1];
		int i;
		for(i=0;i<employee_array.length;i++)
		{
			acc[i]=employee_array[i];
		}
		acc[i]=ac1;
		employee_array=acc;
		writeinfile();
	}
	public void writeinfile()
	{
		int i;
		String s="";
		for(i=0;i<employee_array.length;i++)
		{
			s=s+employee_array[i].em_name+","+employee_array[i].em_username+","+employee_array[i].em_password+",";
		}
		byte buf[] = s.getBytes();
		FileOutputStream file = null;
		try
		{
			file = new FileOutputStream("information/employees.txt");
			file.write(buf);
		}
		catch(Exception e)
		{
			
		}
	}
	public boolean delet_employee(String n)
	{
		int i;
		for(i=0;i<employee_array.length;i++)
		{
			if(employee_array[i].isMatch(n))
			{
				employees ar[] = new employees[employee_array.length-1];
				int j;
				for(j=0;j!=i;j++)
				{
					ar[j]=employee_array[j];
				}
				for(j=i+1;j<=ar.length;j++)
				{
					ar[j-1]=employee_array[j];
				}
				employee_array=ar;
				writeinfile();
				return true;
			}
		}
		return false;
	}
}