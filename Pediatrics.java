public class Pediatrics extends Department{
    public Pediatrics(String deptName, String deptCode, int numOfDoctors, int numofNurses, int numOfPatients) {
        super(deptName, deptCode, numOfDoctors, numofNurses, numOfPatients);
    }

    public String getDeptName() {
        // Jemimah Joseph
        return super.getDeptName();
    }

    public String getDeptCode() {
        // Nathaniel Sykes
        return "PED";
    }

    public String toString() {
        // Jemimah Joseph
        return "Department Name: " + getDeptName() + "\nDepartment Code: " + this.getDeptCode() +
            "\nNumber of Doctors: " + super.getNumofDoctors() + "\nNumber of Nurses: " + super.getNumOfNurses() +
            "\nNumber of Patients: " + super.getNumOfPatients();
    }
}
