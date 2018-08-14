package maniy.recursion;

/**
 * @author liuzonghua
 * @Package maniy
 * @Description:
 * @date 2018/8/13 11:42
 */
public class Node {
    private final int value;
    private Node next;

    public Node(int value){//构造方法，生成是给定初值
        this.value=value;
        this.next=null;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    //打印函数
    public static void printLinkedList(Node head){
        while (head!=null){
            System.out.println(head.getValue());
            System.out.println(head.getNext());
            head=head.getNext();
        }
        System.out.println();
    }

    @Override
    public String toString() {//toString方法，可以让我们更加清晰了解链表结构
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
