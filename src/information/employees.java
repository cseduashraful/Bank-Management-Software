package information;
public class employees implements essentialfunc
{
	String em_name;
	String em_username;
	String em_password;
	public void set_username(String n)
	{
		em_username = n;
	}
	public void set_name(String n)
	{
		em_name = n;
	}
	public void set_password(String n)
	{
		em_password = n;
	}
	public String get_name()
	{
		return em_name;
	}
	public String get_username()
	{
		return em_username;
	}
	public String get_password()
	{
		return em_password;
	}
	public boolean isMatch(String username, String password)
	{
		if(em_username.equals(username) && em_password.equals(password))
			return true;
		return false;
	}
	public boolean isMatch(String username)
	{
		if(em_username.equals(username))
			return true;
		return false;
	}
	public boolean isMatch(String pass,int k)
	{
		if(em_password.equals(pass))
			return true;
		return false;
	}
}