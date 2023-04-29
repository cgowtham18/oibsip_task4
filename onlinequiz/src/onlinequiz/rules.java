
package onlinequiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class rules extends JFrame implements ActionListener{
    String name;
    JButton back,start;
    rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
    JLabel heading=new JLabel("Welcome " +name+ " to quiz");
    heading.setBounds(50,20,700,45);
    heading.setFont(new Font("consolas",Font.BOLD,40));
    heading.setForeground(new Color(30,144,254));
    add(heading);
    
     JLabel rules=new JLabel();
    rules.setBounds(20,90,700,350);
    rules.setFont(new Font("Times News Roman",Font.PLAIN,16));
    rules.setText(
            "<html>"+
                    "1.you are allowed submit only once"+"<br><br>"+
                    "2.malpractice is prohibited"+"<br><br>"+
                    "3.no one is allowed to submit before the time"+"<br><br>"+
            "<html>"  
    );
    add(rules);
    
   back=new JButton("Back");
   back.setBounds(250,500,100,25);
   back.setBackground(new Color(30,144,254));
   back.setForeground(Color.WHITE);
   back.addActionListener(this);
   add(back);
   
   start=new JButton("Start");
   start.setBounds(420,500,100,25);
   start.setBackground(new Color(30,144,254));
   start.setForeground(Color.WHITE);
   start.addActionListener(this);
   add(start);
   
   
    setSize(800,650);
    setLocation(300,150);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
             setVisible(false);
            new quiz();
            
        }else{
            setVisible(false);
            new login();
        }
    }
    public static void main(String [] args){
        new rules("user");
    }
    
}
