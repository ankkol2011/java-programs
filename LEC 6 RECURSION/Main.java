class Main{
 public static void main(String[] args) {
    message();
    System.out.println("We reach the initial func");
    
 }
 static void message(){
    System.out.println("Hello World");
    message1();
    System.out.println("We reach the 1st func");
   }
    static void message1(){
        System.out.println("Hello World");
        message2();
        System.out.println("WE reach the 2nd func");
     }

     static void message2(){
        System.out.println("Hello World");
        message3();
        System.out.println("WE reach the 3rd func");
     }

     static void message3(){
        System.out.println("Hello World");
        
        System.out.println("WE reach the 4th func");
     }
 }
