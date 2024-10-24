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




    public void work() {
        System.out.printf("poracuje");

    }
    public void salary() {
        System.out.printf("zwieksza wynagrodzenie");
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
        Employee pracownik= new Employee(34,"wojet","kobieta","tupak",45000,34,2);
        person.work();
    
    
    }
    
    
    

}