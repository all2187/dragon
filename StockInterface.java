import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Date;

import javax.swing.*;

/**
 * DateTextField calendar source: http://stackoverflow.com/questions/11736878/display-calendar-to-pick-a-date-in-java
 * @author James Shin, Hala Lofty, Alexandre Lamy, Kevin Zhang
 *
 */
public class StockInterface extends JPanel{
	private static final int TOP_PANEL_SIZE = 800;
	
	private JPanel inputPanel;
	

	
	private void addComponentsToMain()
	{
		
		this.setLayout(new BorderLayout());
		
		//Dimension prefDim = new Dimension(TOP_PANEL_SIZE, TOP_PANEL_SIZE);
		//this.setPreferredSize(prefDim);
		this.add(inputPanel, BorderLayout.NORTH);
	}
	

	
	public StockInterface()
	{
		super();
		//Main panel
		inputPanel = new JPanel();
		inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
/*
		//Title
		JTextArea titleTextArea = new JTextArea();
		titleTextArea.setEditable(false);
		titleTextArea.setText("Insert Title Here");
		titleTextArea.setOpaque(false);
		JPanel titleTextPanel = new JPanel();
		titleTextPanel.add(titleTextArea);
		inputPanel.add(titleTextPanel);
*/		
		//Calendar Date
		DateTextField myCalendar = new DateTextField();
		JTextArea calendarTextArea = new JTextArea();
		calendarTextArea.setEditable(false);
		calendarTextArea.setText("Date:");
		calendarTextArea.setOpaque(false);
		JPanel calendarPanel = new JPanel();
		calendarPanel.add(calendarTextArea);
		calendarPanel.add(myCalendar);
		inputPanel.add(calendarPanel);
		
		//Days
		Integer[] numDays = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		JComboBox<Integer> days = new JComboBox<Integer>(numDays);
		JTextArea comboBoxArea = new JTextArea();
		comboBoxArea.setEditable(false);
		comboBoxArea.setText("Period length (days):");
		comboBoxArea.setOpaque(false);
		JPanel comboBoxPanel = new JPanel();
		comboBoxPanel.add(comboBoxArea);
		comboBoxPanel.add(days);
		inputPanel.add(comboBoxPanel);
		
	
		
		
		JPanel checkBoxPanel = new JPanel();
		checkBoxPanel.setLayout(new BoxLayout(checkBoxPanel, BoxLayout.Y_AXIS));

		JCheckBox mentionCheckBox = new JCheckBox("Mentions of company on social media");
		JCheckBox natEventCheckBox = new JCheckBox("National Events");
		JCheckBox intEventCheckBox = new JCheckBox("International Events");
		JCheckBox ecDataCheckBox = new JCheckBox("Economic Data Shifts");
		JCheckBox stockValueCheckBox = new JCheckBox("Stock Value Shifts");
		
		checkBoxPanel.add(mentionCheckBox);
		checkBoxPanel.add(natEventCheckBox);
		checkBoxPanel.add(intEventCheckBox);
		checkBoxPanel.add(ecDataCheckBox);
		checkBoxPanel.add(stockValueCheckBox);

		inputPanel.add(checkBoxPanel);
		
		
		JTextArea outputArea = new JTextArea();
		Action getAllInfo = new AbstractAction()
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				UserSelection currentSelection = new UserSelection(myCalendar.getDate(), (Integer)days.getSelectedItem(), mentionCheckBox.isSelected(), natEventCheckBox.isSelected(), intEventCheckBox.isSelected(), ecDataCheckBox.isSelected(), stockValueCheckBox.isSelected());
				outputArea.setText(currentSelection.toString());
				//System.out.println(currentSelection);
				
			}
		};
		
		getAllInfo.putValue(Action.NAME, "Calculate");
		JButton myButton = new JButton(getAllInfo);
		inputPanel.add(myButton);
		
		
		
		//outputArea = new JTextArea();
		outputArea.setEditable(false);
		outputArea.setText("hello");
		//outputArea.setOpaque(false);
		
		inputPanel.add(outputArea);
		
		addComponentsToMain();

		
	}
	

}
