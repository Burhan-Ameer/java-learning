// public class constructors {
// int a;
// float d;
//  public constructors(){
// a=54;
// d=999.5f;
// }
  
    
// public static void main(String[] args) {
//     constructors obj= new  constructors();
// System.out.println(obj.a+obj.d);
// }
     
// }
//  these are all the shit about non parameterized constructors but now lets discuss about the real shit parametized constructors

public class constructors {
    String name;
    int age;
      public constructors(String name , int age){
     this.name=name;
     this.age=age;

    }
    public void show(){
        System.out.println("The name of Student is: "+name);
        System.out.println("The age is : "+age);
    }

public static void main(String[] args) {
    int age=20;
    String name="Burhan ameer";    
    constructors obj = new constructors(name,age);
       obj.show();

}
    

}

