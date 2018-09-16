import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class run
{
	public static void main(String arg[])
	{
		Banner f = new Banner();
		
		try
		{
			Login frame=new Login();
		}
		catch(Exception e)
		{JOptionPane.showMessageDialog(null, e.getMessage());}
	}
}
