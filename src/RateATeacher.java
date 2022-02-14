import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class RateATeacher extends Page {

	public RateATeacher() {
		super("Rate a teacher");

		addSpecialText(50, 30, "Rate a teacher");
		addComboBoxComponent(50, 90, "Teacher", new String[] { "Stoicho Stoev", "Nina Nencheva" });

		JTextArea txtRating = new JTextArea();
		txtRating.setBounds(50, 420, 200, 30);
		txtRating.setEditable(false);
		txtRating.setFont(font);
		txtRating.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		add(txtRating);

		JButton btnUp = new JButton(new ImageIcon("src/up.png"));
		btnUp.setFont(btnFont);
		btnUp.setBounds(50, 160, 260, 220);
		btnUp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtRating.setText("Like");
			}
		});
		add(btnUp);

		JButton btnDown = new JButton(new ImageIcon("src/down.png"));
		btnDown.setFont(btnFont);
		btnDown.setBounds(350, 160, 260, 220);
		btnDown.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtRating.setText("Disike");
			}
		});
		add(btnDown);

		JLabel lblComment = new JLabel("Description");
		lblComment.setFont(font);
		lblComment.setBounds(650, 50, 100, 25);
		add(lblComment);
		
		JTextArea txtComment = new JTextArea();
		txtComment.setFont(font);
		txtComment.setLineWrap(true);
		txtComment.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JScrollPane sc = new JScrollPane(txtComment);
		sc.setBounds(650, 80, 300, 300);
		add(sc);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(btnFont);
		btnBack.setBounds(610, 420, 150, 30);
		add(btnBack);
		
		JButton btnGrade = new JButton("Rate a teacher");
		btnGrade.setFont(btnFont);
		btnGrade.setBounds(800, 420, 150, 30);
		add(btnGrade);
	}
}
