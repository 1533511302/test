package maniy.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liuzonghua
 * @Package maniy.recursion
 * @Description:
 * @date 2018/8/13 11:49
 */
public class LinkedListCreator {
    /**
     * Creates linked list
     * @param data
     * @return
     */
   public Node createLinkedList(List<Integer> data){
       if (data.isEmpty()){//特殊情况
           return null;
       }

        Node firstNode =new Node(data.get(0));
        firstNode.setNext(createLinkedList(data.subList(1,data.size())));
        return firstNode;
   }
    public void add(Integer num)
    {
        Node firstNode =new Node(num);

    }

    public static void main(String[] args) {
//        LinkedListCreator creator=new LinkedListCreator();
//
//        Node.printLinkedList(creator.createLinkedList(Arrays.asList(1,2,3,4,5,6,7)));
        List<Integer> list=new ArrayList<>();
        list.add(1);

    }
}
