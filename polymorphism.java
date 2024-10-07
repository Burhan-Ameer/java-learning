public class polymorphism {
     int age;
     String name;
     polymorphism(){
        age=this.age;
        name =this.name;

     }
public void show(String name ,int age){
    System.out.println("the name and age are as follows"+name+"this is age"+age);
}
public void show(int age){
    System.out.println("Age is :" );
}


     public static void main(String[] args) {
    polymorphism obj =new polymorphism();
    obj.age=12;
    obj.name="burhan ameer";

}


}
