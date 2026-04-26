public abstract class Department {
    private String deptName;
    private String deptCode;
    private int numOfDoctors;
    private int numofNurses;
    private int numOfPatients;

    public Department(String deptName, String deptCode, int numOfDoctors, int numofNurses, int numOfPatients) {
        // Nathaniel Sykes
        setDeptName(deptName);
        setDeptCode(deptCode);
        setNumOfDoctors(numOfDoctors);
        setNumOfNurses(numofNurses);
        setNumOfPatients(numOfPatients);
    }

    public String getDeptName() {
        // Jemimah Joseph
    }

    public String getDeptCode() {
        // Nathaniel Sykes
        return "";
    }

    public int getNumOfDoctors() {
        // Jemimah Joseph
    }

    public int getNumOfNurses() {
        // Nathaniel Sykes
        return 0;
    }

    public int getNumOfPatients() {
        // Jemimah Joseph
    }

    public void setDeptName(String deptName) {
        // Nathaniel Sykes
        this.deptName = deptName;
    }

    public void setDeptCode(String deptCode) {
        // Jemimah Joseph
    }

    public void setNumOfDoctors(int numOfDoctors) {
        // Nathaniel Sykes
        this.numOfDoctors = numOfDoctors;
    }

    public void setNumOfNurses(int numOfNurses) {
        // Jemimah Joseph
    }

    public void setNumOfPatients(int numOfPatients) {
        // Nathaniel Sykes
        this.numOfPatients = numOfPatients;
    }
}
