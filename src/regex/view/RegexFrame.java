package regex.view;

import java.awt.Dimension;

import javax.swing.JFrame;

import regex.controller.RegexController;
import regex.view.RegexPanel;

public class RegexFrame extends JFrame
{
	private RegexController baseController;

	private RegexPanel regexPanel;

	public RegexFrame(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		regexPanel = new RegexPanel(baseController);
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(regexPanel);
		this.setTitle("Sudoku Window");
		this.setSize(new Dimension(900, 600));
		this.setVisible(true);
	}	
}
