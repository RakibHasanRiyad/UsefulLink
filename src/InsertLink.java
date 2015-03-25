import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class InsertLink extends JFrame {
	
	public InsertLink()
	{
		JPanel panel = new JPanel();
		JButton btn1= new JButton();
		btn1.setText("Insert");
		JButton btn2= new JButton();
		btn2.setText("Update");
		
		panel.add(btn1);
		panel.add(btn2);
		add(panel);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InsertLink obj = new InsertLink();
		obj.setVisible(true);
		obj.setSize(400, 200);
		obj.setLocationRelativeTo(null);
				

	}

}
