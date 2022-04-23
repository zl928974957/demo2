import lombok.Data;

import java.util.concurrent.atomic.AtomicInteger;

public class DouDing {
    private String name;
    private String sex;
    private int age;
    private static Integer num = 0;
    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public DouDing(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

    public void setAtomicInteger(AtomicInteger atomicInteger) {
        this.atomicInteger = atomicInteger;
    }

    public DouDing() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int count(){
        return count = atomicInteger.incrementAndGet();
    }

    public int inc() throws InterruptedException {
        synchronized(this){
            num++;
        }
        return num;
    }

    public int incAge() {
        {
            age++;
        }
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
