import javax.swing.*;
import java.awt.*;

public class MainClass {

    static JFrame frame;

    public static void main(String[] args) {

        CreateButton CB = new CreateButton();

        frame = new JFrame("GRETA : CALCULATRICE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon logo = createImageIcon("icon/moon.png");
        frame.setIconImage(logo.getImage());
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int height = dim.height;
        int width = dim.width;
        frame.setBounds(width /4, height /4, 300,350);
        frame.setResizable(false);
        CB.createB(frame);
        frame.setVisible(true);
    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = MainClass.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}