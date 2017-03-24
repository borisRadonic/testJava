package ch.fhnw.mas.tarbo.ch;

import javax.swing.JFrame;

public class Gui extends JFrame {

	public Gui()
	{
		super("fa...");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MainPanel mPane = new MainPanel();
		this.getContentPane().add(mPane);
		
		this.pack();
		this.setVisible(true);
	}
	
}
