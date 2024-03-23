import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class lab extends JFrame{
private ImageIcon image1;
private JLabel label1;
private ImageIcon image2;
private JLabel label2;
private ImageIcon image3;
private JLabel label3; 
lab(){
setLayout(new FlowLayout());
image1 = new ImageIcon(getClass().getResource("3.jpg"));
Image scaledImage1 = image1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
image1 = new ImageIcon(scaledImage1);
label1 = new JLabel(image1);
add(label1);
image2 = new ImageIcon(getClass().getResource("4.png"));
Image scaledImage2 = image2.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
image2 = new ImageIcon(scaledImage2);
label2 = new JLabel(image2);
add(label2);
image3 = new ImageIcon(getClass().getResource("5.jpg"));
Image scaledImage3 = image3.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
image3 = new ImageIcon(scaledImage3);
label3 = new JLabel(image3);
add(label3);
} 
public static void main(String args[]){
    lab gui = new lab();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setVisible(true);
    gui.pack();
    gui.setTitle("Image");
}
}