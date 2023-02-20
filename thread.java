import java.util.*;
class thread{
    public static void main(String args[]){
        new A().start();
        new B().start();
    }
}


class A extends Thread{
    public void run(){
        Random r = new Random();
        for(int i=0;i<5;i++){
            int a = r.nextInt(10);
            System.out.println("inside thread A :"+a);
        }
    }
}
class B extends Thread{
    public void run(){
        Random r = new Random();
        for (int i=0;i<5;i++){
            int a = r.nextInt(10);
            System.out.println("inside thread B :"+a);
        }
    }
}
