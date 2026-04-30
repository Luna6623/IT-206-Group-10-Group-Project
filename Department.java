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
        return this.deptName;
    }

    public String getDeptCode() {
        // Nathaniel Sykes
        return "";
    }

    public int getNumOfDoctors() {
        // Jemimah Joseph
        return this.numOfDoctors;
    }

    public int getNumOfNurses() {
        // Nathaniel Sykes
        return 0;
    }

    public int getNumOfPatients() {
        // Jemimah Joseph
        return this.numOfPatients;
    }

    public void setDeptName(String deptName) {
        // Nathaniel Sykes
        this.deptName = deptName;
    }

    public void setDeptCode(String deptCode) {
        // Jemimah Joseph
        this.deptCode = deptCode;
    }

    public void setNumOfDoctors(int numOfDoctors) {
        // Nathaniel Sykes
        this.numOfDoctors = numOfDoctors;
    }

    public void setNumOfNurses(int numOfNurses) {
        // Jemimah Joseph
        this.numOfNurses = numOfNurses;
    }

    public void setNumOfPatients(int numOfPatients) {
        // Nathaniel Sykes
        this.numOfPatients = numOfPatients;
    }
}
