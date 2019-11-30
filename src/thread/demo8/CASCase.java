package thread.demo8;

/**
 *volatile和synchronized的区别？
 *
 *
 *
 *
 * CAS （Compare and Swap） 一种高效实现线程安全性的操作
 *  CAS思想 包含三个操作数--内存位置(V),预期原值(A),和新值(B)
 */

public class CASCase {
    public volatile int value;

    public synchronized void add() {
        value++;
    }
}
