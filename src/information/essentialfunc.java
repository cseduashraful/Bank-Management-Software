package information;
public interface essentialfunc
{
	void set_password(String pass);
	void set_username(String pass);
	void set_name(String pass);
	String get_password();
	String get_username();
	String get_name();
	boolean isMatch(String s1,String s2);
}