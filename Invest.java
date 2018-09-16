import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Invest extends Temp implements ActionListener
{
	JButton SUBMIT ;
	JLabel label1,label2 , label3 , title , choice;
	final JTextField  text1,text2 , text3 ;
	JComboBox <String>list;
//	JCheckBox kyc;

	Invest()
	{
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		
		title = new JLabel("Investment Portal");
		Dimension size = title.getPreferredSize();
		title.setBounds(40,150, size.width + 60, size.height);	
		title.setFont(new Font("Century",Font.BOLD,17));	
		title.setForeground (Color.blue);
		
		label1 = new JLabel();
		label1.setText("Amount :");
		label1.setBounds(350,200, size.width, size.height);
	 	
		text1 = new JTextField(15);
		Dimension tsize = text1.getPreferredSize();
		text1.setBounds(500,200, tsize.width, tsize.height);
		text1.setToolTipText("Enter Amount of money you want ");
	 	
		label2 = new JLabel();
		label2.setText("Duration (Months) :");
		label2.setBounds(350,250, size.width + 60, size.height);
	  
		text2 = new JTextField(15);	 
		text2.setBounds(500,250, tsize.width, tsize.height); 
		text2.setToolTipText("Enter Duration of Time ");		
		
		SUBMIT=new JButton("CALCULATE");
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
		choice.setText("Investment Method :");
		choice.setBounds(350,350, size.width + 50, size.height + 10);
		
		list = new JComboBox<String>();
		Dimension lsize = list.getPreferredSize();
		list.setBounds(500 , 350 ,lsize.width + 100 , lsize.height );
		list.addItem("S.I.P");
		list.addItem("Fixed Deposite");	

/*		UIManager.put("CheckBox.disabledText", UIManager.get("CheckBox.foreground"));		
		kyc = new JCheckBox("KYC");
		Dimension csize = kyc.getPreferredSize();
		kyc.setBounds(350 , 300 ,csize.width , csize.height );
		kyc.setEnabled(false);
		kyc.addActionListener(this);
*/	
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
//		panel.add(kyc);				
				
		add(panel,BorderLayout.CENTER);
		this.setVisible(true);
		text1.requestFocusInWindow();
	}

	public void actionPerformed(ActionEvent ae)
	{
		if ( ae.getSource() == SUBMIT )
		{
//			if(kyc.isSelected())
			{
				if((list.getItemAt(list.getSelectedIndex())).equals("S.I.P") )
				{
				       text3.setText("1234");
				       text3.setToolTipText("Estimated amount if invested in Systematic Investement Plan ");
				}
				
				if((list.getItemAt(list.getSelectedIndex())).equals("Fixed Deposite") )
				{
					text3.setText("4321");
					text3.setToolTipText("Estimated amount if invested in Fixed Deposite Plan ");
				}
			}
/*			else
			{
				if(userInfo())	
				{		
					kyc.setSelected(true);		
				}	
			}
*/		}
		
/*		if(ae.getSource() == kyc)
		{
			if(userInfo())	
			{		
				kyc.setSelected(true);	
			}						
		}		
*/	}
	
/*	boolean userInfo()
	{	
		this.setVisible(false);
		Form f = new Form();
	
		if(f.b)
		{
		try{
			this.wait(100);
		}
		catch(Exception e)
		{JOptionPane.showMessageDialog(null, e.getMessage());}	
		
		}
		
		this.setVisible(true);
		return f.val;
	}
*/	
}

class demo
{
	public static void main(String arg[])
	{
		try
		{
			Invest frame=new Invest();
		}
		catch(Exception e)
		{JOptionPane.showMessageDialog(null, e.getMessage());}
		}
}
