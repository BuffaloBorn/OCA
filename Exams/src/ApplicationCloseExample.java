import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class ApplicationCloseExample
{   
    private WindowListener l;

	private void displayGUI()
    {
        final JFrame frame = new JFrame("Application Close Example");

        frame.addWindowListener(l);
        
        frame.addWindowListener(new WindowListener()
        {
        	@Override
            public void windowClosing(WindowEvent we)
            {
                int result = JOptionPane.showConfirmDialog(
                                frame, "Do you want to Exit ?"
                                , "Exit Confirmation : ", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION)               
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                else if (result == JOptionPane.NO_OPTION)   
                    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				  
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
        });

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void main(String... args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new ApplicationCloseExample().displayGUI();
            }
        });
    }
}
