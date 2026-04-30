public class Cardiology extends Department{
    
    public Cardiology(String deptName, String deptCode, int numOfDoctors, int numofNurses, int numOfPatients) {
        super(deptName, deptCode, numOfDoctors, numofNurses, numOfPatients);
    }

    public String getDeptName() {
        // Jemimah Joseph
        return super.getDeptName();
    }

    public String getDeptCode() {
        // Nathaniel Sykes
        return "CAR";
    }

    public String toString() {
        // Jemimah Joseph
        return "Department Name: " + this.getDeptName() + "\nDepartment Code: " + this.getDeptCode(); +
            "\nNumber Of Doctors: " + super.getNumOfDoctors() + "\nNumber of Nurses: " + super.getNumOfNurses() +
            \nNumber of Patients: " + super.getNumOfPatients();
    }
}
