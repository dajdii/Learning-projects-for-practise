package com.daviddang;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class CurrencyConverter {

	private JFrame frmApplication;
	private JTextField textFieldAmount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrencyConverter window = new CurrencyConverter();
					window.frmApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CurrencyConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmApplication = new JFrame();
		frmApplication.setForeground(Color.WHITE);
		frmApplication.setTitle("Currency Converter Application");
		frmApplication.setBounds(100, 100, 513, 510);
		frmApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmApplication.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Currency Converter");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(106, 11, 284, 77);
		frmApplication.getContentPane().add(btnNewButton);
		
		textFieldAmount = new JTextField();
		textFieldAmount.setBounds(162, 99, 172, 54);
		frmApplication.getContentPane().add(textFieldAmount);
		textFieldAmount.setColumns(10);
		
		JLabel lblResult = new JLabel("0");
		lblResult.setBackground(new Color(255, 255, 0));
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(162, 277, 172, 31);
		frmApplication.getContentPane().add(lblResult);
		
		JLabel lblAmount = new JLabel("Amount:");
		lblAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAmount.setBounds(37, 121, 97, 51);
		frmApplication.getContentPane().add(lblAmount);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFrom.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrom.setBounds(37, 154, 97, 51);
		frmApplication.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo.setBounds(37, 206, 97, 51);
		frmApplication.getContentPane().add(lblTo);
		
		JComboBox cbFrom = new JComboBox();
		cbFrom.setModel(new DefaultComboBoxModel(new String[] {"CZK", "EUR", "USD"}));
		cbFrom.setBounds(162, 164, 172, 35);
		frmApplication.getContentPane().add(cbFrom);
		
		JComboBox cbTo = new JComboBox();
		cbTo.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CZK"}));
		cbTo.setBounds(162, 216, 172, 35);
		frmApplication.getContentPane().add(cbTo);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double amount = Double.parseDouble(textFieldAmount.getText());
				Double convert;
				
				if(cbFrom.getSelectedItem().toString() == "CZK" && cbTo.getSelectedItem().toString() == "EUR") {
					convert = amount / 24.78;
					lblResult.setText(convert.toString());
				} else if(cbFrom.getSelectedItem().toString() == "CZK" && cbTo.getSelectedItem().toString() == "USD") {
					convert = amount / 24.38;
					lblResult.setText(convert.toString());
				} else if(cbFrom.getSelectedItem().toString() == "CZK" && cbTo.getSelectedItem().toString() == "CZK") {
					lblResult.setText(amount.toString());
				} else if(cbFrom.getSelectedItem().toString() == "EUR" && cbTo.getSelectedItem().toString() == "EUR") {
					lblResult.setText(amount.toString());
				} else if(cbFrom.getSelectedItem().toString() == "EUR" && cbTo.getSelectedItem().toString() == "USD") {
					convert = (amount *24.78) / 24.38;
					lblResult.setText(convert.toString());
				} else if(cbFrom.getSelectedItem().toString() == "EUR" && cbTo.getSelectedItem().toString() == "CZK") {
					convert = amount * 24.78;
					lblResult.setText(convert.toString());
				} else if(cbFrom.getSelectedItem().toString() == "USD" && cbTo.getSelectedItem().toString() == "EUR") {
					convert = (amount * 0.98);
					lblResult.setText(convert.toString());
				}
			}
		});
		btnConvert.setBackground(new Color(255, 140, 0));
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnConvert.setBounds(170, 370, 144, 65);
		frmApplication.getContentPane().add(btnConvert);
		
		JLabel lblNewLabel = new JLabel("Result:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(37, 268, 97, 51);
		frmApplication.getContentPane().add(lblNewLabel);
		
		
	}
}
