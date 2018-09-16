import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  
public class Login extends Temp implements ActionListener , Runnable
 {
	JButton SUBMIT;
	JLabel label1,label2 , label3;
	final JTextField  text1,text2;
	
	Login()
	{
		label1 = new JLabel();
		label1.setText("Username:");
		Dimension size = label1.getPreferredSize();
		label1.setBounds(350,185, size.width, size.height);
	 	
		text1 = new JTextField(15);
		Dimension tsize = text1.getPreferredSize();
		text1.setBounds(500,185, tsize.width, tsize.height);
		text1.setToolTipText("Enter User Name");
		text1.requestFocusInWindow();
	 	
		label2 = new JLabel();
		label2.setText("Password:");
		label2.setBounds(350,235, size.width, size.height);
	  
		text2 = new JPasswordField(15);	 
		text2.setBounds(500,235, tsize.width, tsize.height); 
		text2.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {	
		}
		 public void focusLost(FocusEvent e) {
			label3.setText("");	
		}});
		
		label3 = new JLabel();
		label3.setText("");
		label3.setBounds(500,235 + tsize.height, size.width + 50, size.height);
		label3.setForeground (Color.green);
	  
		SUBMIT=new JButton("SUBMIT");
		Dimension bsize = SUBMIT.getPreferredSize();
		SUBMIT.setBounds(450,285, bsize.width, bsize.height);
		SUBMIT.addActionListener(this);
		   	
		Thread t = new Thread(this);   
		   
		panel.add(label1);
		panel.add(text1);
		panel.add(label2);
		panel.add(text2);
		panel.add(SUBMIT);
		panel.add(label3);
		add(panel,BorderLayout.CENTER);
		
		t.start();
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if ( ae.getSource() == SUBMIT )
		{
			String value1=text1.getText();
			String value2=text2.getText();
		
			if (value1.equals("admin") && value2.equals("admin")) 
			{
				this.setVisible(false);
				HomePage page=new HomePage(value1);
			}
			else
			{
				text1.setText("");
				text2.setText("");
			 
			 JOptionPane.showMessageDialog(this,"Invalid login or password","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public void run()
	{
		try
		{
			Thread.sleep(7000);
		}
		catch(InterruptedException e)
		{}

		this.setVisible(true);
	
		for(;;)
		{
			if(text2.isFocusOwner())
			{
				if( Toolkit.getDefaultToolkit().getLockingKeyState (KeyEvent.VK_CAPS_LOCK ) )
				{
					text2.setToolTipText("Warning : CAPS LOCK is on");
				}
				else
					text2.setToolTipText("");
				
				 if((text2.getText()).length() < 6)
				 	label3.setText("Weak Password");
				 else	
					 label3.setText("");
			}

		}
	}
	
}


	 		
