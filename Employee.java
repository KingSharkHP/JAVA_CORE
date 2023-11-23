public class Employee {

   private  String nameEmployee;
   private double lastSalary;
   
   Employee(String name, double currentSalary ){
      this.nameEmployee = name;
      this.lastSalary = currentSalary;
   }

   public String getName() {
      return nameEmployee;
   }

   public double getSalary(){
      return lastSalary;
   }

   public void raiseSalary(double byPercent){
      double updateSalary = lastSalary + lastSalary * byPercent;
      System.out.println(nameEmployee + " is paid $ " + updateSalary + "/month");
   }

   public static void main(String[] args) {
      Employee obj = new Employee("Harry Jones", 50000);
      obj.getName();
      obj.getSalary();
      obj.raiseSalary(10);
   }
}
