/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentacc;

import java.util.Scanner;
public class StudentACC {



    public static void main(String[] args) {
        
     Scanner sa = new Scanner(System.in);
     
     System.out.println("Enter the which student to read: student1, student2");
     String sentence =sa.nextLine();
     
     if (sentence.startsWith("student1")) {
         student1();
         
     }
     else if (sentence.startsWith("student2")) {
         student2();
     
  
      }else{
      }
           
        
    }
    public static void student1(){
     StudentInfo student1 = new StudentInfo ("College of Information Technology and Computer Science","BSIT- WEB TECHNOLOGY TRACK");
      student1.setIdnumber("18-4510-726");
       student1.setfirstName("Zichri");
       student1.setlastName("Montes");
       student1.setTerm("2nd Term");
       student1.setSy("2018-2019");
        student1.print();
    }
     public static void student2(){
           StudentInfo student2 = new StudentInfo ("College of Information Technology and Computer Science", "BSIT - WEB TECHNOLOGY TRACK");
          
        student2.setIdnumber("18-4566-196");
        student2.setfirstName("RIC ALLAN");
        student2.setlastName("GATCHALIAN");
        student2.setTerm("2nd Term");
        student2.setSy("2018-2019");
         student2.print();
     }

}

