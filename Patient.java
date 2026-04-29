public class Patient {
    private String patientName;
    private String patientAddress;
    private String patientSex;
    private String diagnosisCode;
    private String currentCondition;
    private static int patientNum;

    public Patient (String patientName, String patientAddress, String patientSex, String diagnosisCode, String currentCondition) {
        // Jemimah Joseph

        patientNum++;
    }

    public String getPatientName() {
        // Nathaniel Sykes
        return this.patientName;
    }

    public String getPatientAddress() {
        // Jemimah Joseph
    }

    public String getPatientSex() {
        // Nathaniel Sykes
        return this.patientSex;
    }

    public String getDiagnosisCode() {
        // Jemimah Joseph
    }

    public String getCurrentCondition() {
        // Nathaniel Sykes
        return this.currentCondition;
    }

    public static int getPatientNum() {
        return patientNum;
    }

    public void setPatientName(String patientName) {
        // Jemimah Joseph
    }

    public void setPatientAddress(String patientAddress) {
        // Nathaniel Sykes
        if (patientAddress.equals(null)) {
            throw new IllegalArgumentException("Patient Address is a required field.");
        }
        this.patientAddress = patientAddress;
    }

    public void setPatientSex(String patientSex) {
        // Jemimah Joseph
    }

    public void setDiagnosisCode(String diagnosisCode) {
        // Nathaniel Sykes
        if (diagnosisCode.equals(null)) {
            throw new IllegalArgumentException("Diagnosis code is a required field.");
        }
        this.diagnosisCode = diagnosisCode;
    }

    public void setCurrentCondition(String currentCondition) {
        // Jemimah Joseph
    }

    // Update patientNum
    public static void updatePatientNum() {
        patientNum--;
    }


    public String toString() {
        // Nathaniel Sykes
        return "Patient Name: " + this.getPatientName() + "\n\nPatient Address: " + this.getPatientAddress() + "\n\nPatient Sex: " + this.getPatientSex() + "\n\nDiagnosis Code: " + this.getDiagnosisCode() + "\n\nCurrent Condtion: " + this.getCurrentCondition();
    }
}
