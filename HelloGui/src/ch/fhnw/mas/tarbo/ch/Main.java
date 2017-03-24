package ch.fhnw.mas.tarbo.ch;

import javax.swing.UIManager;

import ch.fhnw.mas.tarbo.ch.*;

public class Main {

	public static void main(String [] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
			ex.printStackTrace();
		}		
		new Gui();
	}
}
