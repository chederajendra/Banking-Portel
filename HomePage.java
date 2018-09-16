import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage extends Temp implements ActionListener
{
	JLabel label;
	JButton invest , loan;

	HomePage(String value)
	{
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		
		label = new JLabel("Welcome:"+value);
		Dimension size = label.getPreferredSize();
		label.setBounds(40,140, size.width + 60, size.height);	
		label.setFont(new Font("Century",Font.BOLD,17));	
		label.setForeground (Color.blue);
		
		invest=new JButton("INVEST");
		Dimension bsize = invest.getPreferredSize();
		invest.setBounds(450,275, bsize.width, bsize.height);
		invest.addActionListener(this);
		
		loan=new JButton("LOAN");
		Dimension b2size = loan.getPreferredSize();
		loan.setBounds(450,350, b2size.width, b2size.height);
		loan.addActionListener(this);
		
		panel.add(label);
		panel.add(invest);
		panel.add(loan);
				
		add(panel,BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if ( ae.getSource() == invest )
		{
			this.setVisible(false);
			Invest obj = new Invest();
		}
		
		if ( ae.getSource() == loan )
		{
			this.setVisible(false);
			Loan l = new Loan();
		}
	}
	
}

class demo
{
	public static void main(String arg[])
	{
		try
		{
			HomePage frame=new HomePage("nikhil");
		}
		catch(Exception e)
		{JOptionPane.showMessageDialog(null, e.getMessage());}
		}
}
