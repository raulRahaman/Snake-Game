import javax.swing.*;

public class Gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Raul's first gui :)");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 350);

        JButton button = new JButton("Click");
        JButton button2 = new JButton("Don't click!");
        frame.getContentPane().add(button);
        frame.getContentPane().add(button2);
        frame.setVisible(true);
    }
}
