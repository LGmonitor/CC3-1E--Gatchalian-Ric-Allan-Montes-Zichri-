    
package studentacc;


public class StudentInfo {
private String idNumber, firstName, lastName,Sy,Term ;
    String college, AcademicProgram;
    
     void print(){
        System.out.print("University of the Cordilleras" + "\n");
        System.out.print(this.college + "\n");
        
        System.out.println("Student info:");
        System.out.print("Id Number: " + this.idNumber + "\n");
        System.out.println("Student name: " + this.lastName + ", " + this.firstName );
        System.out.println("Academic Program: " + this.AcademicProgram  + "\n");
        System.out.println(Term + Sy);
    }
    StudentInfo (String college, String AcademicProgram){
       this.college = college;
       this.AcademicProgram= AcademicProgram;
    }
    
    void setIdnumber(String idNumber){
        this.idNumber =idNumber;
    }
        
    void setlastName(String lastName){
        this.lastName =lastName;
    }
        
    void setfirstName(String firstName){ 
        this.firstName =firstName;
    }
    void setTerm(String Term){
        this.Term =Term;
    }
    void setSy(String sy){
        this.Sy =Sy;
    }
}
