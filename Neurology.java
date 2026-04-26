public class Neurology extends Department{
    public Neurology(String deptName, String deptCode, int numOfDoctors, int numofNurses, int numOfPatients) {
        super(deptName, deptCode, numOfDoctors, numofNurses, numOfPatients);
    }

    public String getDeptName() {
        // Nathaniel Sykes
        return "Neurology";
    }

    public String getDeptCode() {
        // Jemimah Joseph
    }

    public String toString() {
        // Nathaniel Sykes
        return "Department Name: " + this.getDeptName() + "\n\nDepartment Code:" +  this.getDeptCode() + "\n\nNumber of Doctors: " + super.getNumOfDoctors() + "\n\nNumber of Nurses: " + super.getNumOfNurses() + "\n\nNumber of patients: " + super.getNumOfPatients(); 
    }
}
