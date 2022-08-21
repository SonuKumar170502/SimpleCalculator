package simpleCalcy;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class SimpleCalcy extends JFrame implements ActionListener {
	JLabel jl1,jl2;
	JLabel result;
	JTextField jtext1,jtext2;
	JButton btn1,btn2,btn3,btn4;
	SimpleCalcy()
	{
	  setLayout(new GridLayout(6,2,10,10));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jl1 = new JLabel("Enter Your First Number");
      jl2 = new JLabel("Enter Your Second Number");
      
      jtext1 = new JTextField("0");
      jtext2 = new JTextField("0");
      
      btn1 = new JButton("+");
      btn1.setFont(new Font("Serif", Font.PLAIN, 30));
      btn1.setBackground(Color.GREEN);
      
      btn2 = new JButton("-");
      btn2.setFont(new Font("Serif", Font.PLAIN, 30));
      btn2.setBackground(Color.RED);
      
      btn3 = new JButton("*");
      btn3.setFont(new Font("Serif", Font.PLAIN, 30));
      btn3.setBackground(Color.cyan);
      
      btn4 = new JButton("/");
      btn4.setFont(new Font("Serif", Font.PLAIN, 30));
      btn4.setBackground(Color.yellow);
      
      add(jl1);add(jtext1);
      add(jl2);add(jtext2);
      add(btn1);add(btn2);add(btn3);add(btn4);
      
      result = new JLabel("Result : ");
      result.setForeground(Color.RED);
      result.setFont(new Font("Arial", Font.BOLD, 30));
      add(result);
      
      btn1.addActionListener(this);
      btn2.addActionListener(this);
      btn3.addActionListener(this);
      btn4.addActionListener(this);
      
      setTitle("Simple_Calculator");
      setBounds(100,50,500,400);
      setResizable(false);
      setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btn1)
		{
			int x = Integer.parseInt(jtext1.getText());
			int y = Integer.parseInt(jtext2.getText());
			int sum = x+y;
			result.setText("Result : " + sum);
		}
		
		else if(ae.getSource()==btn2)
		{
			int x = Integer.parseInt(jtext1.getText());
			int y = Integer.parseInt(jtext2.getText());
			int sub = x-y;
			result.setText("Result : " + sub);
		}
		
		else if(ae.getSource()==btn3)
		{
			int x = Integer.parseInt(jtext1.getText());
			int y = Integer.parseInt(jtext2.getText());
			int Multi = x*y;
			result.setText("Result : " + Multi);
		}
		
		else if(ae.getSource()==btn4)
		{
			int x = Integer.parseInt(jtext1.getText());
			int y = Integer.parseInt(jtext2.getText());
			float div = x/y;
			result.setText("Result : " + div);
		}
		
	}
	
	
	

	public static void main(String[] args) {
		new SimpleCalcy();

	}

}
