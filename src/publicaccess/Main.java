package publicaccess;
import java.awt.Color;
import java.applet.*;
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.awt.*;
//my created packages
import information.*;

/*
 * 
 *   Font displayFont1=new Font("Arial Unicode MS", Font.BOLD,15);
		   JLabel jjj= new JLabel("à¦¬à¦¾à¦‚à¦²à¦¾");
		   jjj.setFont(displayFont1);
 * */



class test extends JFrame
{	
	information tempinfo,tempinfo1;
	int tempinforem=0;
	int w,h;
	JPanel onepane, twopane, threepane, fourpane,three1,three11,three12,onepane1,consolidate_account_pane;
	JPanel edit_md_pane, md_listofemployee_pane,edit_emp_pane,add_client_pane,add_account_pane;
	JButton acchoose, faci, rece, login, ab, ana,back;
	JLabel job1,mgs,job2,job;
	JLabel mgs1,mgs2,mgs3,mgdel,mgsmd,adacc,mgsbin1,mgsbin2,mgsmd1,bac,clientlabel,cl1,mdlabel,emlabel;
	Color c;
	JOptionPane jp;
	JTextField f1,emt1,emt2;
	String temps;
	JTextField T1,T2,T3,T4,T5,T6,T7,T8,nam, unam,dept1,dept2,wdt1,wdt2,trant1, trant2,trant3,bint1;
	CardLayout clay;
	JTextField cnt1, cnt2,cnt3,cnt4,cnt5,cnt6;
	JPanel show_inf_pane,show_account_pane;
	Choice os,os1;
	ActionListener alogin;
	listofemployees ob;
	JPasswordField f2,f21,newpass, curpass;
	ImageIcon icobac5,ico,icowe, icow,icologin,icobac, icologout, icoback,icook,icoabout,icosearch,icoexit;
	JPanel employee_pane,content,md_pane, client_pane,loginpane,add_employee_pane,del_employee_pane,acenter;
	md mdob;
	JTextArea  ta1,ta2,ta3,ta4,taabout,tarecent,tafacility,taacchoose;
	String sta1,sta2,sta3,sta4;
	employees curpanelemp;
	listofinformation inforob;
	JButton ad;
	listofaccount acob;
	account aka;
	test()
	{
		 
		super("EPM Bank Management Software");
		w=1368;
		h=720;
		ob = new listofemployees();   
		mdob=new md();
		acob = new listofaccount();
		inforob=new listofinformation();
		icologout = new ImageIcon("images/logout.jpg");
		icowe = new ImageIcon("images/we.jpg");
		icologin = new ImageIcon("images/login.jpg");
		icoabout = new ImageIcon("images/about.png");
		icobac5= new ImageIcon("images/bac5.jpg");
		icosearch = new ImageIcon("images/search.jpg"); 
		icook = new ImageIcon("images/ok.jpg");
		icoback= new ImageIcon("images/back.png");
		icobac= new ImageIcon("images/bac.jpg");
		icoexit = new ImageIcon("images/exit.jpg");
		icow = new ImageIcon("images/w.jpg");
		bac = new JLabel(icobac);
		bac.setLayout(new FlowLayout());
		  
               	content = new JPanel();               
               	content.setOpaque(false);     
                content.setSize(getMaximumSize());
                content.setLayout(new GridLayout(0,1,0,0));
                onepane = new JPanel();
                onepane.setLayout(new GridLayout(2,1));
                //onepane.setBackground(c.cyan);
                
                onepane.setOpaque(false);
                content.add(onepane);
               // content.add(new JLabel());
                ico = new ImageIcon("images/venkmangif.gif");
    
                twopane = new JPanel();
                twopane.setBackground(c.green);
                job = new JLabel("",ico,JLabel.CENTER);
                onepane.add(job);
                onepane.add(twopane);                
                acchoose = new JButton("Which Account to choose");
                twopane.add(acchoose);
                twopane.setOpaque(false);
                faci = new JButton("Notice");
                twopane.add(faci);
                rece = new JButton("Recent activities of the bank");
                //twopane.add(rece);  
                acchoose.setForeground(c.blue);
                acchoose.setBackground(c.pink);
                faci.setForeground(c.blue);
                faci.setBackground(c.pink);
                rece.setForeground(c.blue);
                rece.setBackground(c.pink);
                three1 = new JPanel();
                content.add(three1);
                content.add(new JLabel());
                three1.setLayout(new GridLayout(1,2));            
                three12 = new JPanel();
                three12.setBackground(c.cyan);
                three1.add(three12);
                three12.setLayout(new GridLayout(3,1));
                JLabel jb = new JLabel("Login Section", JLabel.RIGHT);
                jb.setForeground(c.RED);
                three12.add(jb);
                three12.add(new JLabel("Your role in Bank", JLabel.CENTER));
                os = new Choice();
                os.add("Client");
                os.add("Employee");
                os.add("Managing Director");
                three12.add(os);
                three11 = new JPanel();
                three11.setBackground(c.cyan);
                three1.add(three11);
                three11.setLayout(new GridLayout(2,2));
                three11.add(new JLabel("Username", JLabel.RIGHT));
                f1=new JTextField(20);
                three11.add(f1);
                three11.setLayout(new GridLayout(3,3,5,5));
                three11.add(new JLabel("Password",JLabel.RIGHT));
                f2=new JPasswordField(20);
                f1.setBorder(BorderFactory.createLineBorder(Color.green,15));
                f2.setBorder(BorderFactory.createLineBorder(Color.green,15));
                f2.setEchoChar('?');
                three11.add(f2);
                login = new JButton(icologin);               
                loginpane=new JPanel();
                loginpane.setLayout(new FlowLayout());
                loginpane.add(login);
                mgs = new JLabel("");
                three11.add(mgs);
                three11.add(loginpane);
                loginpane.setBackground(c.cyan);
                fourpane = new JPanel();
                JButton ab = new JButton(icoabout);
                ab.setBorder(BorderFactory.createLineBorder(Color.green,5));
                ab.setBackground(c.GREEN);
                ab.setBorderPainted(isFocused());
                ab.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                ab.addActionListener(new ActionListener()
        		{
        			public void actionPerformed(ActionEvent evt)
        			{
        				abouts();
                         
        			}
        		});
                JButton ana=new JButton(icoexit);
                ana.setBackground(c.RED);
                ana.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                ana.setBorder(BorderFactory.createLineBorder(Color.RED,5));
                ana.setBorderPainted(isFocused());
                ana.addActionListener(new ActionListener()
        		{
        			public void actionPerformed(ActionEvent evt)
        			{
        				jp = new JOptionPane();
        				int i;
        				i = jp.showConfirmDialog(null, "Do You really want to exit?");
        				if(i==0)
        				dispose();
                         
        			}
        		});
                fourpane.add(ab);
                fourpane.add(ana);
                fourpane.setOpaque(false);
                content.add(fourpane);   
                   login.setBackground(c.blue);  
                 //  login.add(new t)
                   login.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                   login.setBorder(BorderFactory.createLineBorder(Color.BLUE,5));
                   login.setBorderPainted(isFocused());
				login.addActionListener(alogin = new ActionListener()
                {
                	public void actionPerformed(ActionEvent evt)
                	{
                		String s1, s2, s3;
                		s1=f1.getText();
                		s2=f2.getText();
                		s3=os.getSelectedItem();
                		if(s3.equalsIgnoreCase("employee"))
                		{
                			int i ;
                			for(i = 0;i<ob.employee_array.length;i++)
                		{
                			if(ob.employee_array[i].isMatch(s1, s2))
                			{                				
                				f1.setText("");
                				f2.setText("");
                				mgs.setText("");
                				empanel(ob.employee_array[i]);
                				break;
                			}
                		}
                			if(i==ob.employee_array.length)
                			{
                				jp = new JOptionPane();
                				jp.showMessageDialog(null, "Login Unsuccessfull For "+s3);
                			}
                		}
                		else if(s3.equalsIgnoreCase("managing director"))
                		{
                			if(mdob.isMatch(s1, s2))
                			{
                				f1.setText("");
                				f2.setText("");
                				mgs.setText("");
                				mdpanel();
                			
                			}
                			else
                			{
                				jp = new JOptionPane();
                				jp.showMessageDialog(null, "Login Unsuccessfull For "+s3);
                			}
                			
                		}
                		else if(s3.equalsIgnoreCase("client"))
                		{
                    		
                			int i;
                			for(i = 0;i<inforob.information_array.length;i++)
                    		{
                    			if(inforob.information_array[i].isMatch(s1, s2))
                    			{                				
                    				f1.setText("");
                    				f2.setText("");
                    				mgs.setText("");
                    				clientpanel(inforob.information_array[i]);
                    				break;
                    				
                    			}
                    		}
                			if(i==inforob.information_array.length)
                			{
                				jp = new JOptionPane();
                				jp.showMessageDialog(null, "Login Unsuccessfull For "+s3);
                			}
                		}
                	}
                });
				//setContentPane(bac);
				os.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				bac.add(content,JLabel.CENTER_ALIGNMENT);
				
				setContentPane(bac);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                pack(); 
        }
	void abouts()
	{
		ImageIcon icobac4 = new ImageIcon("images/bac4.jpg");
		JLabel abo = new JLabel(icobac4);
		JPanel showus = new JPanel(new BorderLayout(20,20));
		abo.setLayout(new FlowLayout());
		abo.add(showus);
		JPanel center = new JPanel();
		showus.setOpaque(false);
		center.setLayout(new GridLayout(0,1,5,5));
		//center.setOpaque(false);
		center.setBackground(c.pink);
		showus.add(new JLabel("",icowe,JLabel.CENTER), BorderLayout.NORTH);
		Font displayFont1=new Font("Arial Unicode MS", Font.BOLD,20);
		   JLabel jjj= new JLabel("The software has been developed by:", JLabel.LEFT);
		   jjj.setForeground(new Color(135,0,0));
		   jjj.setFont(displayFont1);
		   center.add(jjj);
		   JLabel jjj4= new JLabel("1. MD. Ashraful Islam, Class roll: 43, Session: 2011-12", JLabel.LEFT);
		   jjj4.setForeground(new Color(0,135,0));
		   jjj4.setFont(displayFont1);
		   center.add(jjj4);
		   JLabel jjj5= new JLabel("2. MD. Imran Pavel, Class roll: 47, Session: 2011-12", JLabel.LEFT);
		   jjj5.setForeground(new Color(0,135,0));
		   jjj5.setFont(displayFont1);
		   center.add(jjj5);
		   JLabel jjj6= new JLabel("3. Kazi Mazbah Uddin, Class roll: 53, Session: 2011-12", JLabel.LEFT);
		   jjj6.setForeground(new Color(0,135,0));
		   jjj6.setFont(displayFont1);
		   center.add(jjj6);
		  // Font displayFont1=new Font("Arial Unicode MS", Font.BOLD,20);
		   JLabel jjj1= new JLabel("Department of Computer Science and Engineering", JLabel.LEFT);
		   jjj1.setForeground(c.BLUE);
		   jjj1.setFont(displayFont1);
		   center.add(jjj1);
		   JLabel jjj2= new JLabel("University of Dhaka", JLabel.LEFT);
		   jjj2.setForeground(c.BLUE);
		   jjj2.setFont(displayFont1);
		   center.add(jjj2);
		   showus.add(center, BorderLayout.CENTER);
		   JPanel south = new JPanel();
		   south.setLayout(new FlowLayout());
		   south.setOpaque(false);
		   back = new JButton(icoback);
			back.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			back.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent evt)
				{

					setContentPane(bac);
					setDefaultCloseOperation(EXIT_ON_CLOSE); 
					pack();
				}
			});
		   south.add(back);
		   showus.add(south, BorderLayout.SOUTH);
		setContentPane(abo);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
         pack();
	}
	void show_account(account obj)
	{
		show_account_pane = new JPanel();
		JLabel jlb = new JLabel(icobac5);
		jlb.setLayout(new FlowLayout());
		jlb.add(show_account_pane);
		show_account_pane.setOpaque(false);
		aka = obj;
		show_account_pane.setLayout(new BorderLayout(0,70));
		show_account_pane.add(new JLabel("",ico,JLabel.CENTER), BorderLayout.NORTH);
		String s ="Account number : "+ obj.get_account_number();
		int jj;
		s=s+"\n\tBalance : "+obj.get_balance()+"\n\tAccount type : "+obj.get_account_type();
		s=s+"\n\tNominee ID :"+obj.get_nominee()+"\n\tNumber of owners : "+ obj.owners.length;
		if(obj.owners.length>0)
		{
			s=s+"\n\tOwners are :";
			int ii;
			for(ii=0;ii<obj.owners.length;ii++)
			{
				s=s+"\n\t"+(ii+1)+"--->"+obj.owners[ii];
			}
		}
		JTextArea si = new JTextArea(20,25);
		si.setEditable(false);
		si.setText(s);
		show_account_pane.add(si, BorderLayout.CENTER);
		show_account_pane.add(new JScrollPane(si), BorderLayout.CENTER);
		back = new JButton("Back");
		back.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				empanel(curpanelemp);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
                 
			}
		});
		
		JButton closeaccount = new JButton("Close the account");
		closeaccount.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		closeaccount.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				int num = aka.get_account_number();
				int i;
				acob.delete_an_account(aka);
				for(i=0;i<aka.owners.length;i++)
				{
					inforob.delete_account(aka.owners[i], num);
				}
				empanel(curpanelemp);
				setDefaultCloseOperation(EXIT_ON_CLOSE);                 
			}
		});
		JPanel showinfsouth = new JPanel();
		showinfsouth.setLayout(new FlowLayout());
		showinfsouth.add(back);
		showinfsouth.setOpaque(false);
		showinfsouth.add(closeaccount);
		show_account_pane.add(showinfsouth, BorderLayout.SOUTH);
		setContentPane(jlb);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack(); 
	}
	 
	void show_inf(information obj)
	{
		JLabel jlb = new JLabel(icobac5);
		jlb.setLayout(new FlowLayout());
		show_inf_pane = new JPanel();
		jlb.add(show_inf_pane);
		show_inf_pane.setOpaque(false);
		show_inf_pane.setLayout(new BorderLayout(0,50));
		show_inf_pane.add(new JLabel("",ico,JLabel.CENTER), BorderLayout.NORTH);
		String s = "Name : "+obj.get_name()+"\nAddress : "+obj.get_address()+"\nTelephone : "+obj.get_telephone();
		s= s+"\nUsername : "+obj.get_username()+"\nNumber of Accounts : "+obj.ac.length+"\n\tThey are:-";
		int i;
		for(i=0;i<obj.ac.length;i++)
		{
			s=s+"\n"+(i+1)+" : "+obj.ac[i];
			int jj;
			for(jj=0;jj<acob.account_array.length;jj++)
			{
				if(obj.ac[i]==acob.account_array[jj].get_account_number())
				{
					s=s+"\n\tBalance : "+acob.account_array[jj].get_balance()+"\n\tAccount type : "+acob.account_array[jj].get_account_type();
					s=s+"\n\tNominee ID: "+acob.account_array[jj].get_nominee()+"\n\tNumber of owners : "+ acob.account_array[jj].owners.length;
					if(acob.account_array[jj].owners.length>1)
					{
						s=s+"\n\tOther owners are :";
						int ii;
						for(ii=0;ii<acob.account_array[jj].owners.length;ii++)
						{
							if(!acob.account_array[jj].owners[ii].equals(obj.get_username()))
							{
								s=s+"\n\t--->"+acob.account_array[jj].owners[ii];
							}
						}
					}
				}
			}
		}
		JTextArea si = new JTextArea(25,80);
		si.setBackground(new Color(240,220,235));
		si.setEditable(false);
		si.setText(s);
		show_inf_pane.add(si, BorderLayout.CENTER);
		show_inf_pane.add(new JScrollPane(si), BorderLayout.CENTER);
		back = new JButton("Back");
		back.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				empanel(curpanelemp);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				pack(); 
			}
		});
		JPanel showinfsouth = new JPanel();
		showinfsouth.setLayout(new FlowLayout());
		showinfsouth.add(back);
		showinfsouth.setOpaque(false);
		show_inf_pane.add(showinfsouth, BorderLayout.SOUTH);
		setContentPane(jlb);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack(); 
	}
	void edit_employee_panel(employees emp)
	{
		JLabel jlb = new JLabel(icobac5);
		jlb.setLayout(new FlowLayout());
		edit_emp_pane= new JPanel();
		jlb.add(edit_emp_pane);
		edit_emp_pane.setLayout(new BorderLayout(120,120));
		edit_emp_pane.setOpaque(false);
		edit_emp_pane.add(new JLabel("",ico,JLabel.CENTER), BorderLayout.NORTH);
		JPanel pane2 = new JPanel();
		pane2.setLayout(new GridLayout(5,2));
		nam = new JTextField(20);
		unam = new JTextField(20);
		newpass = new JPasswordField(20);
		pane2.add(new JLabel("Name"));
		pane2.add(nam);
		pane2.add(new JLabel("Username"));
		pane2.add(unam);
		pane2.add(new JLabel("Password"));
		pane2.add(newpass);
		nam.setText(emp.get_name());
		unam.setText(emp.get_username());
		JPanel pane3 = new JPanel();
		pane3.setLayout(new FlowLayout());
		curpass = new JPasswordField(20);
		pane2.add(new JLabel("Give current Password"));
		pane2.add(curpass);
		JButton ok;
		back = new JButton(icoback);
		back.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				empanel(curpanelemp);
			}
		});
		mgsmd = new JLabel();
		ok = new JButton(icook);
		pane2.add(mgsmd);
		pane2.add(new JLabel(""));
		pane3.add(back);
		pane3.add(ok);
		ok.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				mgsmd.setText("");
				String s1, s2, s3, s4;
				s1 = nam.getText();
				s2= unam.getText();
				s3= newpass.getText();
				s4= curpass.getText();
				int i;
				for(i=0;i<ob.employee_array.length;i++)
				{
					if(ob.employee_array[i].isMatch(s4,1))
					{
						if(s1.equals("") || s2.equals(""))
						{
							mgsmd.setText("You left something blank");
							
						}
						else
						{
							ob.employee_array[i].set_username(s2);
							ob.employee_array[i].set_name(s1);
							if(!s3.equals(""))
							{
								ob.employee_array[i].set_password(s3);
							}
							//String temp = ob.employee_array[i].get_name()+","+ob.employee_array[i].get_username()+","+ob.employee_array[i].get_password();
							ob.writeinfile();
							mgsmd.setText("Edited Successfully");
						}
						break;
					}
				}

				if(i==ob.employee_array.length)
					mgsmd.setText("Current Password did not match");
     
			}
		});
		
		edit_emp_pane.add(pane2, BorderLayout.CENTER);
		edit_emp_pane.add(pane3,BorderLayout.SOUTH);
		pane3.setOpaque(false);
		setContentPane(jlb);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();// pack();
		
	}
	boolean isValid(String s)
	{
		int i;
		for(i=0;i<s.length();i++)
		{
			if(!(s.charAt(i)>='a' && s.charAt(i)<='z') && !(s.charAt(i)>='A' && s.charAt(i)<='Z') && !(s.charAt(i)>='0' && s.charAt(i)<='9') && s.charAt(i)!='.' && s.charAt(i)!='_')
				return false;
		}
		return true;
	}
	void invalidmgs(String s)
	{
		JLabel jlb = new JLabel(icobac5);
		jlb.setLayout(new FlowLayout());
		JPanel cnt = new JPanel();
		jlb.add(cnt);
		cnt.setOpaque(false);
		temps =s;
		cnt.setLayout(new BorderLayout(130,130));
		cnt.add(new JLabel("",ico,JLabel.CENTER), BorderLayout.NORTH);
		JButton eback = new JButton(icoback);
		eback.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		eback.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				add_account_panel();
			}
		});
		JButton ok = new JButton(icook);
		JPanel south = new JPanel();
		south.setLayout(new FlowLayout());
		south.add(eback);
		south.add(ok);
		south.setOpaque(false);
		cnt.add(south, BorderLayout.SOUTH);
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(0,2));
		cnt.add(center,BorderLayout.CENTER);
		center.add(new JLabel("Client Username: "));
		center.add(new JLabel(s));
		center.add(new JLabel("Name: "));
		cnt1 = new JTextField(20);
		center.add(cnt1);
		center.add(new JLabel("Address: "));
		cnt2 = new JTextField(20);
		center.add(cnt2);
		center.add(new JLabel("Telephone Number: "));
		cnt3 = new JTextField(20);
		center.add(cnt3);
		center.add(new JLabel("Email: "));
		cnt4 = new JTextField(20);
		center.add(cnt4);
		center.add(new JLabel("Password: "));
		cnt5 = new JPasswordField(20);
		center.add(cnt5);
		ok.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				if(cnt1.getText().equals("")||cnt5.getText().equals("") ||cnt2.getText().equals("")||cnt3.getText().equals("")||cnt4.getText().equals(""))
				{
					
				}
				else
				{
					tempinfo = new information();
					tempinfo.set_username(temps);
					tempinfo.set_name(cnt1.getText());
					tempinfo.set_address(cnt2.getText());
					tempinfo.set_telephone(cnt3.getText());
					tempinfo.set_email(cnt4.getText());
					tempinfo.set_password(cnt5.getText());
					tempinfo.ac = new int[0];
					inforob.add_a_client(tempinfo);					
					setContentPane(adacc);
					setDefaultCloseOperation(EXIT_ON_CLOSE);
					pack();// pack();
				}
			}
		});
		
		setContentPane(jlb);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
         
		pack();
	}
	boolean doExist(String x)
	{
		int j;
		for(j=0;j<inforob.information_array.length;j++)
		{
			if(inforob.information_array[j].isMatch(x))
				{
					
					return true;
				
				}
		}
		return false;
	}
	void add_account_panel()
	{
		adacc = new JLabel(icobac5);
		adacc.setLayout(new FlowLayout());
		add_account_pane = new JPanel();
		adacc.add(add_account_pane);
		add_account_pane.setOpaque(false);
		add_account_pane.setLayout(new BorderLayout(130,130));
		add_account_pane.add(new JLabel("",ico,JLabel.CENTER), BorderLayout.NORTH);
		int account_number = 0,i;
		for(i=0;i<acob.account_array.length;i++)
		{
			if(account_number<acob.account_array[i].get_account_number())
			{
				account_number=acob.account_array[i].get_account_number();
			}
		}
		account_number++;
		tempinforem = account_number;
		acenter = new JPanel();
		add_account_pane.add(acenter, BorderLayout.CENTER);
		acenter.setLayout(new GridLayout(0,2));
		acenter.add(new JLabel("Account Number:"));
		acenter.add(new JLabel(""+account_number));
		acenter.add(new JLabel("Account Type:"));
		os1 = new Choice();
		os1.add("current");
		os1.add("savings");
		acenter.add(os1);
		acenter.add(new JLabel("Account Balance(minimum 500)"));
		T2 = new JTextField(20);
		acenter.add(T2);
		acenter.add(new JLabel("List of owners(space separated)"));
		T3 = new JTextField(20);
		acenter.add(T3);
		T2.setText("");
		T3.setText("");
		T5 = new JTextField(20);
		acenter.add(new JLabel("Nominee ID"));
		acenter.add(T5);
		mgsmd = new JLabel();
		acenter.add(mgsmd);
		//acenter.add(new JLabel(""));
		
		
		back = new JButton(icoback);
		back.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				empanel(curpanelemp);
			}
		});
		JButton ok = new JButton(icook);
		ad = new JButton();
		ok.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				
				
				
				
				String s1,s2,s3;
				s1= T2.getText();
				s2= T3.getText();
				s3=T5.getText();
				int bal=0;
				if(!s1.equals(""))bal = Integer.parseInt(s1);
				if(s1.equals("") || s2.equals("") || s3.equals(""))
				{
					mgsmd.setText("You left some thing empty");
				}
				else if(bal<500)
				{
					mgsmd.setText("Balace must be at least 500");
				}
				else if(!doExist(s3))
				{
					mgsmd.setText("nominee ID:"+s3+" is not valid");
				}
				else
				{
					mgsmd.setText("");
					String delim = " ";
					StringTokenizer tok = new StringTokenizer(s2,delim,true);
					while(tok.hasMoreTokens())
					{
						String s = tok.nextToken();
						if(!s.equals(delim))							
						{
							if(!isValid(s))
							{
								mgsmd.setText("Username: "+ s + " is not valid");
								break;
							}
							else
							{
								int j;
								for(j=0;j<inforob.information_array.length;j++)
								{
									if(inforob.information_array[j].isMatch(s))
										{
											
											acenter.remove(ad);
											acenter.revalidate();
											acenter.repaint();
											break;
										
										}
								}
								if(j==inforob.information_array.length)
								{
									mgsmd.setText(s+" username doesn't exist");
									ad = new JButton("Add this client");
									acenter.add(ad);
									temps = s;
									ad.addActionListener(new ActionListener()
									{
										public void actionPerformed(ActionEvent evt)
										{
											
											acenter.remove(ad);
											invalidmgs(temps);
											
										}
									});
									
								}
								
							}
						}
					}
				}
				if(mgsmd.getText().equals(""))
				{
					account temp = new account();
					temp.set_account_number(tempinforem);
					temp.set_balance(bal);
					temp.set_nominee(s3);
					temp.set_account_type(os1.getSelectedItem());
					String delim1 = " ";
					StringTokenizer stk = new StringTokenizer(s2, delim1 , true);
					String str[]= new String[0];
					while(stk.hasMoreTokens())
					{
						String s = stk.nextToken();
						if(!s.equals(delim1))
						{
							String str1[] = new String[str.length+1];
							int ij;
							for(ij=0;ij<str.length;ij++)
							{
								str1[ij] = str[ij];
							}
							str1[ij]=s;
							str=str1;
							int ji;
							for(ji=0;ji<inforob.information_array.length;ji++)
							{
								if(inforob.information_array[ji].isMatch(s))
								{
									inforob.information_array[ji].add_account(tempinforem);
									
								}
							}
						}
					}
					temp.owners=str;
					inforob.writeinfile();
					acob.add_an_account(temp);
					empanel(curpanelemp);
					
				}
			}
		});
		
		JPanel south = new JPanel();
		south.setLayout(new FlowLayout());
		add_account_pane.add(south, BorderLayout.SOUTH);
		south.add(back);
		south.add(ok);
		south.setOpaque(false);
		setContentPane(adacc);
		setDefaultCloseOperation(EXIT_ON_CLOSE);         
		pack();
	}
	void consolidateaccountpanel()
	{
		JLabel jlb = new JLabel(icobac5);
		jlb.setLayout(new FlowLayout());
		consolidate_account_pane = new JPanel();
		jlb.add(consolidate_account_pane);
		consolidate_account_pane.setOpaque(false);
		consolidate_account_pane.setLayout(new BorderLayout(120,120));
		consolidate_account_pane.add(new JLabel("",ico,JLabel.CENTER), BorderLayout.NORTH);
		back = new JButton(icoback);
		mgsmd = new JLabel("");
		back.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				mgsmd.setText("");
				empanel(curpanelemp);
			}
		});
		
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(0,2));
		consolidate_account_pane.add(center,BorderLayout.CENTER);
		center.add(new JLabel("Consolidate Two Account"));
		center.add(new JLabel("Resulting Account will be Account 1"));
		center.add(new JLabel("Account 1: "));
		T1 = new JTextField(20);
		T1.setText("");
		center.add(T1);
		center.add(new JLabel("Account 2: "));
		T2 = new JTextField(20);
		T2.setText("");
		center.add(T2);
		center.add(mgsmd);
		mgsmd1 = new JLabel();
		center.add(new JLabel(""));
		center.add(mgsmd1);
		
		JButton ok = new JButton(icook);
		JPanel south = new JPanel();
		south.setLayout(new FlowLayout());
		south.add(back);
		south.add(ok);
		consolidate_account_pane.add(south, BorderLayout.SOUTH);
		ok.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				
				try
				{
					String s1, s2;
					s1 = T1.getText();
					s2 = T2.getText();
					int n1, n2;
					n1=Integer.parseInt(s1);
					n2=Integer.parseInt(s2);
					account a1, a2;
					a1 = new account();
					a2 = new account();
					int i;
					for(i=0;i<acob.account_array.length;i++)
					{
						if(acob.account_array[i].get_account_number()==n1)
						{
							a1 = acob.account_array[i];
							break;
						}
					}
					if(i==acob.account_array.length)
					{
						mgsmd.setText(n1+" account doesn't exist");
					}
					else
					{
						for(i=0;i<acob.account_array.length;i++)
						{
							if(acob.account_array[i].get_account_number()==n2)
							{
								a2 = acob.account_array[i];
								break;
							}
						}
						if(i==acob.account_array.length)
						{
							mgsmd.setText(n1+" account doesn't exist");
						}
						else
						{
							if(!a1.isPossible(a2))
							{
								mgsmd.setText("It is not possible to ");
								mgsmd1.setText("consolidate "+n1 +" and " +n2);
							}
							else
							{
								
								int x = a1.get_balance()+a2.get_balance();
								a1.set_balance(x);
								acob.delete_an_account(a2);
								for(i=0;i<a2.owners.length;i++)
								{
									inforob.delete_account(a2.owners[i], n2);
								}
								mgsmd.setText("Consolidated successfully.");
								mgsmd1.setText(n1+" balance: "+ a1.get_balance());
								T1.setText("");
								T2.setText("");
							}
							
						}
					}
				}
				catch(Exception e)
				{
					
				}
				
				
			}
		});
		consolidate_account_pane.setOpaque(false);
		south.setOpaque(false);
		setContentPane(jlb);
		setDefaultCloseOperation(EXIT_ON_CLOSE);         
		pack();
		
	}
	
	void empanel(employees emp)
	{
		curpanelemp = emp;
		
		emlabel = new JLabel(icobac5);
		emlabel.setLayout(new FlowLayout());
		employee_pane = new JPanel();
		employee_pane.setLayout(new BorderLayout());
		employee_pane.setOpaque(false);
		employee_pane.add(new JLabel("",ico,JLabel.CENTER), BorderLayout.NORTH);
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(6,1));
		center.setOpaque(false);
		
		employee_pane.add(center, BorderLayout.CENTER);
		JLabel jb1 =new JLabel(emp.get_name(),JLabel.CENTER);
		jb1.setForeground(c.RED);
		center.add(jb1);
		center.add(jb1);
		JLabel jb = new JLabel("Rank: Officer", JLabel.CENTER);
		jb.setForeground(c.RED);
		center.add(jb);
		JPanel pane3 = new JPanel();
		pane3.setLayout(new FlowLayout());		
		JButton addaccount = new JButton("Add a new account");
	
		JButton consolidate = new JButton("Consolidate Two Account");
		JButton edit = new JButton("Edit Your Information");
		JButton search1 = new JButton(icosearch);
		JButton search2 = new JButton(icosearch);
		JButton about_set = new JButton("Bank_About");
		JButton activity_set = new JButton("Recent Activity");
		JButton ac_choose_set = new JButton("Acoount choose");
		JButton facility_set = new JButton("Set Facilities");
		
		//consolidateaccountpanel()
		consolidate.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		consolidate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				consolidateaccountpanel();
			}
		});		
		addaccount.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addaccount.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				add_account_panel();
			}
		});		
		ta1= new JTextArea(10,10);
		JPanel em_paneleft = new JPanel();
		em_paneleft.setLayout(new BorderLayout());
		em_paneleft.add(ta1, BorderLayout.CENTER);		
		//employee_pane.add(em_paneleft, BorderLayout.WEST);
		JPanel emleftsouth = new JPanel();
		emleftsouth.setLayout(new FlowLayout());
		emleftsouth.add(about_set);
		emleftsouth.add(activity_set);
		em_paneleft.add(emleftsouth, BorderLayout.SOUTH);		
		em_paneleft.add(new JScrollPane(ta1),BorderLayout.CENTER);
		
		ta2= new JTextArea(10,10);
		JPanel em_paneright = new JPanel();
		em_paneright.setLayout(new BorderLayout());
		em_paneright.add(ta2, BorderLayout.CENTER);		
		//employee_pane.add(em_paneright, BorderLayout.EAST);
		JPanel emrightsouth = new JPanel();
		emrightsouth.setLayout(new FlowLayout());
		emrightsouth.add(facility_set);
		emrightsouth.add(ac_choose_set);
		em_paneright.add(emrightsouth, BorderLayout.SOUTH);		
		em_paneright.add(new JScrollPane(ta2),BorderLayout.CENTER);
		
		pane3.add(addaccount);

		pane3.add(consolidate);
		
		JPanel pane2 = new JPanel();
		pane2.setLayout(new FlowLayout());
		pane2.add(edit);
		pane2.setOpaque(false);
		pane3.setOpaque(false);
		center.add(pane2);
		center.add(pane3);
		
		emt1 = new JTextField(20);
		emt2 = new JTextField(20);
		
		JPanel pane4 = new JPanel();
		pane4.setLayout(new FlowLayout());
		pane4.add(new JLabel("Username of Client"));
		pane4.add(emt1);
		pane4.add(search1);
		center.add(pane4);
		
		JPanel pane5 = new JPanel();
		pane5.setLayout(new FlowLayout());
		pane5.add(new JLabel("Account number"));
		pane5.add(emt2);
		pane5.add(search2);
		center.add(pane5);
		edit.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		edit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				edit_employee_panel(curpanelemp);
			}
		});
		
		back = new JButton(icologout);
		back.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{

				jp= new JOptionPane();
				int i = jp.showConfirmDialog(null, "Do you really want to logout?");
				if(i==0){
				mgs.setText("");
				setContentPane(bac);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
                pack();}
			}
		});
		search1.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		search1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				int i = 0;
				String s=emt1.getText();
				for(i=0;i<inforob.information_array.length;i++)
				{
					if(inforob.information_array[i].isMatch(s))
					{
					
						break;
					}
				}
				if(i==inforob.information_array.length)
				{
					String s1 = "Recheck input";
					jp=new JOptionPane();
					jp.showMessageDialog(null, s1);
				}
				else
					show_inf(inforob.information_array[i]);
				
			}
		});
		search2.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		search2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
					int i = 0;
					String s=emt2.getText();
					int ns = Integer.parseInt(s);
					for(i=0;i<acob.account_array.length;i++)
					{
						if(acob.account_array[i].get_account_number()==ns)
						{
							break;
						}
					}
					if(i==acob.account_array.length)
					{
						String s1 = "Recheck input";
						jp=new JOptionPane();
						jp.showMessageDialog(null, s1);
					}
					else
						show_account(acob.account_array[i]);
				}
				catch(Exception e)
				{
					String s1 = "Recheck input";
					jp=new JOptionPane();
					jp.showMessageDialog(null, s1);
				}
				
			}
		});
		
		
		JPanel temppane = new JPanel();
		temppane.setLayout(new FlowLayout());
		temppane.add(em_paneleft);
		temppane.add(back);
		temppane.add(em_paneright);
		temppane.setOpaque(false);
		employee_pane.add(temppane, BorderLayout.SOUTH);
		emlabel.add(employee_pane);
		setContentPane(emlabel);
		//setContentPane(employee_pane);
		//employee_pane.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
         
		pack();
	}
	
	
	void add_employee_panel()
	{
				
		JLabel jlb = new JLabel(icobac);
		jlb.setLayout(new FlowLayout());
		JPanel jpl = new JPanel();
		jpl.setLayout(new BorderLayout(5,120));
		jlb.add(jpl);
		jpl.add(new JLabel(ico), BorderLayout.NORTH);
		JPanel p1,p2;
		JButton ok;
		add_employee_pane = new JPanel();
		jpl.add(add_employee_pane, BorderLayout.CENTER);
		add_employee_pane.setLayout(new GridLayout(0,2,5,5));
		add_employee_pane.add(new JLabel("Fill up the form."));
		add_employee_pane.add(new JLabel("All fields are necessary."));
		add_employee_pane.add(new JLabel("Employee Name:"));
		T1=new JTextField(30);
		add_employee_pane.add(T1);
		mgs1=new JLabel("");
		add_employee_pane.add(mgs1);
		add_employee_pane.add(new JLabel(""));		
		add_employee_pane.add(new JLabel("Employee Username:"));
		T2=new JTextField(30);
		add_employee_pane.add(T2);
		mgs2=new JLabel("");
		add_employee_pane.add(mgs2);
		add_employee_pane.add(new JLabel(""));	
		add_employee_pane.add(new JLabel("Employee password:"));
		f21=new JPasswordField(30);
		add_employee_pane.add(f21);
		mgs3=new JLabel("");
		add_employee_pane.add(mgs3);
		add_employee_pane.add(new JLabel(""));	
		p1=new JPanel();
		p1.setLayout(new FlowLayout());
		back = new JButton(icoback);
		p1.add(back);
		back.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				mdpanel();
			}
		});
		p2=new JPanel();
		p2.setLayout(new FlowLayout());
		ok = new JButton(icook);
		ok.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				String s1,s2,s3;
				s1=T1.getText();
				s2=T2.getText();
				s3=f21.getText();
				mgs1.setText("");
				mgs2.setText("");
				mgs3.setText("");
				if(s1.equals("") || s2.equals("") || s3.equals(""))
				{
					if(s1.equals(""))
						mgs1.setText("Name field is Empty");
					if(s2.equals(""))
						mgs2.setText("Username field is Empty");
					if(s3.equals(""))
						mgs3.setText("Password field is Empty");
				}
				else
				{
					int i;
					for(i=0;i<ob.employee_array.length;i++)
					{
						if(ob.employee_array[i].isMatch(s2))
						{
							mgs1.setText("");
							mgs3.setText("");
							mgs2.setText("Username already exists");
							break;
						}
					}
					if(i==ob.employee_array.length)
					{
						employees em= new employees();
						em.set_name(s1);
						em.set_username(s2);
						em.set_password(s3);
						ob.add_employee(em);
						mgs1.setText("");
						mgs2.setText("");
						mgs3.setText("Employee "+ s1 +" Added Successfully");
						
					}
				}
				T1.setText("");
				T2.setText("");
				f21.setText("");
				
			}
		});
		p2.add(ok);
		JPanel jpl2 = new JPanel();
		jpl2.setLayout(new FlowLayout());
		jpl.add(jpl2, BorderLayout.SOUTH);
		jpl2.add(p1);
		jpl2.add(p2);
		jpl.setOpaque(false);
		jpl2.setOpaque(false);
		p1.setOpaque(false);
		p2.setOpaque(false);
		add_employee_pane.setBackground(c.pink);
		p1.setBackground(c.lightGray);
		p2.setBackground(c.lightGray);
		setContentPane(jlb);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		pack();
	}
	
	void del_employee_panel()
	{
		del_employee_pane = new JPanel();
		del_employee_pane.setLayout(new GridLayout(4,1));
		del_employee_pane.add(new JLabel("Enter username of the Employee to be deleted"));
		JPanel p2,p3;
		p2=new JPanel();
		p2.setLayout(new FlowLayout());
		T4 = new JTextField(20);
		p2.add(T4);
		del_employee_pane.add(p2);
		p3=new JPanel();
		del_employee_pane.add(p3);
		p3.setLayout(new FlowLayout());
		back = new JButton("Back");
		p3.add(back);
		mgdel = new JLabel("");
		del_employee_pane.add(mgdel);
		back.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				mgdel.setText("");
				mdpanel();
			}
		});
		JButton ok = new JButton("Delete");
		p3.add(ok);
		ok.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				String s1 = T4.getText();
				if(ob.delet_employee(s1))
				{
					mgdel.setText("Employee having "+T4.getText()+" has been deleted");
				}
				else
					mgdel.setText("This username does not exist");
					
			}
		});
		
		setContentPane(del_employee_pane);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		 
		pack();
	}
	void edit_mdpanel()
	{
		
		JLabel jlb = new JLabel(icobac);
		jlb.setLayout(new FlowLayout());
		JPanel jpl = new JPanel();
		jpl.setLayout(new BorderLayout(5,120));
		jlb.add(jpl);
		jpl.add(new JLabel(ico), BorderLayout.NORTH);
		jpl.setOpaque(false);
		
		
		JPanel pane2 = new JPanel();
		pane2.setLayout(new GridLayout(0,2));
		nam = new JTextField(20);
		unam = new JTextField(20);
		newpass= new JPasswordField(20);
		pane2.add(new JLabel("Name"));
		pane2.add(nam);
		pane2.add(new JLabel("Username"));
		pane2.add(unam);
		pane2.add(new JLabel("Password"));
		pane2.add(newpass);
		nam.setText(mdob.get_name());
		unam.setText(mdob.get_username());
		curpass = new JPasswordField(20);
		pane2.add(new JLabel("Give current Password"));
		pane2.add(curpass);
		JButton ok;
		back = new JButton(icoback);
		back.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				mdpanel();
			}
		});
		mgsmd = new JLabel();
		ok = new JButton(icook);
		ok.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				mgsmd.setText("");
				String s1, s2, s3, s4;
				s1 = nam.getText();
				s2= unam.getText();
				s3= newpass.getText();
				s4= curpass.getText();
				if(mdob.isMatch(s4))
				{
					if(s1.equals("") || s2.equals(""))
					{
						mgsmd.setText("You left something blank");
						
					}
					else
					{
						mdob.set_username(s2);
						mdob.set_name(s1);
						if(!s3.equals(""))
						{
							mdob.set_password(s3);
						}
						String temp = mdob.get_name()+","+mdob.get_username()+","+mdob.get_password();
						byte buf[] = temp.getBytes();
						FileOutputStream file = null;
						try
						{
							file = new FileOutputStream("information/md.txt");
							file.write(buf);
						}
						catch(Exception e)
						{
							
						}
						mgsmd.setText("");
						/*setContentPane(md_pane);
						setDefaultCloseOperation(EXIT_ON_CLOSE);
		                pack();*/
						mdpanel();
					}
				}
				else
					mgsmd.setText("Current Password did not match");
               // pack();
				pack();
			}
		});
		pane2.add(mgsmd);
		JPanel pane3 = new JPanel();
		pane3.setLayout(new FlowLayout());
		pane3.add(back);
		pane3.add(ok);
		jpl.add(pane2, BorderLayout.CENTER);
		jpl.add(pane3,BorderLayout.SOUTH);
		setContentPane(jlb);
		pane2.setBackground(c.green);
		pane3.setOpaque(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
       // pack();
		pack();
		
	}
	void md_listofemployeepanel()
	{
		JLabel jlb = new JLabel(icobac5);
		jlb.setLayout(new FlowLayout());
		
		md_listofemployee_pane = new JPanel();
		jlb.add(md_listofemployee_pane);
		md_listofemployee_pane.setOpaque(false);
		md_listofemployee_pane.setLayout(new BorderLayout(0,40));
		md_listofemployee_pane.add(new JLabel("",ico,JLabel.CENTER), BorderLayout.NORTH);
		JTextArea area = new JTextArea(20,40);
		md_listofemployee_pane.add(area, BorderLayout.CENTER);
		md_listofemployee_pane.add(new JScrollPane(area),BorderLayout.CENTER);
		int i = 0;
		for(i=0;i<ob.employee_array.length;i++)
		{
			String s =(i+1)+ ":Name: "+ob.employee_array[i].get_name()+"\n\tUsername: "+ob.employee_array[i].get_username()+"\n";
			area.append(s);
		}
		area.setEditable(false);
		JPanel fl = new JPanel(new FlowLayout());
		back = new JButton("Back");
		fl.add(back);
		fl.setOpaque(false);
		back.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				mdpanel();
			}
		});
		md_listofemployee_pane.add(fl, BorderLayout.SOUTH);
		setContentPane(jlb);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
       // pack();
		pack();
	}
	void mdpanel()
	{
		
		Font displayFont1=new Font("Arial Unicode MS", Font.BOLD,20);
		   JLabel jjj= new JLabel(icow, JLabel.CENTER);
		   jjj.setFont(displayFont1);
		   JLabel jj1= new JLabel(mdob.get_name(), JLabel.CENTER);
		   jj1.setFont(displayFont1);
		md_pane = new JPanel();
		JLabel mdlab = new JLabel(icobac);
		mdlab.setLayout(new FlowLayout());
		mdlab.add(md_pane, JLabel.CENTER);
		md_pane.setLayout(new GridLayout(5,1,0,10));
		JPanel pane1,pane2,pane3,pane4,pane41, pane42,pane43, pane44,pane5;
		md_pane.setOpaque(false);
		pane2 = new JPanel();
		pane2.setLayout(new GridLayout(3,1));
		pane2.add(jj1);
		pane2.add(jjj);
		pane2.setBackground(c.green);
		JButton edit = new JButton("Edit Your Information");
		edit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				edit_mdpanel();
			}
		});
		edit.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pane3 = new JPanel();
		pane3.setLayout(new FlowLayout());
		pane3.add(edit);
		pane3.setOpaque(false);
		pane4 = new JPanel();
		pane4.setLayout(new GridLayout(3,2));
		pane41 = new JPanel();
		pane41.setLayout(new FlowLayout());
		JButton Add,del;
		Add = new JButton("Add Emlpoyee");
		Add.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				add_employee_panel();
			}
		});
		Add.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pane41.add(Add);
		pane4.add(pane41);
		pane42 = new JPanel();
		del = new JButton("Delete Employee");
		del.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		del.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				del_employee_panel();
			}
		});
		pane42.add(del);
		pane4.add(pane42);
		pane43 = new JPanel();
		pane43.setLayout(new FlowLayout());
		JButton list= new JButton("Employee List");
		list.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		list.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				md_listofemployeepanel();
			}
		});
		pane43.add(list);
		pane4.add(pane43);
		pane44=new JPanel();
		pane44.setLayout(new FlowLayout());
		JButton act = new JButton("Todays Activity");
		pane44.add(act);
		pane4.add(pane44);
		pane4.setOpaque(false);
		pane42.setOpaque(false);
		pane41.setOpaque(false);
		pane43.setOpaque(false);
		pane44.setOpaque(false);
		pane5 = new JPanel();
		pane5.setLayout(new FlowLayout());	
		pane5.setOpaque(false);
		back = new JButton(icologout);
		back.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{

				jp= new JOptionPane();
				int i = jp.showConfirmDialog(null, "Do you really want to logout?");
				if(i==0)
				{
				setContentPane(bac);
				setDefaultCloseOperation(EXIT_ON_CLOSE); 
				pack();}
			}
		});
		pane5.add(back);
		md_pane.add(new JLabel("",ico,JLabel.CENTER));
		md_pane.add(pane2);
		md_pane.add(pane3);
		md_pane.add(pane4);
		md_pane.add(pane5);
		setContentPane(mdlab);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
         
		pack();
	}
	
	void edit_my_details(information obj)
	{
		tempinfo = obj;
		JLabel jlb = new JLabel(icobac);
		jlb.setLayout(new FlowLayout());
		JPanel jpl = new JPanel(new BorderLayout(0,70));
		jpl.setOpaque(false);
		jpl.add(new JLabel("",ico,JLabel.CENTER), BorderLayout.NORTH);
		JPanel center = new JPanel(new GridLayout(0,2));
		T1 = new JTextField(15);
		T2 = new JPasswordField(15);
		T3 = new JTextField(15);
		T4 = new JTextField(15);
		T5 = new JTextField(15);
		T6 = new JPasswordField(15);
		T7 = new JTextField(15);
		center.add(new JLabel("Name"));
		center.add(T1);
		T1.setText(obj.get_name());
		center.add(new JLabel("Username"));
		center.add(T3);
		T3.setText(obj.get_username());
		T3.setEditable(false);
		center.add(new JLabel("New Password"));
		center.add(T2);
		T2.setText(obj.get_password());
		center.add(new JLabel("Address"));
		center.add(T4);
		T4.setText(obj.get_address());
		center.add(new JLabel("E-Mail"));
		center.add(T5);
		T5.setText(obj.get_email());
		center.add(new JLabel("Mobile no"));
		center.add(T7);
		T7.setText(obj.get_telephone());
		center.add(new JLabel("Current Password"));
		center.add(T6);
		T6.setText("");
		jpl.add(center,BorderLayout.CENTER);
		JPanel south = new JPanel(new FlowLayout());
		JButton ok = new JButton(icook);
		back = new JButton(icoback);
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				show_details(tempinfo);
				
			}
		});
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(T1.getText().equals("") ||T1.getText().equals("") || T1.getText().equals("") || T1.getText().equals("") || T1.getText().equals("") || T1.getText().equals("") ||T1.getText().equals("") || !isValid(T2.getText()))
				{
					JOptionPane jp = new JOptionPane();
					jp.showMessageDialog(null, "Every field is necessary");
				}
				else if(tempinfo.isMatch(T3.getText(),T6.getText()))
				{
					//tempinfo = new information();
					tempinfo.set_username(T3.getText());
					tempinfo.set_name(T1.getText());
					tempinfo.set_address(T4.getText());
					tempinfo.set_telephone(T7.getText());
					tempinfo.set_email(T5.getText());
					tempinfo.set_password(T2.getText());
					inforob.writeinfile();
					show_details(tempinfo);
				}
				else
				{
					JOptionPane jp = new JOptionPane();
					jp.showMessageDialog(null, "Current Password does not match!!");
					System.out.println(tempinfo.get_password());
					
				}
			}
		});
		south.setOpaque(false);
		south.add(back);
		south.add(ok);
		jpl.add(south,BorderLayout.SOUTH);
		jlb.add(jpl);
		setContentPane(jlb);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	
	void show_details(information obj)
	{
		
		cl1 = new JLabel(icobac);
		cl1.setLayout(new FlowLayout());
		JPanel show_inf_pane1;
		tempinfo1 = obj;
		show_inf_pane1 = new JPanel();
		show_inf_pane1.setLayout(new BorderLayout(10,10));
		show_inf_pane1.add(new JLabel("",ico,JLabel.CENTER), BorderLayout.NORTH);
		String s = "Name : "+obj.get_name()+"\nAddress : "+obj.get_address()+"\nTelephone : "+obj.get_telephone();
		s= s+"\nEmail : "+obj.get_email()+"\nUsername : "+obj.get_username()+"\nNumber of Accounts : "+obj.ac.length+"\n\tThey are:-";
		int i;
		for(i=0;i<obj.ac.length;i++)
		{
			s=s+"\n"+(i+1)+" : "+obj.ac[i];
			int jj;
			for(jj=0;jj<acob.account_array.length;jj++)
			{
				if(obj.ac[i]==acob.account_array[jj].get_account_number())
				{
					s=s+"\n\tBalance : "+acob.account_array[jj].get_balance()+"\n\tAccount type : "+acob.account_array[jj].get_account_type();
					s=s+"\n\tNominee ID: "+acob.account_array[jj].get_nominee()+"\n\tNumber of owners : "+ acob.account_array[jj].owners.length;
					if(acob.account_array[jj].owners.length>1)
					{
						s=s+"\n\tOther owners are :";
						int ii;
						for(ii=0;ii<acob.account_array[jj].owners.length;ii++)
						{
							if(!acob.account_array[jj].owners[ii].equals(obj.get_username()))
							{
								s=s+"\n\t--->"+acob.account_array[jj].owners[ii];
							}
						}
					}
				}
			}
		}
		JTextArea si = new JTextArea(30,60);
		si.setEditable(false);
		si.setText(s);
		si.setForeground(c.BLUE);
		si.setBackground(c.pink);
		show_inf_pane1.add(si, BorderLayout.CENTER);
		show_inf_pane1.add(new JScrollPane(si), BorderLayout.CENTER);
		back = new JButton("Back");
		back.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				clientpanel(tempinfo1);
			}
		});
		JPanel showinfsouth = new JPanel();
		showinfsouth.setLayout(new FlowLayout());
		JButton edit = new JButton("Edit Your information");
		edit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				edit_my_details(tempinfo1);
			}
		});
		showinfsouth.add(back);
		showinfsouth.add(edit);

		show_inf_pane1.add(showinfsouth, BorderLayout.SOUTH);
		show_inf_pane1.setOpaque(false);
		showinfsouth.setOpaque(false);
		cl1.add(show_inf_pane1);
		setContentPane(cl1);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack(); 
	}
	
	void clientpanel(information inf)
	{
		
		tempinfo1 = inf;
		clientlabel= new JLabel(icobac);
		clientlabel.setLayout(new FlowLayout());
		client_pane = new JPanel();
		clientlabel.add(client_pane);
		client_pane.setLayout(new BorderLayout());
		client_pane.add(new JLabel(ico), BorderLayout.NORTH);
		back = new JButton(icologout);
		back.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				
				jp= new JOptionPane();
				int i = jp.showConfirmDialog(null, "Do you really want to logout?");
				if(i==0)
				{
					mgs.setText("");
					setContentPane(bac);
					setDefaultCloseOperation(EXIT_ON_CLOSE);
					pack();
				}
                 
			}
		});
		JPanel south = new JPanel();
		
		south.setLayout(new GridLayout(2,1));
		mgsmd = new JLabel("No message");
		south.setOpaque(false);
		JPanel va = new JPanel();
		va.add(mgsmd);
		south.add(va);
		JPanel south1 = new JPanel();
		south1.setOpaque(false);
		south1.setLayout(new FlowLayout());
		south1.add(back);
		south.add(south1);
		client_pane.add(south, BorderLayout.SOUTH);
		JPanel center = new JPanel();
		center.setLayout(new BorderLayout());
		client_pane.add(center, BorderLayout.CENTER);
		JPanel centernorth = new JPanel();
		centernorth.setLayout(new GridLayout(3,1));
		centernorth.add(new JLabel("Name :"+inf.get_name(),JLabel.CENTER));
		centernorth.add(new JLabel("Rank: Client",JLabel.CENTER));
		JButton show = new JButton("My Details");
		show.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent evt) {
				show_details(tempinfo1);
				
			}
		});
		show.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JPanel flow = new JPanel();
		flow.setLayout(new FlowLayout());
		flow.add(show);
		centernorth.add(flow,JPanel.CENTER_ALIGNMENT);
		JPanel centercenter = new JPanel();
		centercenter.setLayout(new GridLayout(2,2));
		JPanel dep = new JPanel();
		centercenter.add(dep);
		JPanel wd = new JPanel();
		centercenter.add(wd);
		JPanel tran = new JPanel();
		centercenter.add(tran);
		JPanel bin = new JPanel();
		centercenter.add(bin);
		dep.setLayout(new BorderLayout());
		dep.add(new JLabel("DEPOSIT MONEY", JLabel.CENTER),BorderLayout.NORTH);
		JButton dok = new JButton("ok");
		
		JPanel depsouth = new JPanel();
		depsouth.setLayout(new FlowLayout());
		depsouth.add(dok);
		dep.add(depsouth, BorderLayout.SOUTH);
		JPanel depcenter = new JPanel();
		depcenter.setLayout(new GridLayout(2,2));
		depcenter.add(new JLabel("Account Number"));
		dept1 = new JTextField(15);
		depcenter.add(dept1);
		depcenter.add(new JLabel("Amount in Tk"));
		dept2 = new JTextField(15);
		depcenter.add(dept2);
		dep.add(depcenter,BorderLayout.CENTER);
		dok.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		dok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
					String s1, s2;
					s1=dept1.getText();
					s2=dept2.getText();
					int ac1=0;
					ac1 = Integer.parseInt(s1);
					int amount=0;
					amount= Integer.parseInt(s2);
					s1=acob.deposit_money(ac1, amount,tempinfo1.get_username());
					System.out.println("huh"+s1);
					//mgsmd.setText(s1);
					jp=new JOptionPane();
					jp.showMessageDialog(null, s1);
					dept1.setText("");
					dept2.setText("");
					
				}
				catch(Exception e)
				{
					String s1 = "Recheck input";
					jp=new JOptionPane();
					jp.showMessageDialog(null, s1);
				}
                 
			}
		});		
		tran.setLayout(new BorderLayout());
		tran.add(new JLabel("TRANSFER BALANCE", JLabel.CENTER),BorderLayout.NORTH);
		JButton tok = new JButton("ok");
		JPanel transouth = new JPanel();
		transouth.setLayout(new FlowLayout());
		transouth.add(tok);
		tran.add(transouth, BorderLayout.SOUTH);
		JPanel trancenter = new JPanel();
		trancenter.setLayout(new GridLayout(3,2));
		trancenter.add(new JLabel("From(Must be your account)"));
		trant1 = new JTextField(15);
		trancenter.add(trant1);
		trancenter.add(new JLabel("To(Any account of the Bank)"));
		trant2 = new JTextField(15);
		trancenter.add(trant2);
		trancenter.add(new JLabel("Amount in Tk"));
		trant3 = new JTextField(15);
		trancenter.add(trant3);
		tran.add(trancenter,BorderLayout.CENTER);
		tok.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
					String s1, s2,s3;
					s1=trant1.getText();
					s2=trant2.getText();
					s3= trant3.getText();  
					int ac1=0;
					ac1 = Integer.parseInt(s1);
					int ac2 = Integer.parseInt(s2);
					int amount=0;
					amount= Integer.parseInt(s3);
					s1=acob.balance_transfer(ac1, ac2, amount, tempinfo1.get_username());
					jp=new JOptionPane();
					jp.showMessageDialog(null, s1);
					trant1.setText("");
					trant2.setText("");
					trant3.setText("");
					
				}
				catch(Exception e)
				{
					String s1 = "Recheck input";
					jp=new JOptionPane();
					jp.showMessageDialog(null, s1);
				}
                 
			}
		});		
		
		wd.setLayout(new BorderLayout());
		wd.add(new JLabel("WITHDRAW MONEY", JLabel.CENTER),BorderLayout.NORTH);
		JButton wok = new JButton("ok");
		JPanel wdsouth = new JPanel();
		wdsouth.setLayout(new FlowLayout());
		wdsouth.add(wok);
		wd.add(wdsouth, BorderLayout.SOUTH);
		JPanel wdcenter = new JPanel();
		wdcenter.setLayout(new GridLayout(2,2));
		wdcenter.add(new JLabel("Account Number"));
		wdt1 = new JTextField(15);
		wdcenter.add(wdt1);
		wdcenter.add(new JLabel("Amount in Tk"));
		wdt2 = new JTextField(15);
		wdcenter.add(wdt2);
		wd.add(wdcenter,BorderLayout.CENTER);
		wok.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		wok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
					String s1, s2;
					s1=wdt1.getText();
					s2=wdt2.getText();
					int ac1=0;
					ac1 = Integer.parseInt(s1);
					int amount=0;
					amount= Integer.parseInt(s2);
					s1=acob.withdraw_money(ac1, amount,tempinfo1.get_username());
					jp=new JOptionPane();
					jp.showMessageDialog(null, s1);
					wdt1.setText("");
					wdt2.setText("");
					
				}
				catch(Exception e)
				{
					String s1 = "Recheck input";
					jp=new JOptionPane();
					jp.showMessageDialog(null, s1);
				}
                 
			}
		});		
		
		bin.setLayout(new BorderLayout());
		bin.add(new JLabel("Balance Check", JLabel.CENTER),BorderLayout.NORTH);
		JButton bok = new JButton("ok");
		JPanel binsouth = new JPanel();
		binsouth.setLayout(new FlowLayout());
		binsouth.add(bok);
		bin.add(binsouth, BorderLayout.SOUTH);
		JPanel bincenter = new JPanel();
		bincenter.setLayout(new GridLayout(2,2));
		JPanel binflow = new JPanel();
		binflow.setLayout(new FlowLayout());
		JPanel binflow1 = new JPanel();
		binflow1.setLayout(new FlowLayout());
		binflow1.add(new JLabel("Account Number"));
		bint1 = new JTextField(15);
		binflow.add(bint1);
		bincenter.add(binflow1);
		bincenter.add(binflow);		
		mgsbin1 = new JLabel("");
		mgsbin2 = new JLabel("");
		bincenter.add(mgsbin1);
		bincenter.add(mgsbin2);
		bin.add(bincenter,BorderLayout.CENTER);
		bok.setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				try
				{
					String s1, s2;
					s1=bint1.getText();
					int ac1=0;
					ac1 = Integer.parseInt(s1);
					s1=acob.show_balance(ac1,tempinfo1.get_username());
					jp=new JOptionPane();
					jp.showMessageDialog(null, s1);
					bint1.setText("");
					
				}
				catch(Exception e)
				{
					String s1 = "Recheck input";
					jp=new JOptionPane();
					jp.showMessageDialog(null, s1);
				}
                 
			}
		});		
		
		dep.setBackground(new Color(0,220,90));
		wd.setBackground(new Color(255,49,124));
		tran.setBackground(new Color(255,49,124));
		depsouth.setBackground(new Color(0,220,90));
		wdsouth.setBackground(new Color(255,49,124));
		bin.setBackground(new Color(0,220,90));
		binsouth.setBackground(new Color(0,220,90));
		transouth.setBackground(new Color(255,49,124));				
		center.add(centernorth,BorderLayout.NORTH);
		center.add(centercenter, BorderLayout.CENTER);
		client_pane.setOpaque(false);
		setContentPane(clientlabel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
         
		pack();
	}
	@Override
	public boolean isResizable() {
		return false;
	}
}

public class Main
{
        public static void main(String args[])
        {
           
        	test tt=new test();
        	tt.setLocation(200, 20);
            tt.setVisible(true);
        }
}
