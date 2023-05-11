import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class demeinnamen extends JFrame {

	private JPanel contentPane;
	private JList faecher;
	private JButton btnAdd;
	private JButton btndelete;
	private JLabel labelFach;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demeinnamen frame = new demeinnamen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public demeinnamen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAdd = new JButton("Fach hinzufügen");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAdd.setBounds(44, 357, 145, 21);
		contentPane.add(btnAdd);
		
		btndelete = new JButton("Fach entfernen");
		btndelete.setBounds(199, 357, 134, 21);
		contentPane.add(btndelete);
		
		labelFach = new JLabel("irgendwas");
		labelFach.setBounds(28, 75, 87, 28);
		contentPane.add(labelFach);
		
		faecher = new JList();
		faecher.setBounds(10, 60, 499, 287);
		contentPane.add(faecher);
	}
}
