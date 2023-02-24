package in.prabodh;
 import java.io.FileWriter;
 import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
    
    public  class Writedatatofile {
    
        public static void main(String[] args) throws IOException {
            
            try (FileWriter fw = new FileWriter("Test.csv")) {
                ArrayList<Employee> emp=new ArrayList<Employee>();
                
                System.out.println("id,ename,gender,age,role,address,dateOfJoining,salary");
                Employee emp1 = new Employee(1,"ank", "male",22,"developer","hyd",2000, new Date(11-01-2022));
                Employee emp2 = new Employee(2,"dav", "male",25,"tester","knr",5000,new Date(12-2-2022));
                Employee emp3 = new Employee(3,"danvi", "female",28,"tester","knr",8000,new Date(12-6-2022));
                Employee emp4 = new Employee(4,"Ryan", "male",29,"Dengineer","jgl",4000,new Date(12-7-2022));
                Employee emp5 = new Employee(5,"Syam", "male",25,"tester","knr",3000,new Date(12-8-2022));

    
               emp.add(emp1);
               emp.add(emp2);
               emp.add(emp3);
               emp.add(emp4);
               emp.add(emp5);

               for(Employee emps:emp){
                     System.out.println("Employees:"+emps);
                     fw.write(emp+"\n");
               
               }
               
               Employee max = Collections.max(emp);
               System.out.println("ArrayList max value : " + max.getSalary() + " for emp id : " + max.getId());
               fw.close();
              
               
               System.out.println("Total count of employees:" +emp.size());
                 
                int id;
                try (Scanner sc = new Scanner(System.in)) {
                    System.out.println("enter id number to know the role of employee:");
                    id=sc.nextInt();
                }
                switch(id){
                    case 1:
                    System.out.println("Developer");
                    break;
                    case 2:
                    System.out.println("tester");
                    break;
                    case 3:
                    System.out.println("tester");
                    break;
                    case 4:
                    System.out.println("Dengineer");
                    break;
                    case 5:
                    System.out.println("tester");
                    break;
                    default:
                    System.out.println("enter valid id");

                    
                }
            
            }
            
        
        }
    }
        
    
    

