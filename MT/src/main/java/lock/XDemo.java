package lock;

public class XDemo {

    private static int value = 0;

    private static synchronized void add(){
        value++;
    }

    private volatile int age = 0; //内存可见性
}
