import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI2 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setBounds(0, 0, 750, 750);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JLABEL
        JLabel label = new JLabel("NUM1");
        label.setBounds(30, 45, 100, 100);
        JTextField firstnum = new JTextField();
        firstnum.setBounds(80, 80, 200, 30);
        frame.add(firstnum);
        frame.add(label);

        JLabel label1 = new JLabel("NUM2");
        label1.setBounds(30, 145, 150, 20);
        JTextField secondnum = new JTextField();
        secondnum.setBounds(80, 140, 200, 30);
        frame.add(secondnum);
        frame.add(label1);

        JLabel label2 = new JLabel("Result");
        label2.setBounds(30, 250, 150, 20);
        JTextField result = new JTextField();
        result.setBounds(30, 280, 200, 30);
        frame.add(result);
        frame.add(label2);
        result.disable();


        //Button
        JButton addbutton = new JButton("Add");
        addbutton.setBounds(90, 350, 120, 30);
        frame.add(addbutton);

        JButton subbutton = new JButton("sub");
        subbutton.setBounds(250, 350, 120, 30);
        frame.add(subbutton);

        JButton multiplybutton = new JButton("Multiply");
        multiplybutton.setBounds(400, 350, 120, 30);
        frame.add(multiplybutton);

        JButton divisonbutton = new JButton("Division");
        divisonbutton.setBounds(550, 350, 120, 30);
        frame.add(divisonbutton);

        //action listener
        addbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int firstnumber = Integer.parseInt(firstnum.getText());
                    int secondnumber = Integer.parseInt(secondnum.getText());

                    int sub = firstnumber + secondnumber;
                    result.setText(String.valueOf(sub));
                } catch (Exception ex) {
                    System.out.println("Invalid Input");
                }
            }
        });


        subbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int firstnumber = Integer.parseInt(firstnum.getText());
                    int secondnumber = Integer.parseInt(secondnum.getText());

                    int sub = firstnumber - secondnumber;
                    result.setText(String.valueOf(sub));
                } catch (Exception ex) {
                    System.out.println("Invalid Input");
                }
            }
        });

        multiplybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int firstnumber = Integer.parseInt(firstnum.getText());
                    int secondnumber = Integer.parseInt(secondnum.getText());

                    int multiply = firstnumber * secondnumber;
                    result.setText(String.valueOf(multiply));
                } catch (Exception ex) {
                    System.out.println("Invalid Input");
                }

            }
        });


        divisonbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int firstnumber = Integer.parseInt(firstnum.getText());
                    int secondnumber = Integer.parseInt(secondnum.getText());

                    int multiply = firstnumber / secondnumber;
                    result.setText(String.valueOf(multiply));
                } catch (Exception ex) {
                    System.out.println("Invalid Input");
                }

            }
        });
    }

}
