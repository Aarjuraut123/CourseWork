import java.util.Date;

abstract class GymMember {
    String id;
    String name;
    String location;
    Integer phone;
    String email;
    String gender;
    String DOB;
    Date membershipStartDate;
    int attendance;
    boolean activeStatus;
    int loyaltyPoints;

    abstract int markAttendance();


    boolean activateMembership() {
        activeStatus = true;
        return activeStatus;
    }
    boolean deactivateStatus() {
        if (activeStatus == true) {
            activeStatus = false;
        }
            return activeStatus;
    }


}