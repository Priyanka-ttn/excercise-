package java2;


    public class CloneAndCopyConstructor implements Cloneable {

        private String name;

        public CloneAndCopyConstructor(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public Object clone()throws CloneNotSupportedException{
            return (CloneAndCopyConstructor)super.clone();
        }

        public static void main(String[] args) {
            CloneAndCopyConstructor emp = new CloneAndCopyConstructor("Abhi");
            try {
                CloneAndCopyConstructor emp2 = (CloneAndCopyConstructor) emp.clone();
                System.out.println(emp2.getName());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }
 class Employee {
     public int id;
     public String name;

     public Employee(int id, String name) {
          this.id = id;
          this.name = name ;
     }
     public Employee(Employee employee) {
         this.id = employee.id;
         this.name = employee.name;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 '}';
     }

     public static void main(String[] args) {
         Employee emp = new Employee(1,"priyanka");
         Employee emp1 = new Employee(emp);

         System.out.println(emp);
         System.out.println(emp1);


     }
}

