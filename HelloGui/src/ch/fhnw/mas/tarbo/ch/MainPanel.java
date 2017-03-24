package ch.fhnw.mas.tarbo.ch;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JTextField;

public class MainPanel extends JPanel {

	private JButton calcButton = new JButton("Calculate");
	private JTextField inpText = new JTextField(10);
	private JTextField outpText = new JTextField(10);
	
   	
	public MainPanel() {
		setLayout(new BorderLayout());
								
		JPanel northPane = new JPanel();
				
					
		northPane.add(inpText);
		northPane.add(calcButton);
		northPane.add(outpText);
		
		this.add(northPane, BorderLayout.NORTH);
		
		
		calcButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				onCalcButtonClicked();
			}
		});
			
	}
	
	private void onCalcButtonClicked()
	{
		System.out.println("Button Clicked");
		MathUtils m = new MathUtils();
		int res = m.faculty( Integer.parseInt(inpText.getText()));
		outpText.setText(  Integer.toString(res));
		
		
	}
	
}
