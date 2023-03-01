package GUI;

import javax.swing.*;
import java.awt.*;

public class ChessArea extends JFrame {


    public static void main(String[] args) {
        new ChessArea().setVisible(true);
    }
    ChessArea() {
        initArea();
    }
    public void initArea(){
        this.setTitle("Chess");
        this.setIconImage(new ImageIcon("ImIc.jpg").getImage());
        int width = Toolkit.getDefaultToolkit().getScreenSize().width / 2;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height / 2;
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(width / 2, height / 4, 800,850);
    }
}
