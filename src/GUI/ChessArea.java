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
        JPanel pn = new JPanel(){
            public void paint(Graphics g)
            {
                boolean white = true;
                for(int i = 0; i < 8; i++)
                {
                    for(int j = 0; j < 8; j++)
                    {
                        if(white) g.setColor(Color.white);
                        else g.setColor(Color.lightGray);
                        g.fillRect(i * 90, j * 90, 90, 90);
                        white = !white;
                    }
                    white = !white;
                }
            }
        };
        JLabel text = new JLabel("Essa");
        this.getContentPane().add(text, BorderLayout.NORTH);
        this.getContentPane().add(pn, BorderLayout.CENTER);
    }
}
