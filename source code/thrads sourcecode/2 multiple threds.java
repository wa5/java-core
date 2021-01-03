class Sthread2 extends Thread{  
public void run(){  
System.out.println("thread is running...");  


//countdown
int i = 10;
while (i>0){
System.out.println("Remaining: "+i+" seconds");
try {
 i--;
 Thread.sleep(1000L);    // 1000L = 1000ms = 1 second
}
catch (InterruptedException e) {
    //I don't think you need to do anything for your particular problem
}
}

} 

}
class Sthreads extends Thread{  
public void run(){  
System.out.println("thread is running...");  
//countdown
int i = 20;
while (i>0){
System.out.println("Remaining: "+i+" seconds");
try {
 i--;
 Thread.sleep(1000L);    // 1000L = 1000ms = 1 second
}
catch (InterruptedException e) {
    //I don't think you need to do anything for your particular problem
}
}




}  
public static void main(String args[]){  
Sthreads  t1=new Sthreads();  
t1.start();  
Sthread2  t2=new Sthread2();
t2.start();
 }  
}
