public class lab_07 {
    public static void main(String[] args){
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        threadA.start();
        threadB.start();
        threadC.start();

        System.out.println("Main thread ex");
        Thread.yield();
        System.out.println("Main thread resume");

        try{
            System.out.println("resume for 2 min");
            Thread.sleep(2000);
            System.out.println("work after sleep");
            for(int j=0;j<=5;j++){
                System.out.println("\nFrom B: "+j);
            }

        }catch(InterruptedException e){
            System.out.println("Main thread int");
        }
    }
    
}
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From Thread A: i = " + i);
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("From Thread B: j = " + j);
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("From Thread C: k = " + k);
        }
        System.out.println("Exit from C");
    }
}