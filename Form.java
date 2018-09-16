import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form extends Temp implements ActionListener
{
	JButton SUBMIT ;
	JLabel label1,label2 , label3 , title , choice;
	final JTextField  text1,text2 , text3 ;
	JComboBox <String>list;
	JCheckBox kyc;
	boolean b = true;
	boolean val = false;
	JButton back;

	Form()
	{
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		
		title = new JLabel("KYC Portal");
		Dimension size = title.getPreferredSize();
		title.setBounds(40,150, size.width + 60, size.height);	
		title.setFont(new Font("Century",Font.BOLD,17));	
		title.setForeground (Color.blue);
		
		label1 = new JLabel();
		label1.setText("Name :");
		label1.setBounds(350,200, size.width, size.height);
	 	
		text1 = new JTextField(15);
		Dimension tsize = text1.getPreferredSize();
		text1.setBounds(500,200, tsize.width, tsize.height);
		text1.setToolTipText("Enter your full name ");
	 	
		label2 = new JLabel();
		label2.setText("Age :");
		label2.setBounds(350,250, size.width + 60, size.height);
	  
		text2 = new JTextField(15);	 
		text2.setBounds(500,250, tsize.width, tsize.height); 
		text2.setToolTipText("Age should be above 18 ");		
		
		SUBMIT=new JButton("SUBMIT");
		Dimension bsize = SUBMIT.getPreferredSize();
		SUBMIT.setBounds(450,300, bsize.width, bsize.height);
		SUBMIT.addActionListener(this);	
		
		label3 = new JLabel();
		label3.setText("Estimated Amount :");
		label3.setBounds(350,400, size.width + 40, size.height);
	 	
		text3 = new JTextField(15);
		text3.setBounds(500,400, tsize.width, tsize.height);
		text3.setEditable( false );	
		
		choice = new JLabel();
		choice.setText("Bank  :");
		choice.setBounds(350,350, size.width + 50, size.height + 10);
		
		list = new JComboBox<String>();
		Dimension lsize = list.getPreferredSize();
		list.setBounds(500 , 350 ,lsize.width + 100 , lsize.height );
		list.addItem("S.B.I");
		list.addItem("Central Bank");	

		UIManager.put("CheckBox.disabledText", UIManager.get("CheckBox.foreground"));		
		kyc = new JCheckBox("I Agree all the conditions");
		Dimension csize = kyc.getPreferredSize();
		kyc.setBounds(350 , 300 ,csize.width , csize.height );
		kyc.addActionListener(this);
		
		back = new JButton("<-");
		back.setBounds(5,40,bsize.width, bsize.height);
		back.addActionListener(this);
	
		panel.add(title);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(text1);
		panel.add(text2);
		panel.add(text3);
		panel.add(SUBMIT);
		panel.add(choice);
		panel.add(list);
		panel.add(kyc);	
		panel.add(back);			
				
		add(panel,BorderLayout.CENTER);
		this.setVisible(true);
		text1.requestFocusInWindow();
	}

	public void actionPerformed(ActionEvent ae)
	{
		if ( ae.getSource() == SUBMIT )
		{
			if(validation())
			{
				this.setVisible(false);	
				this.notifyAll();
				b = false;	
			}	
		}
		
		if(ae.getSource() == back)
		{			
				b = false;							
		}
		
	}
	
	boolean validation()
	{
		if(kyc.isSelected())
		{
			
		}
		else
		{
			
		}

		return val;
	}
	
}

class demo1
{
	public static void main(String arg[])
	{
		try
		{
			Form frame=new Form();
		}
		catch(Exception e)
		{JOptionPane.showMessageDialog(null, e.getMessage());}
		}
}
