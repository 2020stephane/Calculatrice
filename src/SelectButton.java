import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SelectButton implements ActionListener {


    static String valour1 = "";
    static String valour2 = "";
    static String operator = "";
    static boolean flag = false;
    static int tail1 = 0;
    static float total = 0;


    public void add(JButton btn) {
        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton source = (JButton) (e.getSource());
        String exemple = source.getText();
        exemple = exemple.substring(0, 1);

        switch (exemple) {
            case ("0") -> {
                if (flag) {
                    CreateButton.output.setText("");
                }
                flag = false;
                CreateButton.output.append("0");
            }
            case ("1") -> {
                if (flag) {
                    CreateButton.output.setText("");
                }
                flag = false;
                CreateButton.output.append("1");
            }
            case ("2") -> {
                if (flag) {
                    CreateButton.output.setText("");
                }
                flag = false;
                CreateButton.output.append("2");
            }
            case ("3") -> {
                if (flag) {
                    CreateButton.output.setText("");
                }
                flag = false;
                CreateButton.output.append("3");
            }
            case ("4") -> {
                if (flag) {
                    CreateButton.output.setText("");
                }
                flag = false;
                CreateButton.output.append("4");
            }
            case ("5") -> {
                if (flag) {
                    CreateButton.output.setText("");
                }
                flag = false;
                CreateButton.output.append("5");
            }
            case ("6") -> {
                if (flag) {
                    CreateButton.output.setText("");
                }
                flag = false;
                CreateButton.output.append("6");
            }
            case ("7") -> {
                if (flag) {
                    CreateButton.output.setText("");
                }
                flag = false;
                CreateButton.output.append("7");
            }
            case ("8") -> {
                if (flag) {
                    CreateButton.output.setText("");
                }
                flag = false;
                CreateButton.output.append("8");
            }
            case ("9") -> {
                if (flag) {
                    CreateButton.output.setText("");
                }
                flag = false;
                CreateButton.output.append("9");
            }
            case (".") -> {
                if (flag) {
                    CreateButton.output.setText("");
                }
                flag = false;
                CreateButton.output.append(".");
            }
            case ("C") -> {
                CreateButton.output.setText("");
                flag = false;

            }
            case ("B") -> {
                if (flag) {
                    CreateButton.output.setText("");
                }
                flag = false;
                if (operator == "") {
                  valour1 = CreateButton.output.getText();
                  if ( valour1.length() > 0 ) {
                    valour1 = valour1.substring(0,valour1.length()-1);
                    CreateButton.output.setText(valour1);
                  }
                } else {
                    valour2 = CreateButton.output.getText();
                    if ( valour2.length() > 0 ) {
                        valour2 = valour2.substring(0,valour2.length()-1);
                        CreateButton.output.setText(valour2);
                    }
                }
            }
            case ("+") -> {
                if (Objects.equals(operator, "")) {
                    operator = "+";
                    valour1 = CreateButton.output.getText();
                    CreateButton.output.append("+");
                    tail1 = valour1.length() + 1;
                }
            }
            case ("-") -> {
                if (Objects.equals(operator, "")) {
                    operator = "-";
                    valour1 = CreateButton.output.getText();
                    CreateButton.output.append("-");
                    tail1 = valour1.length() + 1;
                }
            }
            case ("*") -> {
                if (Objects.equals(operator, "")) {
                    operator = "*";
                    valour1 = CreateButton.output.getText();
                    CreateButton.output.append("*");
                    tail1 = valour1.length() + 1;
                }
            }
            case ("/") -> {
                if (Objects.equals(operator, "")) {
                    operator = "/";
                    valour1 = CreateButton.output.getText();
                    CreateButton.output.append("/");
                    tail1 = valour1.length() + 1;
                }
            }
            case ("=") -> {
                valour2 = CreateButton.output.getText();
                valour2 = valour2.substring(tail1);

                switch (operator) {
                    case ("+") -> {
                        total = Float.parseFloat(valour1) + Float.parseFloat(valour2);
                        valour1 = Float.toString(total);
                        CreateButton.output.append("=");
                        CreateButton.output.append(valour1);
                        operator = "";
                        flag = true;
                    }
                    case ("-") -> {
                        total = Float.parseFloat(valour1) - Float.parseFloat(valour2);
                        valour1 = Float.toString(total);
                        CreateButton.output.append("=");
                        CreateButton.output.append(valour1);
                        operator = "";
                        flag = true;
                    }
                    case ("*") -> {
                        total = Float.parseFloat(valour1) * Float.parseFloat(valour2);
                        valour1 = Float.toString(total);
                        CreateButton.output.append("=");
                        CreateButton.output.append(valour1);
                        operator = "";
                        flag = true;
                    }
                    case ("/") -> {
                        if (Float.parseFloat(valour2) == 0) {
                            CreateButton.output.setText("error division par 0");
                            operator = "";
                            flag = true;
                            break;
                        }
                        total = Float.parseFloat(valour1) / Float.parseFloat(valour2);
                        valour1 = Float.toString(total);
                        CreateButton.output.append("=");
                        CreateButton.output.append(valour1);
                        operator = "";
                        flag = true;
                    }
                }

            }
        }
    }
}
