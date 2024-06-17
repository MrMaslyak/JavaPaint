import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class Paint extends JFrame {
    Color color = Color.BLACK;
    Paint() {
        setTitle("Paint");
        setSize(1000, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        Button bRed = new Button("");
        bRed.setBounds(500, 50, 20, 20);
        bRed.setForeground(Color.RED);
        bRed.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                color = Color.RED;
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {

            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {

            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {

            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {

            }
        });
        add(bRed);

        Button bGreen = new Button("");
        bGreen.setBounds(540, 50, 20, 20);
        bGreen.setForeground(Color.GREEN);
        bGreen.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                color = Color.GREEN;
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {

            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {

            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {

            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {

            }
        });
        add(bGreen);

        setVisible(true);
    }

    @Override
    public void print(Graphics g) {
        super.print(g);

    }
}
