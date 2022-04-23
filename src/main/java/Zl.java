import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

public class Zl {

    private  static volatile boolean initFlag = false;//共享变量
    public static void main(String[] args) {
    // 获取 Java 线程管理 MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        // 不需要获取同步的 monitor 和 synchronizer 信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        // 遍历线程信息，仅打印线程 ID 和线程名称信息
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" + threadInfo.getThreadId() + "] " + threadInfo.
                    getThreadName());
        }
    }
    static int say(){
        person person =new person();
        try {
            return person.age;
        }catch (Exception e){

        }finally {
            person.age=30;
            System.out.println("person.age的值"+person.age);
            return person.age;
        }
    }



//        做业务的线程
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("等待数据。。。。");
//                while (!initFlag) {
//                }
//                System.out.println("工作完成了");
//            }
//        }).start();
//        //保证第一个线程先执行
//        Thread.sleep(2000);
//        //准备数据的线程
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("开始准备数据。。。");
//                initFlag = true;
//                System.out.println("数据准备完毕。。。");
//            }
//        }).start();
}

class person{
    int age = 22;

}
