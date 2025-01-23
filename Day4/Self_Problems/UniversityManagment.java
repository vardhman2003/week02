 import java.util.ArrayList;
 class University{//University class For the University
    private String universityName; //
    private ArrayList<Department>department; 

    public University(String universityName) {//University class For the University
        this.universityName=universityName;
        this.department=new ArrayList<>();//University class For the University
    } 
    public String getuniversityName(){//University class For the University
        return this.universityName;
    }
    public void addDepartment(Department Dt){//University class For the University
        if(department.contains(Dt)){ 
            System.out.println("Departnent already Exist in the University");//University class For the University

        }
        else{
            department.add(Dt);//University class For the University
            System.out.println("In the Univerisity "+this.universityName+" the department "+Dt.getdepartmentName()+" added ");
        }
    }
}
class Department{ //Department class for the University
    private String departmentName; //Department class for the University
    private ArrayList<Faculty>faculty; //Department class for the University
    public Department(String departmentName){//Department class for the University
        this.departmentName=departmentName; 
        this.faculty=new ArrayList<>();
    } 
    public String getdepartmentName(){//Department class for the University
        return this.departmentName;
    }
    public void addfaculty(Faculty f){//Department class for the University
        if(faculty.contains(f)){
            System.out.println("Faculty already exist in the Database");
        }
        else{
            faculty.add(f);
            System.out.println("In the Department"+this.departmentName+" is added of faculty"+f.getfacultyName());
        }
    }
    public void showfaculty(){//Department class for the University
        if(faculty.isEmpty()){
            System.out.println("The "+this.departmentName+"has no faculty");//Department class for the University
        }
        else{
            for(Faculty ft:faculty){
                System.out.println("The name of the faculty is "+ft.getfacultyName()+" for the department"+this.departmentName);
            }
        }
    }
}
class Faculty{ //   Faculty class for the University
    private String facultyName; 

    public Faculty(String facultyName) {//   Faculty class for the University
        this.facultyName=facultyName;
    }
    public String getfacultyName(){//   Faculty class for the University
        return this.facultyName;
    }
}
class UniversityManagment{ 
    public static void main(String[] args) {
        University uv=new University("RGPV"); 
        Department d=new Department("B.TECH,CSE"); 
        Department d2=new Department("Electrical");
        uv.addDepartment(d); 
        uv.addDepartment(d2);
        Faculty fu=new Faculty("Pankaj Prjapati");
        Faculty fu2=new Faculty("Nishant");
        d.addfaculty(fu); 
        d.addfaculty(fu2);

    }
}