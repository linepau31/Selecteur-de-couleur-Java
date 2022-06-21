import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

	JButton button;
	JLabel label;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button =  new JButton("Clic");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.gray);
		label.setText("Change de couleur ! ");
		label.setFont(new Font("MV Boli",Font.PLAIN,100));
		label.setOpaque(true);
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			JColorChooser colorChooser = new JColorChooser();
			Color color = JColorChooser.showDialog(null, "On change la couleur ici !", Color.black); // la fenetre avec les couleurs
			
			label.setForeground(color); // changer le texte
			//label.setBackground(color); // changer l'arrière plan 
		}
		
	}
	
}
