import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

class Person {
    private String name;
    private String gender;
    private String address;

    Person(String name, String address, String gender) {
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    public String toString() {
        return name + ", " + address + ", " + gender;
    }
}

public class GUI3 {
    public static void main(String[] args) {
        // Frame
        JFrame frame = new JFrame("GUI APP");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setBounds(30, 50, 700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Proper exit on close

        // Name
        JLabel label1 = new JLabel("Name:");
        label1.setBounds(20, 20, 100, 40);
        frame.add(label1);
        JTextField nameField = new JTextField();
        nameField.setBounds(100, 30, 150, 20);
        frame.add(nameField);

        // Address
        JLabel label2 = new JLabel("Address:");
        label2.setBounds(20, 70, 100, 40);
        frame.add(label2);
        JTextField addressField = new JTextField();
        addressField.setBounds(100, 80, 150, 20);
        frame.add(addressField);

        // Gender
        JLabel label3 = new JLabel("Gender:");
        label3.setBounds(20, 120, 100, 40);
        frame.add(label3);
        JComboBox<String> gendercmb = new JComboBox<>();
        gendercmb.addItem("Male");
        gendercmb.addItem("Female");
        gendercmb.addItem("Others");
        gendercmb.setBounds(100, 130, 150, 20);
        frame.add(gendercmb);

        // Buttons
        JButton addData = new JButton("Add");
        addData.setBounds(50, 200, 100, 30);
        frame.add(addData);

        JButton displayData = new JButton("Display");
        displayData.setBounds(200, 200, 100, 30);
        frame.add(displayData);

        // ArrayList to store person data
        ArrayList<Person> personList = new ArrayList<>();

        addData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String address = addressField.getText().trim();
                String gender = (String) gendercmb.getSelectedItem();

                if (name.isEmpty() || address.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields.", "Error",JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // Add person to list
                Person newPerson = new Person(name, address, gender);
                personList.add(newPerson);

                // Write to file (appending instead of overwriting)
                try {
                    FileWriter fw = new FileWriter("personalInfo.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(newPerson.toString());
                    bw.newLine();
                    JOptionPane.showMessageDialog(frame, "Data saved successfully!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error saving data!", "Error", JOptionPane.ERROR_MESSAGE);
                }

                // Clear fields
                nameField.setText("");
                addressField.setText("");
                gendercmb.setSelectedIndex(0);
            }
        });

        displayData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (personList.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "No data available.", "Info", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    StringBuilder data = new StringBuilder();
                    for (Person p : personList) {

                        data.append(p.toString()).append("\n");
                    }
                    JOptionPane.showMessageDialog(frame, data.toString(), "Stored Data", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}