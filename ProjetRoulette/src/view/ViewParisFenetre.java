package view;
import java.awt.Dimension;
 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
 
public class ViewParisFenetre extends JFrame {
     
    private static final long serialVersionUID = 1L;
     
    public ViewParisFenetre(){
        this.setContentPane(new ViewParisGUI(new ImageIcon("img\\jeuVierge3.jpg").getImage()));
    }
 
}