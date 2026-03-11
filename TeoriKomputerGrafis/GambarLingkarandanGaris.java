import java.awt.*;
import javax.swing.*;

public class GambarLingkarandanGaris extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Mengatur warna
        g.setColor(Color.RED);

        // Menggambar lingkaran
        // drawOval(x, y, width, height)
        g.drawOval(30, 180, 150, 150);

        // Mengatur warna garis
        g.setColor(Color.RED);

        // Menggambar garis
        // drawLine(x1, y1, x2, y2)
        g.drawLine(50, 50, 400, 400);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gambar Lingkaran dan Garis");
        GambarLingkarandanGaris panel = new GambarLingkarandanGaris();

        frame.add(panel);
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
