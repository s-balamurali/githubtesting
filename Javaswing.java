    import javax.swing.*;  
    public class Javaswing
    {  
      public static void main(String[] args)throws Exception {  
       JFrame f=new JFrame();
       JTextField t=new JTextField("Welcome to java Swing");
       t.setBounds(100,50,100,100);
              
      JButton b=new JButton("click here");  
      b.setBounds(100,100,100, 40);  
              
      f.add(b); 
      f.add(t);
              
      f.setSize(400,500);  
      f.setLayout(null);  
      f.setVisible(true); 
     }  
    }  
