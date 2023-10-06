import java.util.Scanner;

class Patient {
    String patient_name;
    int patient_age;
    int patient_oxy_level;
    int patient_HRCT_report;

    Patient(String patient_name,
    int patient_age,
    int patient_oxy_level,
    int patient_HRCT_report) {
        this.patient_name = patient_name;
        this.patient_age = patient_age;
        this.patient_oxy_level = patient_oxy_level;
        this.patient_HRCT_report = patient_HRCT_report;
    }
}

class CovidPositive extends Exception {
    CovidPositive(String message) {
        super(message);
    }
}

class Asg4Aa {
    public static void main(String args[]) {
        try {
            Patient p1 = new Patient("Ramesh", 40, 90, 15);

            if(p1.patient_oxy_level < 95 && p1.patient_HRCT_report > 10) {
                throw new CovidPositive("Patient is Covid Positive(+) Need to Hospitalized.");
            }
        } catch(CovidPositive e) {
            System.out.println(e.getMessage());
        }
    }
}