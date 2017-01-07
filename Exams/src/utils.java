import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class utils{

	private static final String defaultPkgLoc = "2016-12-18_18-57-58";
	private static String packageLoc;
	
	public static void main(String[] args) {
		
		JPanel panel = new JPanel() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 2229772664462187424L;

			@Override
            public Dimension getPreferredSize() {
                return new Dimension(300, 500);
            }
        };
        
        
        JTextArea textArea = new JTextArea();
        textArea.setEditable(true);
        panel.setLayout(new BorderLayout());
        panel.add(new JScrollPane(textArea));
        
//        Font[] fonts  = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
//        for (int i = 0; i < fonts.length; i++) {
//          System.out.print(fonts[i].getFontName() + " : ");
//          System.out.print(fonts[i].getSize() + " : ");
//          System.out.print(fonts[i].getName());
//          System.out.println();
//        }
        
//        packageLoc = (String)JOptionPane.showConfirmDialog(null,
//                panel, //Here goes content
//                "Here goes the title",
//                JOptionPane.OK_CANCEL_OPTION, // Options for JOptionPane
//                JOptionPane.ERROR_MESSAGE); // Message type
        
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(  
                "Arial", Font.BOLD,30)));
		 packageLoc = (String) showInputDialog(null, 
				 "Please file:", 
				 "Removed unwanted characters", 
				 JOptionPane.QUESTION_MESSAGE,
				 null,
				 null, 
				 defaultPkgLoc);             
		  if (packageLoc == null && packageLoc.length() == 0)  {       System.out.println("No file name specified.\nExample: " + defaultPkgLoc + " \nProgram will terminate.");       System.exit(0);;     }
		
		System.out.println("q" + packageLoc.replaceAll("-", "").replaceAll("_", ""));

	}

	@SuppressWarnings("unused")
	private static Object showInputDialog(Component parentComponent,
	        Object message, String title, int messageType, Icon icon,
	        Object[] selectionValues, Object initialSelectionValue) {
		
		 JOptionPane    pane = new JOptionPane(message, messageType,
				 JOptionPane.OK_CANCEL_OPTION, icon,
                 null, null);

		pane.setWantsInput(true);
		pane.setSelectionValues(selectionValues);
		pane.setInitialSelectionValue(initialSelectionValue);
		Object p = pane.getMessage();
		pane.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		JDialog dialog = pane.createDialog(title);
		pane.selectInitialValue();
		dialog.setSize(new Dimension(600, 200));
		dialog.setResizable(true);
		dialog.setVisible(true);
		//dialog.setFont(new Font("Times New Roman", Font.PLAIN, 90));
		//System.out.println(p.getSize());
		dialog.dispose();

		Object value = pane.getInputValue();

		if (value == JOptionPane.UNINITIALIZED_VALUE) {
			return null;
		}
		return value;
	}
	
}
