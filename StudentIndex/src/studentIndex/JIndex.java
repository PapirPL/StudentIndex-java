package studentIndex;

import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.EmptyBorder;

import index.model.Academy;
import index.model.Course;

public class JIndex extends JFrame {
	private static final long serialVersionUID = 1L;
	private Academy academy;
	private JSplitPane contentPane;
	

	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JIndex frame = new JIndex();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			});	
	}
	private void setDefaultValues(){
		Academy academy= new Academy("university of technology");
		academy.addCourse(new Course("automatics"));
		academy.addCourse(new Course("electrotechnics"));
		academy.addCourse(new Course("somethingics"));
		
		}
	public JIndex() {
		setDefaultValues();
		setTitle("Index");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 965, 744);
		contentPane = new JSplitPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		{
			JPanel leftPanel = new JPanel();
			leftPanel.setBorder(null);
			GridBagLayout gridBagLayout = new GridBagLayout();
			gridBagLayout.columnWidths = new int[] { 0, 0 };
			gridBagLayout.rowHeights = new int[] { 0, 0, 0 };
			gridBagLayout.columnWeights = new double[] { 1.0, 1.0E-4 };
			gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 1.0E-4 };
			leftPanel.setLayout(gridBagLayout);
			contentPane.setLeftComponent(leftPanel);
			
		}
	}
	
	
	}

