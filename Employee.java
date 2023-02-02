package employee;

import java.sql.Date;

class Employee implements Comparable <Employee>{
     int id;
     String ename;
     String gender;
     int age;
     String Role;
     String address;
     int salary;
     Date dateOfJoining;
     
     

     public Employee(int id,String ename,String gender,int age ,String Role,String address,int salary, Date i) {
		this.id=id;
          this.ename=ename;
		this.age=age;
          this.gender=gender;
          this.age=age;
          this.Role=Role;
          this.address=address;
          this.salary=salary;
          this.dateOfJoining=i;

		
	}
     
     

     public Employee() {
     }



     @Override
     public String toString() {
          return "Employee [id=" + id + ", ename=" + ename + ", gender=" + gender + ", age=" + age + ", Role=" + Role
                    + ", address=" + address + ", salary=" + salary + ", dateOfJoining=" + dateOfJoining + "]";
     }
     public int getId() {
          return id;
     }
     public void setId(int id) {
          this.id = id;
     }
     public String getEname() {
          return ename;
     }
     public void setEname(String ename) {
          this.ename = ename;
     }
     public String getGender() {
          return gender;
     }
     public void setGender(String gender) {
          this.gender = gender;
     }
     public int getAge() {
          return age;
     }
     public void setAge(int age) {
          this.age = age;
     }
     public String getRole() {
          return Role;
     }
     public void setRole(String role) {
          Role = role;
     }
     public String getAddress() {
          return address;
     }
     public void setAddress(String address) {
          this.address = address;
     }
     public int getSalary() {
          return salary;
     }
     public void setSalary(int salary) {
          this.salary = salary;
     }
     public Date getDateOfJoining() {
          return dateOfJoining;
     }
     public void setDateOfJoining(Date dateOfJoining) {
          this.dateOfJoining = dateOfJoining;
     }
     


     @Override
     public int compareTo(Employee o) {
          if (this.getSalary() > o.getSalary()) {
               return 1;
              } else if (this.getSalary() < o.getSalary()) {
               return -1;
              }
              return 0;
             }
}

 