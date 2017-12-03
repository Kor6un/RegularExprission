import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task6 extends JFrame {
    private JTextArea textArea;
    private JButton translite;

    private Task6 () {
        setTitle("Транстлиттер");
        setSize(500,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());

        textArea = new JTextArea(20,30);
        textArea.setLineWrap(true);
        add(textArea);

        translite = new JButton("Перевести");
        translite.addActionListener(new MyActionListener());
        add(translite);

        setVisible(true);
    }

    private class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String temp = textArea.getText();

            String input = temp.toUpperCase();

            char[] ch = input.toCharArray();

            String output = "";

            for (int i = 0; i < ch.length; i++) {
                switch (ch[i]) {
                    case 'А':
                        output += "A";
                        break;
                    case 'Б':
                        output += "B";
                        break;
                    case 'В':
                        output += "V";
                        break;
                    case 'Г':
                        output += "G";
                        break;
                    case 'Д':
                        output += "D";
                        break;
                    case 'Е':
                        output += "E";
                        break;
                    case 'Ё':
                        output += "JO";
                        break;
                    case 'Ж':
                        output += "ZH";
                        break;
                    case 'З':
                        output += "Z";
                        break;
                    case 'И':
                        output += "I";
                        break;
                    case 'Й':
                        output += "Y";
                        break;
                    case 'К':
                        output += "K";
                        break;
                    case 'Л':
                        output += "L";
                        break;
                    case 'М':
                        output += "M";
                        break;
                    case 'Н':
                        output += "N";
                        break;
                    case 'О':
                        output += "O";
                        break;
                    case 'П':
                        output += "P";
                        break;
                    case 'Р':
                        output += "R";
                        break;
                    case 'С':
                        output += "S";
                        break;
                    case 'Т':
                        output += "T";
                        break;
                    case 'У':
                        output += "U";
                        break;
                    case 'Ф':
                        output += "F";
                        break;
                    case 'Х':
                        output += "KH";
                        break;
                    case 'Ц':
                        output += "C";
                        break;
                    case 'Ч':
                        output += "CH";
                        break;
                    case 'Ш':
                        output += "SH";
                        break;
                    case 'Щ':
                        output += "SHH";
                        break;
                    case 'Ъ':
                        output += "JHH";
                        break;
                    case 'Ы':
                        output += "IH";
                        break;
                    case 'Ь':
                        output += "'";
                        break;
                    case 'Э':
                        output += "EH";
                        break;
                    case 'Ю':
                        output += "JU";
                        break;
                    case 'Я':
                        output += "JA";
                        break;
                    default:
                        output += String.valueOf(ch[i]);
                        break;
                }
            }
            textArea.setText(output);
        }
    }

    public static void main(String[] args) {
        new Task6();
    }
}
