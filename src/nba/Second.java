package nba;

import java.awt.BorderLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class Second extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTa1;
	private JTextField textFieldTb1;
	private JTextField textFieldTa2;
	private JTextField textFieldTb2;
	private JTextField textFieldTa3;
	private JTextField textFieldTb3;
	private JTextField textFieldTa4;
	private JTextField textFieldTb4;
	private JTextField textFieldTa5;
	private JTextField textFieldTb5;
	private JTextField textFieldTa6;
	private JTextField textFieldTb6;
	private JTextField textFieldResult;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Second frame = new Second();
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
	public Second() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 892, 710);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				FrontPage back = new FrontPage();
				back.frame.setVisible(true);
			}
		});
		btnBack.setBounds(554, 543, 123, 52);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("Effective Field Goal Percentage");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel.setBounds(60, 101, 287, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Free Throw Attempt Rate");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_1.setBounds(60, 153, 287, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Team Turnover Percentage");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_2.setBounds(60, 204, 287, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Offensive Rebound Percentage");
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_3.setBounds(60, 260, 287, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Standing");
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_4.setBounds(60, 314, 287, 21);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Team Current Value");
		lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_5.setBounds(60, 371, 287, 21);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Known Result(A won or B won)");
		lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_6.setBounds(60, 456, 287, 21);
		contentPane.add(lblNewLabel_6);
		
		textFieldTa1 = new JTextField();
		textFieldTa1.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTa1.setBounds(375, 98, 96, 27);
		contentPane.add(textFieldTa1);
		textFieldTa1.setColumns(10);
		
		textFieldTb1 = new JTextField();
		textFieldTb1.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTb1.setBounds(554, 98, 96, 27);
		contentPane.add(textFieldTb1);
		textFieldTb1.setColumns(10);
		
		textFieldTa2 = new JTextField();
		textFieldTa2.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTa2.setBounds(375, 150, 96, 27);
		contentPane.add(textFieldTa2);
		textFieldTa2.setColumns(10);
		
		textFieldTb2 = new JTextField();
		textFieldTb2.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTb2.setBounds(554, 150, 96, 27);
		contentPane.add(textFieldTb2);
		textFieldTb2.setColumns(10);
		
		textFieldTa3 = new JTextField();
		textFieldTa3.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTa3.setBounds(375, 201, 96, 27);
		contentPane.add(textFieldTa3);
		textFieldTa3.setColumns(10);
		
		textFieldTb3 = new JTextField();
		textFieldTb3.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTb3.setBounds(554, 201, 96, 27);
		contentPane.add(textFieldTb3);
		textFieldTb3.setColumns(10);
		
		textFieldTa4 = new JTextField();
		textFieldTa4.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTa4.setBounds(375, 257, 96, 27);
		contentPane.add(textFieldTa4);
		textFieldTa4.setColumns(10);
		
		textFieldTb4 = new JTextField();
		textFieldTb4.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTb4.setBounds(554, 257, 96, 27);
		contentPane.add(textFieldTb4);
		textFieldTb4.setColumns(10);
		
		textFieldTa5 = new JTextField();
		textFieldTa5.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTa5.setBounds(375, 311, 96, 27);
		contentPane.add(textFieldTa5);
		textFieldTa5.setColumns(10);
		
		textFieldTb5 = new JTextField();
		textFieldTb5.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTb5.setBounds(554, 311, 96, 27);
		contentPane.add(textFieldTb5);
		textFieldTb5.setColumns(10);
		
		textFieldTa6 = new JTextField();
		textFieldTa6.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTa6.setBounds(375, 368, 96, 27);
		contentPane.add(textFieldTa6);
		textFieldTa6.setColumns(10);
		
		textFieldTb6 = new JTextField();
		textFieldTb6.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTb6.setBounds(554, 368, 96, 27);
		contentPane.add(textFieldTb6);
		textFieldTb6.setColumns(10);
		
		textFieldResult = new JTextField();
		textFieldResult.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldResult.setBounds(375, 453, 96, 27);
		contentPane.add(textFieldResult);
		textFieldResult.setColumns(10);
		
		JButton btnNewButton = new JButton("Save to database");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double Ta1,Ta2,Ta3,Ta4,Ta5,Ta6,Tb1,Tb2,Tb3,Tb4,Tb5,Tb6;
				try {
					Ta1 = Double.parseDouble(textFieldTa1.getText());
					Ta2 = Double.parseDouble(textFieldTa2.getText());
					Ta3 = Double.parseDouble(textFieldTa3.getText());
					Ta4 = Double.parseDouble(textFieldTa4.getText());
					Ta5 = Double.parseDouble(textFieldTa5.getText());
					Ta6 = Double.parseDouble(textFieldTa6.getText());
					Tb1 = Double.parseDouble(textFieldTb1.getText());
					Tb2 = Double.parseDouble(textFieldTb2.getText());
					Tb3 = Double.parseDouble(textFieldTb3.getText());
					Tb4 = Double.parseDouble(textFieldTb4.getText());
					Tb5 = Double.parseDouble(textFieldTb5.getText());
					Tb6 = Double.parseDouble(textFieldTb6.getText());
					int [] arr = new int [6];
					if(Ta1>Tb1) {
						arr[0] = 1;
					}else {
						arr[0] = 0;
					}
					if(Ta2>Tb2) {
						arr[1] = 1;
					}else {
						arr[1] = 0;
					}
					if(Ta3>Tb3) {
						arr[2] = 1;
					}else {
						arr[2] = 0;
					}
					if(Ta4>Tb4) {
						arr[3] = 1;
					}else {
						arr[3] = 0;
					}
					if(Ta5>Tb5) {
						arr[4] = 1;
					}else {
						arr[4] = 0;
					}
					if(Ta6>Tb6) {
						arr[5] = 1;
					}else {
						arr[5] = 0;
					}
					String result  = textFieldResult.getText();
					if(!result.equals("A won")&&!result.equals("B won")) {
						throw new IllegalArgumentException();
					}
					FileWriter pw = new FileWriter("dataNBA.csv",true);
			        StringBuilder sb = new StringBuilder();
			        for(int i=0;i<6;i++) {
			        	sb.append(""+arr[i]);
			        	sb.append(',');
			        }
			        
			        if(result.equals("A won")) {
			        	sb.append("1");
			        }
			        else {
			        	sb.append("0");
			        }
			       
			        sb.append('\n');

			        pw.write(sb.toString());
			        pw.close();
			        textFieldTa1.setText("");
					textFieldTa2.setText("");
					textFieldTa3.setText("");
					textFieldTa4.setText("");
					textFieldTa5.setText("");
					textFieldTa6.setText("");
					textFieldTb1.setText("");
					textFieldTb2.setText("");
					textFieldTb3.setText("");
					textFieldTb4.setText("");
					textFieldTb5.setText("");
					textFieldTb6.setText("");
					textFieldResult.setText("");
			        JOptionPane.showMessageDialog(null,"The database has been updated successfully!");
				
				} catch (Exception e2){
					JOptionPane.showMessageDialog(null, "Please fill all the fields with valid inputs!");
				}
			}
		});
		btnNewButton.setBounds(554, 456, 216, 52);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("Team A");
		lblNewLabel_7.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel_7.setBounds(375, 39, 81, 21);
		contentPane.add(lblNewLabel_7);
		
		JLabel label = new JLabel("Team A");
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		label.setBounds(554, 39, 81, 21);
		contentPane.add(label);
		
		btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldTa1.setText("");
				textFieldTa2.setText("");
				textFieldTa3.setText("");
				textFieldTa4.setText("");
				textFieldTa5.setText("");
				textFieldTa6.setText("");
				textFieldTb1.setText("");
				textFieldTb2.setText("");
				textFieldTb3.setText("");
				textFieldTb4.setText("");
				textFieldTb5.setText("");
				textFieldTb6.setText("");
				textFieldResult.setText("");
			}
		});
		btnClear.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnClear.setBounds(375, 543, 123, 52);
		contentPane.add(btnClear);
	}
}
