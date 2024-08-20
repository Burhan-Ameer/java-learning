

public  class Display{
    String  name;
     int age;

public  void show(){
System.out.println(this.name);
System.out.println(this.age);
}


     public static void main(String[] args) {
  
        Display obj =new Display();
         obj.age=19;
obj.name="burhan ameer";
obj.show();

             }
}