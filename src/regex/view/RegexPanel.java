package regex.view;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import regex.controller.RegexController;
import java.awt.Dimension;

public class RegexPanel extends JPanel
{
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField phoneNumberField;
	private JTextField emailField;
	
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel phoneNumberLabel;
	private JLabel emailLabel;
	
	private JButton submitButton;


	private SpringLayout baseLayout;
	private RegexController baseController;
	
	public RegexPanel(RegexController baseController)
	{
		super();
		
		this.firstNameField = new JTextField("firstNameField");
		this.lastNameField = new JTextField("lastNameField");
		this.phoneNumberField = new JTextField("phoneNumberField");
		this.emailField = new JTextField("emailField");
		
		this.firstNameLabel = new JLabel("firstNameLabel");
		this.lastNameLabel = new JLabel("lastNameLabel");
		this.phoneNumberLabel = new JLabel("phoneNumberLabel");
		this.emailLabel = new JLabel("emailLabel");
		
		this.submitButton = new JButton("Submit");

		this.baseLayout = new SpringLayout();
		this.baseController = baseController;
		
		setupPanel();
		setupListeners();
		setupLayout();
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setMinimumSize(new Dimension(900, 600));
		
		this.add(firstNameField);
		this.add(lastNameField);
		this.add(phoneNumberField);
		this.add(emailField);
		this.add(firstNameLabel);
		this.add(lastNameLabel);
		this.add(phoneNumberLabel);
		this.add(emailLabel);
		this.add(submitButton);
		
	}
	
	private void setupListeners()
	{
		
		
	}
	
	private void setupLayout()
	{
		
	}
}
