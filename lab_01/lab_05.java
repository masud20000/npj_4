class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("\nFrom thread A: i = "+i);
        }
        System.out.println("Exit from A");
    }
}
class B extends Thread{
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("\nFrom thread B : j = "+j);
        }
        System.out.println("Exit from B");
    }
}
class C extends Thread{
    public void run(){
        for(int k=1;k<=5;k++){
            System.out.println("\nFrom thread c : k = " +k);
        }
        System.out.println("Exit from C");
    }
}



public class lab_05 {
    public static void main(String args[]){
        new A().start();
        new B().start();
        new C().start();
    }
    
}
