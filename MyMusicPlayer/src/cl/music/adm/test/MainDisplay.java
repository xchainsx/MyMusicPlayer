package cl.music.adm.test;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

public class MainDisplay {
	  Display d =  null;
	public MainDisplay() {
		// TODO Auto-generated constructor stub
		this.d = Display.getDefault();		
		Shell shell = new Shell(d, SWT.SHELL_TRIM);
		shell.setText("Shell ejemplo");
		shell.addListener(SWT.Close, new Listener() {
			
			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				Display.getDefault().dispose();
				
				
			}
		});
		
		shell.setMaximized(true);
		shell.open();

	}
	
	
	
	

}
