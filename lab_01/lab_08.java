public class lab_08 {
    public static void main(String args[]){
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        threadA.setPriority(Thread.MIN_PRIORITY);
        threadB.setPriority(Thread.NORM_PRIORITY);
        threadC.setPriority(Thread.MAX_PRIORITY);

        threadA.start();
        threadB.start();
        threadC.start();
    }

        static class A extends Thread{
            public void run(){
                for(int i=1;i<=5;i++){
                    System.out.println("\nFrom thread A : "+i);
                }
                System.out.println("Exit from A");
            }

        }
        static class B extends Thread{
            public void run(){
                for(int j=1;j<=5;j++){
                    System.out.println("\nFrom thread B : " +j);
                }
                System.out.println("Exit from B");
            }
        }
        static class C extends Thread{
            public void run(){
                for(int k=1;k<=5;k++){
                    System.out.println("\nFrom Thraed C : "+k);
                }
                System.out.println("Exit from C");
            }
        }

    }
