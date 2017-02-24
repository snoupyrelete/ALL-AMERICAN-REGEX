package regex.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
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
		
//		this.checkIcon = new ImageIcon(getClass().getResource("/poke/view/images/pokeball.png"));
//		this.failIcon = new ImageIcon(getClass().getResource("/"));
		
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
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if (baseController.checkFirstName(firstNameField.getText()))
				{
					System.out.println("First name is good");
				}
				if (baseController.checkLastName(lastNameField.getText()))
				{
					System.out.println("Last name is good");
				}
				if (baseController.checkPhoneNumber(phoneNumberField.getText()))
				{
					System.out.println("Phone number is good");
				}
				//baseController.checkPhoneNumber(phoneNumberField.getText());
				if (baseController.checkEmail(emailField.getText()))
				{
					System.out.println("Email is good");
				}
			}
		});
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 6, SpringLayout.SOUTH, emailField);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 107, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstNameLabel, 29, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, emailField, 92, SpringLayout.EAST, emailLabel);
		baseLayout.putConstraint(SpringLayout.WEST, phoneNumberField, 37, SpringLayout.EAST, phoneNumberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, lastNameField, 6, SpringLayout.SOUTH, firstNameField);
		baseLayout.putConstraint(SpringLayout.WEST, lastNameField, 67, SpringLayout.EAST, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, firstNameField, -5, SpringLayout.NORTH, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, firstNameField, 0, SpringLayout.WEST, lastNameField);
		baseLayout.putConstraint(SpringLayout.NORTH, lastNameLabel, 16, SpringLayout.SOUTH, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneNumberField, 6, SpringLayout.SOUTH, lastNameField);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneNumberLabel, 16, SpringLayout.SOUTH, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, emailLabel, 16, SpringLayout.SOUTH, phoneNumberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, emailField, -5, SpringLayout.NORTH, emailLabel);
		baseLayout.putConstraint(SpringLayout.WEST, emailLabel, 0, SpringLayout.WEST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, phoneNumberLabel, 0, SpringLayout.WEST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, lastNameLabel, 27, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstNameLabel, 0, SpringLayout.WEST, lastNameLabel);
	}
}
