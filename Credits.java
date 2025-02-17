import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class Credits extends JFrame implements ActionListener{

    JLabel heading, name1, mail1, clg1, name2, mail2, clg2, sub1,sub2,branch1,branch2,githublink1,githublink2;
    JButton back;
    ImageIcon i1;

    Credits(){
        setLayout(null);
        setSize(800,500);
        setVisible(true);
        setLocation(300,150);

        pressEnter();

        i1 = new ImageIcon("src\\icons\\credits_background4.jpg");
        Image img= i1.getImage().getScaledInstance(800,500,Image.SCALE_FAST);
        JLabel image= new JLabel(new ImageIcon(img));
        image.setBounds(0,0,800,500);
        add(image);

        heading = new JLabel("Credits");
        heading.setBounds(300,30,500,40);
        heading.setFont(new Font("Impact",Font.BOLD,30));
        image.add(heading);

        sub1= new JLabel("By");
        sub1.setBounds(60,90,100,30);
        sub1.setFont(new Font("Calibri",Font.BOLD,20));
        image.add(sub1);

        name1= new JLabel("Y.S.S.Swaroop ,");
        name1.setBounds(60,120,200,30);
        name1.setFont(new Font("Calibri",Font.BOLD,20));
        image.add(name1);

        mail1=new JLabel("yanduriswaroop@gmail.com");
        mail1.setBounds(60,150,400,30);
        mail1.setFont(new Font("Calibri",Font.BOLD,20));
        image.add(mail1);

        clg1=new JLabel("Prasad V Potluri Siddhartha Institute of Technology");
        clg1.setBounds(60,180,500,30);
        clg1.setFont(new Font("Calibri",Font.BOLD,20));
        image.add(clg1);

        branch1= new JLabel("CSE");
        branch1.setBounds(190,120,100,30);
        branch1.setFont(new Font("Calibri",Font.BOLD,20));
        image.add(branch1);

        sub2=new JLabel("By");
        sub2.setBounds(430,220,100,30);
        sub2.setFont(new Font("Calibri",Font.BOLD,20));
        image.add(sub2);

        name2=new JLabel("P.Venkata Teja ,");
        name2.setBounds(430,250,200,30);
        name2.setFont(new Font("Calibri",Font.BOLD,20));
        image.add(name2);

        mail2=new JLabel("Pvteja162000@gmail.com");
        mail2.setBounds(430,280,400,30);
        mail2.setFont(new Font("Calibri",Font.BOLD,20));
        image.add(mail2);

        clg2=new JLabel("Siddhartha Academy of Higher Education");
        clg2.setBounds(430,310,500,30);
        clg2.setFont(new Font("Calibri",Font.BOLD,20));
        image.add(clg2);

        branch2=new JLabel("ECE");
        branch2.setBounds(570,250,100,30);
        branch2.setFont(new Font("Calibri",Font.BOLD,20));
        image.add(branch2); 

        githublink1= new JLabel("<html><a href=''>Visit Swaroop's Github</a></html>");
        githublink1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        githublink1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://github.com/Swaroop5222"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        githublink1.setBounds(60,210,200,30);
        image.add(githublink1);

        githublink2= new JLabel("<html><a href=''>Visit Teja's Github</a></html>");
        githublink2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        githublink2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://github.com/TECH-HACKER16"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        githublink2.setBounds(430,340,200,30);
        image.add(githublink2);

        ImageIcon i5= new ImageIcon("src\\icons\\back3.png");
        Image image4= i5.getImage().getScaledInstance(60,50,Image.SCALE_DEFAULT);

        back= new JButton(new ImageIcon(image4));
        back.setBounds(340,380,60,50);
        back.addActionListener(this);
        image.add(back);
    }
    
    public void actionPerformed(ActionEvent e){
        setVisible(false);
    }

    private void pressEnter(){
        this.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent ke){
                if(ke.getKeyCode()==KeyEvent.VK_ENTER){
                    back.doClick();
                }
            }
    });
    this.setFocusable(true);
    }
}
