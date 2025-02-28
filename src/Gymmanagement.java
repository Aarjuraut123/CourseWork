import javax.swing.*;

public class Gymmanagement {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gym Membership Management");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setBounds(30,50,700,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //ID
        JLabel label1 = new JLabel("ID:");
        label1.setBounds(45, 20, 100, 40);
        frame.add(label1);
        JTextField IDField = new JTextField();
        IDField.setBounds(180, 30, 150, 20);
        frame.add(IDField);

        //Location
        JLabel Locationlabel = new JLabel("Location:");
        Locationlabel.setBounds(35, 70, 100, 40);
        frame.add(Locationlabel);
        JTextField LocationField = new JTextField();
        LocationField.setBounds(180, 80, 150, 20);
        frame.add(LocationField);

        //Email
        JLabel Emaillabel = new JLabel("Email:");
        Emaillabel.setBounds(40, 110, 100, 40);
        frame.add(Emaillabel);
        JTextField EmailField = new JTextField();
        EmailField.setBounds(180, 120, 150, 20);
        frame.add(EmailField);

        //Start Date
        JLabel Startlabel = new JLabel("Start Date:");
        Startlabel.setBounds(25, 150, 100, 40);
        frame.add(Startlabel);
        JTextField StartDateField = new JTextField();
        StartDateField.setBounds(180, 160, 150, 20);
        frame.add(StartDateField);

        //Referral Source
        JLabel Referrallabel = new JLabel("Referral Source:");
        Referrallabel.setBounds(20, 190, 100, 40);
        frame.add(Referrallabel);
        JTextField ReferralSourceField = new JTextField();
        ReferralSourceField.setBounds(180, 200, 150, 20);
        frame.add(ReferralSourceField);

        //Removal Reason
        JLabel Removallabel = new JLabel("Removal Reason:");
        Removallabel.setBounds(20, 230, 100, 40);
        frame.add(Removallabel);
        JTextField RemovalReasonField = new JTextField();
        RemovalReasonField.setBounds(180, 240, 150, 20);
        frame.add(RemovalReasonField);

        //Plan
        JLabel Planlabel = new JLabel("Plan:");
        Planlabel.setBounds(40, 270, 100, 40);
        frame.add(Planlabel);
        JComboBox<String> Plan1 = new JComboBox<>();
        Plan1.addItem("Basic") ;
        Plan1.addItem("Standard");
        Plan1.addItem("Deluxe");
        Plan1.setBounds(180,280,160,20);
        frame.add(Planlabel);

       //Premium Plan Charge
       JLabel PremiumPlanChargelabel = new JLabel("Premium Plan Charge:");
        PremiumPlanChargelabel.setBounds(20, 310, 150, 40);
        frame.add(PremiumPlanChargelabel);
        JTextField PremiumPlanChargeField = new JTextField();
        PremiumPlanChargeField.setBounds(180, 320, 150, 20);
        frame.add(PremiumPlanChargeField);

        //Name
        JLabel Namelabel = new JLabel("Name:");
        Namelabel.setBounds(550, 20, 100, 40);
        frame.add(Namelabel);
        JTextField NameField = new JTextField();
        NameField.setBounds(680, 30, 150, 20);
        frame.add(NameField);

        //Phone
        JLabel Phonelabel = new JLabel("Phone:");
        Phonelabel.setBounds(550, 70, 100, 40);
        frame.add(Phonelabel);
        JTextField PhoneField = new JTextField();
        PhoneField.setBounds(680, 80, 150, 20);
        frame.add(PhoneField);

        //DOB
        JLabel DOBlabel = new JLabel("DOB:");
        DOBlabel.setBounds(550, 110, 100, 40);
        frame.add(DOBlabel);
        JTextField DOBField = new JTextField();
        DOBField.setBounds(680, 120, 150, 20);
        frame.add(DOBField);

