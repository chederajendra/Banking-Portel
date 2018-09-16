// Program to demonstrate displaying image on frame
// It support .gif and .jpg format
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Banner extends JFrame implements Runnable
{
	static Image im;
	JPanel panel;

	Banner()	
	{
	
		this.setSize(800,300);
		this.setResizable(false);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
	
		

		im = Toolkit.getDefaultToolkit().getImage("a.png");				
		MediaTracker m = new MediaTracker(this);
		m.addImage(im,1);		
	
		panel=new JPanel(){ 
			public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawImage(im,0,0,this);
			}
		};
		panel.setLayout(null);
		
		setUndecorated(true);
		
		JLabel header = new JLabel();
		header.setFont(new Font("Century",Font.BOLD,30));
		header.setText("Universal");
		header.setForeground (Color.black);
		Dimension size = header.getPreferredSize();
		header.setBounds(500,100,size.width, size.height);
		
		JLabel header2 = new JLabel();
		header2.setFont(new Font("Century",Font.BOLD,30));
		header2.setText("Banking Portal");
		header2.setForeground (Color.black);
		header2.setBounds(450,150,size.width + 100, size.height);
		
		JLabel label = new JLabel();
		label.setFont(new Font("Century",Font.ITALIC,20));
		label.setText("-Copyrights Reserved by");
		label.setForeground (Color.black);
		label.setBounds(450,220,size.width + 150, size.height);
		
		JLabel label1 = new JLabel();
		label1.setFont(new Font("Century",Font.ITALIC,20));
		label1.setText(" BNikhil");
		label1.setForeground (Color.black);
		label1.setBounds(650,250,size.width + 150, size.height);		
		
		panel.add(header);
		panel.add(label);
		panel.add(label1);
		panel.add(header2);
		add(panel,BorderLayout.CENTER);
		
		this.setVisible(true);

		Thread t = new Thread(this);  
		t.start();	
	}
	
	public void run()
	{
		try
		{
			Thread.sleep(7000);
		}
		catch(InterruptedException e)
		{}

		dispose();
	}

public static void main (String[] args){new Banner();}

}
