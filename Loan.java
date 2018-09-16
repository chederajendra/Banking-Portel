import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Loan extends Temp implements ActionListener
{
	JButton SUBMIT ;
	JLabel label1,label2 , label3 , title ;
	final JTextField  text1,text2 , text3 ;
	
	Loan()
	{
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		
		title = new JLabel("Loan Portal");
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
		
		SUBMIT=new JButton("SUBMIT");
		Dimension bsize = SUBMIT.getPreferredSize();
		SUBMIT.setBounds(450,300, bsize.width, bsize.height);
		SUBMIT.addActionListener(this);	
		
		label3 = new JLabel();
		label3.setText("Estimated EMI :");
		label3.setBounds(350,350, size.width + 50, size.height);
	 	
		text3 = new JTextField(15);
		text3.setBounds(500,350, tsize.width, tsize.height);
		text3.setEditable( false );		
		
		panel.add(title);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(text1);
		panel.add(text2);
		panel.add(text3);
		panel.add(SUBMIT);				
				
		add(panel,BorderLayout.CENTER);
		this.setVisible(true);
		text1.requestFocusInWindow();
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if ( ae.getSource() == SUBMIT )
		{
			text3.setText("1234");
		}
		
	}
	
}

class demo
{
	public static void main(String arg[])
	{
		try
		{
			Loan frame=new Loan();
		}
		catch(Exception e)
		{JOptionPane.showMessageDialog(null, e.getMessage());}
		}
}
