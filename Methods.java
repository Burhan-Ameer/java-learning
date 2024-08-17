// public class Methods {
    
//     public static int add(int a , int b){
//         int c=a+b;
//         return c;
//    }

//  public static void main(String[],args){
//     Methods obj =new Methods();
//      Sobj.add(3,6);
//  }}
//  well all of my effort of writting this  code is in vein and it turned out to be  wrong 
//  here is correct code
public class Methods {
    public static int add( int a,int v){
        int c=a+v;
        return c;
    }
    
    public static void main(String[] args) {
         //  now if we want to access it we could simply write 
          int sum =add(3, 5);
          System.out.println(sum);
    }
}
//  differece between static vs public
// the static keyword is used when we dont want to access the function by object but when we use the public keyword we could access that by using object