package cl.music.adm.test;

import org.eclipse.swt.widgets.Display;

public class UITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display display = new Display();
		new MainDisplay();
		
		System.out.println("Hello World");
		
		while(!display.isDisposed()) {
			if (!display.readAndDispatch ()) display.sleep ();
			
		}
		display.dispose();

	}

}
