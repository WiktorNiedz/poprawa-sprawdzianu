class  Person{
   private String name;
  private int age;
  private String sex;
  private String second_name;
  public Person(int age,String name,String sex,String second_name) {
  this.age=age;
  this.name=name;
  this.second_name=second_name;
  this.sex=sex;
  }
  String getName(){
      return name;
  }
  int getAge(){
      return age;
  }
  String getSex(){
      return sex;
  }
  String getSecondName(){
      return second_name;
  }

    public void name() {
        System.out.printf("przedstawai sie");
    }
}
class Employee extends Person{
    private int salary;
    private double work;
    private int station;
    public Employee(int age,String name,String sex,String second_name,int salary,double work,int station) {
        super(age,name,second_name,sex);
        this.salary=salary;
        this.work=work;
        this.station=station;
    }

    public Employee(int salery, boolean work, int station,int age,String name,String second_name,String sex ) {
        super(age,name,second_name,sex);
    }

    public static void work() {
        System.out.printf("poracuje");

    }
    public static void salary() {
        System.out.printf("zwieksza wynagrodzenie");
    }
}

class Manager extends Employee{
    private int number_employee;
    public Manager(int salery,boolean work,int station,int number_employee) {
        super(salery,work,station);
    }
    public static void task() {
        System.out.printf("przydziela zadanie");
    }
    public static void section() {
        System.out.println("zmienia dzial");
    }


}





public class Main {
    public static void main(String[] args) {
        Person person =new Person(23,"adam","men","brzeczeszczykiewicz");
        System.out.println(person.getName());
        System.out.printf(person.getAge()+" ");
        System.out.printf(person.getSecondName());
        System.out.println(person.getSex());
        person.name();
        Employee pracownik= new Employee(34,"wojet","kobieta","tupak",45000,1,2);
        Employee.work();
        Employee.salary();
    
    
    }
    
    
    

}