package leetcode.stack;
import java.util.Stack;

/**
 * @基本功能:利用两个栈实现一个队列
 * @program:summary
 * @author:peicc
 * @create:2019-10-07 14:46:39
 **/
public class QueueByStack<T> {
    private Stack<T> stack1=new Stack<>();// 储存入队的元素
    private Stack<T> stack2=new Stack<>();// 从此栈中获取队首元素
    /***
     * @函数功能：入队
     * @param x:
     * @return：void
     */
    public void add(T x){
        stack1.push(x);
    }
    /***
     * @函数功能：获取队首元素
     * @param :
     * @return：T
     */
    public T peek() throws Exception {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()) {
            return stack2.peek();
        } else {
            throw new Exception("队列为空");
        }
    }
    /***
     * @函数功能：删除并返回队首元素
     * @param :
     * @return：T
     */
    public T poll() throws Exception {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            throw new Exception("队列为空");
        }
    }
}
