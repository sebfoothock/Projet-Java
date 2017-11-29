package view;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import model.ModelParis;
import model.SQL;
 
public class ViewParisFenetre extends JFrame {
    private static final long serialVersionUID = 1L;
    public ViewParisFenetre(){
        this.setContentPane(new ViewParisGUI(new ImageIcon("img\\jeuVierge3.jpg").getImage()));
    }
 
}