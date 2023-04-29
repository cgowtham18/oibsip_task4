
package onlinequiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class login extends JFrame implements ActionListener{
   JButton rules,back;
   JTextField tfname;
    login(){
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jfif"));
    JLabel image=new JLabel(i1);
   image.setBounds(00,00,600,500); 
   add(image);
    
   JLabel heading=new JLabel("Welcome to Quiz");
   heading.setBounds(730,60,500,45);
   heading.setFont(new Font("Courier Italic",Font.BOLD,40));
   heading.setForeground(new Color(30,144,254));
   add(heading);
   
   JLabel name=new JLabel("Enter your name ");
   name.setBounds(800,150,400,20);
   name.setFont(new Font("NSimSun",Font.BOLD,18));
   name.setForeground(new Color(30,144,254));
   add(name);
   
   tfname =new JTextField();
   tfname.setBounds(735,200,350,25);
   tfname.setFont(new Font("times new roman",Font.BOLD,20));
   add(tfname);
   
   rules=new JButton("Rules");
   rules.setBounds(720,280,130,25);
   rules.setBackground(new Color(30,144,254));
   rules.setForeground(Color.WHITE);
   rules.addActionListener(this);
   add(rules);
   
   back=new JButton("Back");
   back.setBounds(900,280,130,25);
   back.setBackground(new Color(30,144,254));
   back.setForeground(Color.WHITE);
  back.addActionListener(this);
   add(back);
   
  
   
   
     
    
    setVisible(true);
    setSize(1200,500);
    setLocation(200,150);   
    
}
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== rules){
            String name=tfname.getText();
           setVisible(false);
           new rules(name);
        }else if(ae.getSource()== back){
            setVisible(false);
    }
    }
    
    public static void main(String[] args){  
    new login();
 }
} 