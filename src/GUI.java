import javax.swing.*;
import java.awt.Font;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sample GUI");

        //FRAME
        frame.setBounds(50, 50, 700, 700);
        frame.setLayout(null);
        frame.setVisible(true);
        //JLabel
        JLabel label= new JLabel("Sample GUI");
        label.setBounds(200, 5, 200, 100);
        label.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(label);
        //ID
        JLabel label1 = new JLabel("ID: ");
        label1.setBounds(50, 100, 100, 100);
        JTextField field=new JTextField();
        field.setBounds(100, 140, 100, 20);
        frame.add(field);
        frame.add(label1);

        //LOCATION
        JLabel label2 = new JLabel("Location: ");
        label2.setBounds(22, 140, 100, 100);
        JTextField field1= new JTextField();
        field1.setBounds(100, 180, 100, 20);
        frame.add(label2);
        frame.add(field1);

        //TOTAL SALES
        JLabel label3 = new JLabel("Total Sales: ");
        label3.setBounds(12, 180, 100, 100);
        JTextField field2=new JTextField();
        field2.setBounds(100, 220, 100, 20);
        frame.add(label3);
        frame.add(field2);

        //PRODUCT NAME
        JLabel label4=new JLabel("Product Name: ");
        label4.setBounds(12, 220, 100, 100);
        JTextField field3=new JTextField();
        field3.setBounds(100, 260, 100, 20);
        frame.add(label4);
        frame.add(field3);

        //Selling price
        JLabel label5= new JLabel("Selling price: ");
        label5.setBounds(12, 260, 100, 100);
        JTextField field4 = new JTextField();
        field4.setBounds(100, 300, 100, 20);
        frame.add(label5);
        frame.add(field4);
        field4.disable();

        //LOYALTY
        JLabel label6 =new JLabel("Loyalty: ");
        label6.setBounds(12, 300, 100, 100);
        JTextField field5 = new JTextField();
        field5.setBounds(100, 340, 100, 20);
        frame.add(label6);
        frame.add(field5);
        field5.disable();

        //Name
        JLabel label7 = new JLabel("Name: ");
        label7.setBounds(355, 95, 100, 100);
        JTextField field6 = new JTextField();
        field6.setBounds(470, 140, 100, 20);
        frame.add(label7);
        frame.add(field6);

        //opening hour
        JLabel label8 = new JLabel("Opening Hour: ");
        label8.setBounds(350, 140, 100, 100);
        JTextField field7= new JTextField();
        field7.setBounds(470, 180, 100, 20 );
        frame.add(label8);
        frame.add(field7);

        //Total Discount
        JLabel label9 = new JLabel("Total Discount: ");
        label9.setBounds(350, 180, 100, 100);
        JTextField field8 =new JTextField();
        field8.setBounds(470, 220, 100, 20);
        frame.add(label9);
        frame.add(field8);

        //Marked Price
        JLabel label10 = new JLabel("Marked Price: ");
        label10.setBounds(350, 220, 100, 100);
        JTextField field9 = new JTextField();
        field9.setBounds(470, 260, 100, 20);
        frame.add(label10);
        frame.add(field9);

        //VAT INCLUSIVE PRICE
        JLabel label11 = new JLabel("VAT Inclusive Price: ");
        label11.setBounds(350, 260, 200, 100);
        JTextField field10 = new JTextField();
        field10.setBounds(470, 300, 100, 20);
        frame.add(label11);
        frame.add(field10);

        //Purchased Year
        JLabel label12 = new JLabel("Purchased Year: ");
        label12.setBounds(350, 300, 100, 100);
        JComboBox<Integer> cmb1 = new JComboBox<>();
        cmb1.addItem(2022);
        cmb1.addItem(2023);
        cmb1.addItem(2024);
        cmb1.setBounds(470,340,100,20);
        frame.add(label12);
        frame.add(cmb1);

        //Add Retailer
        JButton button=new JButton("Add Retailer");
        button.setBounds(470, 400, 120, 25);
        frame.add(button);
        frame.setBounds(30, 50, 750, 750 );
        frame.setLayout(null);

        //Loyalty Point
        JButton button1 = new JButton("Loyalty Point");
        button1.setBounds(470, 450, 120, 25);
        frame.add(button1);

        //CLEAR
        JButton button2 = new JButton("Clear");
        button2.setBounds(470, 500, 120, 25);
        frame.add(button2);

        //Add Department
        JButton button3 = new JButton("Add Department");
        button3.setBounds(250, 400, 160, 25);
        frame.add(button3);

        //Discount Price
        JButton button4 = new JButton("Discount price");
        button4.setBounds(250, 450, 160, 25);
        frame.add(button4);

        //Display
        JButton button5 = new JButton("Display");
        button5.setBounds(260, 500, 120, 25);
        frame.add(button5);

        //Remove Product
        JButton button6 = new JButton("Remove Product");
        button6.setBounds(50, 500, 150, 25);
        frame.add(button6);

        //Is payment Online
        JCheckBox chk1 = new JCheckBox("Is Payment Online");
        chk1.setBounds(50,400,200,30);
        frame.add(chk1);

        //IS In Sales
        JCheckBox chk2 = new JCheckBox("Is In Sales");
        chk2.setBounds(50, 450, 200, 30);
        frame.add(chk2);
    }
}