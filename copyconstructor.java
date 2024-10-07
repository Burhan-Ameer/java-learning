public class copyconstructor {
    String name;
    int age;

    public copyconstructor(copyconstructor o1) {
    this.name=o1.name;
    this.age=o1.age;

    }
    public copyconstructor(){

    }
    public void show() 
    {
        System.out.println("the name of student is :"+name+"   age of student is :"+ age);
        
    }
public static void main(String[] args) {
    copyconstructor o1=new copyconstructor();

o1.name="burhan ameer";
o1.age=23;
o1.show();
copyconstructor o2=new copyconstructor(o1);
}


}
//   now  i have to tell you one thing that java as compared to c++ is much better in case of garbage collection so we dont do stuff like destructor like in c we usally do