import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Student{
    String Name;
    String Address;
    String Level;
    String Gender;
    String FatherName;
    Integer MobileNo;

    Student(String Name, String Address, String Level, String Gender,  String FatherName, int MobileNo) {
        this.Name = Name;
        this.Address = Address;
        this.Level = Level;
        this.Gender = Gender;
        this.FatherName = FatherName;
        this.MobileNo = MobileNo;
    }

        public String toString() {
            return Name + ", " + Address + "," + Level + "," + Gender + ","  + FatherName + "," + MobileNo;


    }
}


public class Admission {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Admission Form");

        //FRAME
        frame.setBounds(50, 50, 700, 700);
        frame.setLayout(null);
        frame.setVisible(true);

        //JLabel
        JLabel label = new JLabel("Admission Form");
        label.setBounds(200, 5, 800, 100);
        label.setFont(new Font("Arial", Font.BOLD, 35));
        frame.add(label);

        //Name
        JLabel label1 = new JLabel("Name: ");
        label1.setBounds(50, 100, 100, 100);
        JTextField namefield = new JTextField();
        namefield.setBounds(100, 140, 100, 20);
        frame.add(namefield);
        frame.add(label1);

        //Address
        JLabel label2 = new JLabel("Address: ");
        label2.setBounds(35, 140, 100, 100);
        JTextField addressfield = new JTextField();
        addressfield.setBounds(100, 190, 100, 20);
        frame.add(addressfield);
        frame.add(label2);

        //Level
        JLabel label3 = new JLabel("Level: ");
        label3.setBounds(40, 180, 100, 100);
        JTextField levelfield = new JTextField();
        levelfield.setBounds(100, 220, 100, 20);
        frame.add(label3);
        frame.add(levelfield);

        //Gender
        JLabel genderlabel = new JLabel("Gender: ");
        genderlabel.setBounds(35, 220, 100, 100);
        JComboBox<String> combo1 = new JComboBox<>();
        combo1.addItem("Male");
        combo1.addItem("Female");
        combo1.setBounds(100, 260, 100, 20);
        frame.add(combo1);
        frame.add(genderlabel);

        //Parent
        JLabel label5 = new JLabel("Parent Info: ");
        label5.setBounds(300, 260, 200, 100);
        frame.add(label5);

        //Father Name
        JLabel label6 = new JLabel("Father Name: ");
        label6.setBounds(35, 300, 100, 100);
        JTextField field3 = new JTextField();
        field3.setBounds(120, 340, 100, 20);
        frame.add(label6);
        frame.add(field3);

        //Mobile No
        JLabel label7 = new JLabel("Mobile No: ");
        label7.setBounds(45, 350, 100, 100);
        JTextField field4 = new JTextField();
        field4.setBounds(120, 390, 100, 20);
        frame.add(label7);
        frame.add(field4);

        //Add
        JButton addbutton1 = new JButton("Add");
        addbutton1.setBounds(100, 450, 120, 25);
        frame.add(addbutton1);

        //display
        JButton displaybutton2 = new JButton("display");
        displaybutton2.setBounds(350, 450, 120, 25);
        frame.add(displaybutton2);

        // ArrayList to store admission data
        ArrayList<Student> List = new ArrayList<>();

        addbutton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = namefield.getText().trim();
                String address = addressfield.getText().trim();
                String level = levelfield.getText().trim();
                String gender = (String) combo1.getSelectedItem();
                String FatherName = field3.getText().trim();
                int MobileNo = Integer.parseInt(field4.getText().trim());


                if (name.isEmpty() || address.isEmpty() || level.isEmpty() || gender.isEmpty() || FatherName.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                Student std = new Student(name, address, level, gender, FatherName, MobileNo);

            }
        });
    }
}