        //Gender
        JLabel Genderlabel = new JLabel("Gender:");
        Genderlabel.setBounds(540, 150, 100, 40);
        frame.add(Genderlabel);

        //Paid Amount
        JLabel PaidAmountlabel = new JLabel("Paid Amount:");
        PaidAmountlabel.setBounds(530, 190, 100, 40);
        frame.add(PaidAmountlabel);
        JTextField PaidAmountField = new JTextField();
        PaidAmountField.setBounds(680, 200, 150, 20);
        frame.add( PaidAmountField);

        //Trainers Name
        JLabel TrainersNamelabel = new JLabel("Trainer's Name:");
        TrainersNamelabel.setBounds(530, 225, 100, 40);
        frame.add(TrainersNamelabel);
        JTextField TrainersNameField = new JTextField();
        TrainersNameField.setBounds(680, 235, 150, 20);
        frame.add( TrainersNameField);

        //Regular Plan Price
        JLabel RegularPlanPricelabel = new JLabel("Regular Plan Price:");
        RegularPlanPricelabel.setBounds(530, 265, 150, 40);
        frame.add(RegularPlanPricelabel);
        JTextField RegularPlanPriceField = new JTextField();
        RegularPlanPriceField.setBounds(680, 275, 150, 20);
        frame.add( RegularPlanPriceField);

        //Discount Amount
        JLabel DiscountAmountlabel = new JLabel("Discount Amount:");
        DiscountAmountlabel.setBounds(530, 305, 150, 40);
        frame.add(DiscountAmountlabel);
        JTextField DiscountAmountField = new JTextField();
        DiscountAmountField.setBounds(680, 315, 150, 20);
        frame.add(DiscountAmountField);

        //Add Regular Member
        JButton AddRegularMemberbutton=new JButton("Add Regular Member");
        AddRegularMemberbutton.setBounds(30, 400, 200, 25);
        frame.add(AddRegularMemberbutton);

        //Mark Attendance
        JButton MarkAttendancebutton=new JButton("Mark Attendance");
        MarkAttendancebutton.setBounds(30, 440, 200, 25);
        frame.add(MarkAttendancebutton);

        //Revert Premium Member
        JButton RevertPremiumMemberbutton=new JButton("Revert Premium Member");
        RevertPremiumMemberbutton.setBounds(30, 480, 200, 25);
        frame.add(RevertPremiumMemberbutton);

        //Display Members
        JButton DisplayMembersbuttonbutton=new JButton("Display Members");
       DisplayMembersbuttonbutton.setBounds(30, 520, 200, 25);
        frame.add(DisplayMembersbuttonbutton);

        //Add Premium Member
        JButton AddPremiumMemberbutton=new JButton("Add Premium Member");
        AddPremiumMemberbutton.setBounds(300, 400, 200, 25);
        frame.add(AddPremiumMemberbutton);

        //Upgrade Plan
        JButton UpgradePlanbutton=new JButton("Upgrade Plan");
        UpgradePlanbutton.setBounds(300, 440, 200, 25);
        frame.add(UpgradePlanbutton);

        //Pay Due Amount
        JButton PayDueAmountbutton=new JButton("Pay Due Amount");
        PayDueAmountbutton.setBounds(300, 480, 200, 25);
        frame.add(PayDueAmountbutton);

        //Activate Membership
        JButton ActivateMembershipbutton=new JButton("Activate Membership");
        ActivateMembershipbutton.setBounds(570, 400, 200, 25);
        frame.add(ActivateMembershipbutton);

        //Calculate Discount
        JButton CalculateDiscountbutton=new JButton("Calculate Discount");
        CalculateDiscountbutton.setBounds(570, 440, 200, 25);
        frame.add(CalculateDiscountbutton);

        //Save to File
        JButton SavetoFilebutton=new JButton("Save to File");
        SavetoFilebutton.setBounds(570, 480, 200, 25);
        frame.add(SavetoFilebutton);


    }
}
