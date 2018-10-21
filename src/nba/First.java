package nba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;

public class First extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTa1;
	private JTextField textFieldTa2;
	private JTextField textFieldTa3;
	private JTextField textFieldTa4;
	private JTextField textFieldTa5;
	private JTextField textFieldTa6;
	private JTextField textFieldResult;
	private JTextField textFieldTb1;
	private JTextField textFieldTb2;
	private JTextField textFieldTb4;
	private JTextField textFieldTb5;
	private JTextField textFieldTb6;
	private JTextField textFieldTb3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First frame = new First();
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
	public First() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1232, 773);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 248, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSecondpage = new JLabel("Effective Field Goal Percentage");
		lblSecondpage.setForeground(new Color(0, 0, 0));
		lblSecondpage.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblSecondpage.setBounds(184, 97, 287, 29);
		contentPane.add(lblSecondpage);
		
		JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			FrontPage trying = new FrontPage();
			trying.frame.setVisible(true);
			
			}
		});
		btnBack.setBounds(898, 626, 107, 47);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("Free Throw Attempt Rate");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel.setBounds(184, 158, 287, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Team Turnover Percentage");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_1.setBounds(184, 216, 287, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Offensive Rebound Percentage");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_2.setBounds(184, 280, 287, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Standing");
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_3.setBounds(184, 343, 287, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Team Current Value");
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_4.setBounds(184, 401, 287, 21);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Predicted Result");
		lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_5.setBounds(184, 503, 287, 21);
		contentPane.add(lblNewLabel_5);
		
		textFieldTa1 = new JTextField();
		textFieldTa1.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTa1.setBounds(682, 98, 96, 27);
		contentPane.add(textFieldTa1);
		textFieldTa1.setColumns(10);
		
		textFieldTa2 = new JTextField();
		textFieldTa2.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTa2.setBounds(682, 155, 96, 27);
		contentPane.add(textFieldTa2);
		textFieldTa2.setColumns(10);
		
		textFieldTa3 = new JTextField();
		textFieldTa3.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTa3.setBounds(682, 216, 96, 27);
		contentPane.add(textFieldTa3);
		textFieldTa3.setColumns(10);
		
		textFieldTa4 = new JTextField();
		textFieldTa4.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTa4.setBounds(682, 277, 96, 27);
		contentPane.add(textFieldTa4);
		textFieldTa4.setColumns(10);
		
		textFieldTa5 = new JTextField();
		textFieldTa5.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTa5.setBounds(682, 340, 96, 27);
		contentPane.add(textFieldTa5);
		textFieldTa5.setColumns(10);
		
		textFieldTa6 = new JTextField();
		textFieldTa6.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTa6.setBounds(682, 398, 96, 27);
		contentPane.add(textFieldTa6);
		textFieldTa6.setColumns(10);
		
		textFieldResult = new JTextField();
		textFieldResult.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldResult.setBounds(682, 500, 96, 27);
		contentPane.add(textFieldResult);
		textFieldResult.setColumns(10);
		

		
		
		textFieldTb1 = new JTextField();
		textFieldTb1.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTb1.setBounds(898, 98, 96, 27);
		contentPane.add(textFieldTb1);
		textFieldTb1.setColumns(10);
		
		textFieldTb2 = new JTextField();
		textFieldTb2.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTb2.setBounds(898, 155, 96, 27);
		contentPane.add(textFieldTb2);
		textFieldTb2.setColumns(10);
		
		textFieldTb3 = new JTextField();
		textFieldTb3.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTb3.setBounds(898, 216, 96, 27);
		contentPane.add(textFieldTb3);
		textFieldTb3.setColumns(10);
		
		textFieldTb4 = new JTextField();
		textFieldTb4.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTb4.setBounds(898, 280, 96, 27);
		contentPane.add(textFieldTb4);
		textFieldTb4.setColumns(10);
		
		textFieldTb5 = new JTextField();
		textFieldTb5.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTb5.setBounds(898, 340, 96, 27);
		contentPane.add(textFieldTb5);
		textFieldTb5.setColumns(10);
		
		textFieldTb6 = new JTextField();
		textFieldTb6.setFont(new Font("宋体", Font.BOLD, 18));
		textFieldTb6.setBounds(898, 401, 96, 27);
		contentPane.add(textFieldTb6);
		textFieldTb6.setColumns(10);
		
		JButton btnNewButton = new JButton("predict");
		btnNewButton.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
					if(dataProcess(arr,"dataNBA.csv")==0) {
						textFieldResult.setText("B wins");
					}
					else {
						textFieldResult.setText("A wins");
					}
					
				
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Please fill all the fields with valid inputs!");
				}
			}
		});
		btnNewButton.setBounds(898, 499, 141, 47);
		contentPane.add(btnNewButton);
		
		JLabel lblTeamA = new JLabel("Team A");
		lblTeamA.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblTeamA.setBounds(682, 38, 96, 45);
		contentPane.add(lblTeamA);
		
		JLabel lblTeamB = new JLabel("Team B");
		lblTeamB.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblTeamB.setBounds(898, 38, 96, 45);
		contentPane.add(lblTeamB);
		
		JButton btnClear = new JButton("clear");
		btnClear.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		btnClear.setBounds(682, 626, 107, 47);
		contentPane.add(btnClear);
	}
	public static int dataProcess(int[] arr,String fileName) {
		ArrayList<ArrayList<String>> array=readData.read(fileName);
		
		int[][] file=new int[array.size()][array.get(0).size()];
		for(int i=0;i<array.size();i++) {
			for(int j=0;j<array.get(0).size();j++) {
				file[i][j]=Integer.parseInt(array.get(i).get(j));
			}
		}
		
		int dimension=file[0].length-1;
		int[][][] data=new int[dimension][2][2];
		int[] y=new int[2];
		
		for(int i=2;i<file.length;i++) {
			for(int j=0;j<dimension;j++) {
				data[j][file[i][dimension]][file[i][j]]+=1;
			}
			y[file[i][dimension]]+=1;
		}
		
		double[][][] result=new double[dimension][2][2];
		
		for(int i=0;i<dimension;i++) {
			for(int j=0;j<2;j++) {
				double sum=(double)(data[i][j][0]+data[i][j][1]+2);
				for(int k=0;k<2;k++) {
					result[i][j][k]=(data[i][j][k]+1)/sum;
				}
			}
		}
		
		double y0=y[0]/((double)(y[0]+y[1]));
		double y1=1-y0;
		
		//int[] user=new int[dimension];   //add user data here
		
		int[] user= arr;
		
		double fail=1.0;
		double win=1.0;
		
		for(int i=0;i<dimension;i++) {
			fail*=result[i][0][user[i]];
		}
		fail*=y0;
		for(int i=0;i<dimension;i++) {
			win*=result[i][1][user[i]];
		}
		win*=y1;
		
		if (fail>win) {
			return 0;
		}
		else {
			return 1;
		}
	
	}
}
