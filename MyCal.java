
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyCal extends JFrame implements ActionListener
{
   public static void main(String args[])
   {
      new MyCal();
   }
   
   JTextField t;
   JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bdec,bdel,bclr,br;
   double a=0,b=0,r=0;
	   int op=0;
   public MyCal()
   {
   setSize(300,400);
   setLocation(100,200);
   setLayout(null);
   
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   t=new JTextField();
   t.setBounds(40,30,200,50);
   add(t);
   
   
   b1=new JButton("1");
   b1.setBounds(40,100,50,40);
   add(b1);
   b1.addActionListener(this);
   
   b2=new JButton("2");
   b2.setBounds(90,100,50,40);
   add(b2);
   b2.addActionListener(this);
   
   b3=new JButton("3");
   b3.setBounds(140,100,50,40);
   add(b3);
   b3.addActionListener(this);
   
   badd=new JButton("+");
   badd.setBounds(190,100,50,40);
   add(badd);
   badd.addActionListener(this);
   
   b4=new JButton("4");
   b4.setBounds(40,140,50,40);
   add(b4);
   b4.addActionListener(this);
   
   b5=new JButton("5");
   b5.setBounds(90,140,50,40);
   add(b5);
   b5.addActionListener(this);
   
   b6=new JButton("6");
   b6.setBounds(140,140,50,40);
   add(b6);
   b6.addActionListener(this);
   
   
   bsub=new JButton("-");
   bsub.setBounds(190,140,50,40);
   add(bsub);
   bsub.addActionListener(this);
   
   
   b7=new JButton("7");
   b7.setBounds(40,190,50,40);
   add(b7);
   b7.addActionListener(this);
   
   b8=new JButton("8");
   b8.setBounds(90,190,50,40);
   add(b8);
   b8.addActionListener(this);
   
   b9=new JButton("9");
   b9.setBounds(140,190,50,40);
   add(b9);
   b9.addActionListener(this);
   
   
   bmul=new JButton("x");
   bmul.setBounds(190,190,50,40);
   add(bmul);
   bmul.addActionListener(this);
   
   bdec=new JButton(".");
   bdec.setBounds(40,240,50,40);
   add(bdec);
   bdec.addActionListener(this);
   
   b0=new JButton("0");
   b0.setBounds(90,240,50,40);
   add(b0);
   b0.addActionListener(this);
   
   br=new JButton("=");
   br.setBounds(140,240,50,40);
   add(br);
   br.addActionListener(this);
   
   bdiv=new JButton("/");
   bdiv.setBounds(190,240,50,40);
   add(bdiv);
   bdiv.addActionListener(this);
   
   bdel=new JButton("delete");
   bdel.setBounds(40,290,75,40);
   add(bdel);
   bdel.addActionListener(this);
   
   bclr=new JButton("clear");
   bclr.setBounds(135,290,75,40);
   add(bclr);
   bclr.addActionListener(this);
   
  
   
   setVisible(true);
   }
   public void actionPerformed(ActionEvent e)
   {
	   
	   if(e.getSource() == b1)  t.setText(t.getText().concat("1"));
	   if(e.getSource() == b2)  t.setText(t.getText().concat("2"));
	   if(e.getSource() == b3)  t.setText(t.getText().concat("3"));
	   if(e.getSource() == b4)  t.setText(t.getText().concat("4"));
	   if(e.getSource() == b5)  t.setText(t.getText().concat("5"));
	   if(e.getSource() == b6)  t.setText(t.getText().concat("6"));
	   if(e.getSource() == b7)  t.setText(t.getText().concat("7"));
	   if(e.getSource() == b8)  t.setText(t.getText().concat("8"));
	   if(e.getSource() == b9)  t.setText(t.getText().concat("9"));
	   if(e.getSource() == b0)  t.setText(t.getText().concat("0"));
	   if(e.getSource() == bdec)  t.setText(t.getText().concat("."));
	   
	   if(e.getSource() == badd)  
	   {
		   a=Double.parseDouble(t.getText());
		   op=1;
		   t.setText("");
	   }
	    if(e.getSource() == bsub)  
	   {
		   a=Double.parseDouble(t.getText());
		   op=2;
		   t.setText("");
	   }
	    if(e.getSource() == bmul)  
	   {
		   a=Double.parseDouble(t.getText());
		   op=3;
		   t.setText("");
	   }
	    if(e.getSource() == bdiv)  
	   {
		   a=Double.parseDouble(t.getText());
		   op=4;
		   t.setText("");
	   }
	   if(e.getSource() == br)
	   {
		   b=Double.parseDouble(t.getText());
		   switch(op)
		   {
			   case 1: r=a+b;
			   break;
			   case 2: r=a-b;
			   break;
			   case 3: r=a*b;
			   break;
			   case 4: r=a/b;
			   break;
		   }
		   
		   System.out.println(a+""+b+""+r);
		   a=0;
		   b=0;
		   t.setText(""+r);
	   }
	    if(e.getSource() == bclr)  t.setText("");
        if(e.getSource() == bdel)
		{
			String s=t.getText();
			t.setText("");
			for(int i=0;i<s.length()-1;i++)
			{
				t.setText(t.getText()+s.charAt(i));
			}
		}			
   }
}