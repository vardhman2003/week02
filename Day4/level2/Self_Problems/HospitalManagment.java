class Patient { // Patient class for the Hospital
    private String patientName; // Patient class with patient name
    Patient(String patientName){// Patient class with patient name
        this.patientName=patientName;
        System.out.println("The patient with name "+this.patientName+" is admited in the Hospital");
    }
    public String getpatientName(){// Patient class with patient name
        return this.patientName;
    }
    
    
}
class Doctor{// Doctor class for the Hospital for the consultation
    private String doctorName;  
    Doctor(String doctorName){// Doctor class for the Hospital for the consultation
        this.doctorName=doctorName;
    }
    public String doctorName(){// Doctor class for the Hospital for the consultation
        return this.doctorName;
    }
    public void addconsultent(Patient p){
        System.out.println("The patient having name "+p.getpatientName()+" is consulted with the "+this.doctorName);
    }
} 
class HospitalManagment{ // Hospital class containing Doctor and Patient classes
    public static void main(String[] args) {// Hospital class containing Doctor and Patient classes
        
    
    Doctor d=new Doctor("DR.Sehgal"); // Doctor class for the Hospital for the consultation
    Doctor d2=new Doctor("Vaid Imran"); 
    Patient p=new Patient("Nishant"); // Patient class for the Hospital
    Patient p2=new Patient("Pankaj"); 
    d.addconsultent(p); // Doctor class for the Hospital for the consultation
    d2.addconsultent(p2);// Doctor class for the Hospital for the consultation
    }



}