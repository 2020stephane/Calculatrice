import javax.swing.*;
import java.awt.*;

public class CreateButton {

    public static Label panel2;
    GridLayout gridLayout = new GridLayout();
    JScrollPane scrollPane;
    public static JTextArea output;

      public void  createB(JFrame owner)  {

          SelectButton action = new SelectButton();

          JPanel panel1 = new JPanel();
          JPanel panel2 = new JPanel();

          output = new JTextArea(2, 25);
          output.setEditable(false);
          scrollPane = new JScrollPane(output);
          panel2.add(scrollPane);

          panel1.setLayout(gridLayout);
          gridLayout.setRows(5);
          gridLayout.setColumns(4);
          gridLayout.setHgap(5);
          gridLayout.setVgap(5);

          JButton btnbs = new JButton("BS");
          JButton btn7 = new JButton("7");
          JButton btn4 = new JButton("4");
          JButton btn1 = new JButton("1");
          JButton btnP = new JButton(".");
          JButton btnx = new JButton(" ");
          JButton btn8 = new JButton("8");
          JButton btn5 = new JButton("5");
          JButton btn2 = new JButton("2");
          JButton btn0 = new JButton("0");
          JButton btnpourc = new JButton("%");
          JButton btn9 = new JButton("9");
          JButton btn6 = new JButton("6");
          JButton btn3 = new JButton("3");
          JButton btnC = new JButton("C");
          JButton btndiv = new JButton("/");
          JButton btnmul = new JButton("*");
          JButton btnmoins = new JButton("-");
          JButton btnplus = new JButton("+");
          JButton btnegal = new JButton("=");

          panel1.add(btnbs);panel1.add(btnx);panel1.add(btnpourc);panel1.add(btndiv);
          panel1.add(btn7);panel1.add(btn8);panel1.add(btn9);panel1.add(btnmul);
          panel1.add(btn4);panel1.add(btn5);panel1.add(btn6);panel1.add(btnmoins);
          panel1.add(btn1);panel1.add(btn2);panel1.add(btn3);panel1.add(btnplus);
          panel1.add(btnP);panel1.add(btn0);panel1.add(btnC); panel1.add(btnegal);

          action.add(btn0);action.add(btn1);action.add(btn2);action.add(btn3);
          action.add(btn4);action.add(btn5);action.add(btn6);action.add(btn7);
          action.add(btn8);action.add(btn9);action.add(btnbs);action.add(btnx);
          action.add(btnpourc);action.add(btndiv);action.add(btnmul);action.add(btnmoins);
          action.add(btnplus);action.add(btnP);action.add(btnC);action.add(btnegal);

          owner.getContentPane().add(panel1, BorderLayout.CENTER);
          owner.getContentPane().add(panel2, BorderLayout.NORTH);

      }
}

