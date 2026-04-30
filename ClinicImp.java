public class ClinicImp {
    
    public static void main(String[] args) {
        // Nathaniel Sykes
        // Department and Patient Arrays
        Department[] deptArray = new Department[3];
        Patient[] patientArray = new Patient[Patient.getPatientNum()];

        // Variables for do while loop
        int choice = 0;
        boolean mainBool = false;

        do {
            try {
                choice = Integer.parseInt(JOptionPane.showInputDialog("Enter your choice (1-6)\n1. Add patient\n2. Delete Patient\n3. Search Patient\n4. Display Patient Records\n5. Display Menu\n6. Exit"));
                switch (choice) {
                    case 1:
                        addPatient();
                        break;
                    case 2:
                        String deleteName = JOptionPane.showInputDialog("Enter the patient's name.");
                        String deleteAddress = JOptionPane.showInputDialog("Enter the patient's address.");
                        deletePatient(patientArray, deleteName, deleteAddress);
                        break;
                    case 3:
                        String searchName = JOptionPane.showInputDialog("Enter the patient's name.");
                        String searchAddress = JOptionPane.showInputDialog("Enter the patient's address.");
                        searchPatient(searchName.toLowerCase(), searchAddress.toLowerCase());
                        break;
                    case 4:
                        String displayName = JOptionPane.showInputDialog("Enter the patient's name.");
                        String displayAddress = JOptionPane.showInputDialog("Enter the patient's address.");
                        Patient displayPatient = searchPatient(displayName, displayAddress);
                        displayPatientRecord(displayPatient);
                        break;
                    case 5:
                        displayMenu();
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Thank you for using this app!");
                        mainBool = true;
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error! You must select one of the options.");
            }
        } while (choice > -1 && choice <= 6 && !mainBool);
    }

    public static void addPatient() {
        // Jemimah Joseph
        String name = JOPtionPane.showInputDialog("Enter Patient Name: ");
        String address = JOptionPane.showInputDialog("Enter Patient Address: ");
        String sex = JOptionPane.showInputDialog("Enter Patient Sex: ");
        String diagnosis = JOPtionPane.showInputDialog("Enter Diagnosis Code: ");
        String condition = JOPtionPane.showInputDialog("Enter current condition: ");

        Patient newPatient = new Patient(name, address, sex, diagnosis, condition);

        patientArray[Patient.getPatientNum()] = newPatient;

        JOptionPane.showMessageDialog(null, "Patient Added Successfully.");
    }

    public static void deletePatient() {
        // Nathaniel Sykes

        try {
            int index = -1;
            for (int i = 0; i < Patient.getPatientNum(); i++) {
                if ((patientArray[i].getPatientName().equalsIgnoreCase(deleteName)) && (patientArray[i].getPatientAddress().equalsIgnoreCase(deleteAddress))) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                throw new IllegalArgumentException("Sorry, that patient is not in the database.");
            }

            boolean deleteBool = ConfirmDeletion();
            if (deleteBool != true) {
                throw new IllegalArgumentException("Thank you for trying our deletion service!");
            }

            for (int i = index; i < Patient.getPatientNum(); i++) {
                patientArray[i] = patientArray[i+1];
            }

            patientArray[Patient.getPatientNum()] = null;

            Patient.updatePatientNum();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static Patient searchPatient() {
        // Jemimah Joseph
        String name = JOptionPane.showinputDialog("Enter the patient's name: ");
        String address = JOptionPane.showInputDialog("enter the patient's address: ");

        for (int i =0; i < patientCount; i++) {
            if (patientArray[i] != null && patientArray[i].getPatientName().equalsIgnoreCase)name) &&
                patientArray[i].getPatientAddress().equalsIgnoreCase(address)) {
                return patientArray[i];
        }
    }

    JOptionPane.showMessageDialog(null, "Patient not found.");
    return null;

    }

    public static void displayPatientRecord() {
        // Nathaniel Sykes
        String output = "** Patient Record **\n\n";
        output += displayPatient.toString();

        JOptionPane.showMessageDialog(null, output);
    }

    public static void displayMenu() {
        // Jemimah Joseph
        "1. Add patient\n2. Delete Patient\n3. Search Patient\n4. Display Patient Records\n5. Display Menu\n6. Exit");
    }

    public static boolean ConfirmDeletion() {
        // Nathaniel Sykes

        int confirmInput = 0;
        boolean switchBool = false;
        boolean confirmBool;
        do { 
            try {
                confirmInput = Integer.parseInt(JOptionPane.showInputDialog("Enter your choice to confirm your deletion of this patient\n1 for Yes\n2 for No"));
                switch (confirmInput) {
                    case 1:
                        confirmBool = true;
                        switchBool = true;
                        break;
                    case 2:
                        confirmBool = false;
                        switchBool = true;
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error! You must select one of the options.");
            }
        } while (!switchBool && confirmInput > -1 && confirmInput <= 2);

        return confirmBool;
    }

}
