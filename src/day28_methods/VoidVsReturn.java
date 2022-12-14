package day28_methods;

public class VoidVsReturn {

    public static void main(String[] args) {
        sayHello();
        sayBye(); //the return value it was not used, so we don't see any difference
        //example:   chatAt(0)
        System.out.println(sayBye());  // methods returns String, i print a String
        String str = sayBye(); // method returns String and assigned the result into the new variable
        System.out.println(str);
    }



    public static void sayHello() {
        System.out.println("Hello");
    }

    public static String sayBye (){
        return "Bye";
    }







}
