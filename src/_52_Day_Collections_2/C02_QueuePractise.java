package _52_Day_Collections_2;

import java.util.*;

public class C02_QueuePractise {
    public static void main(String[] args) {

        Queue<Integer> priorityQue= new PriorityQueue<>();
        priorityQue.addAll(Arrays.asList(20,150,200,40,120));
        priorityQue.add(30);
        System.out.println("priorityQue = " + priorityQue);  // 20,40,30,200,150,120 --> random order

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(20,150,200,40,120));
        arrayDeque.add(30);
        System.out.println("arrayDeque = " + arrayDeque);    // 20,150,200,40,120,30 --> giris sirasini korudu (preserve insertaion order)

      //  System.out.println("arrayDeque.stream().findFirst() = " + arrayDeque.stream().findFirst());

        Queue <Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(20,150,200,40,120));
        linkedList.add(30);
        System.out.println("linkedList = " + linkedList);   // giris sirasina gore


        System.out.println("((List)linkedList).get(1) = " + ((List) linkedList).get(1));
        System.out.println();
        System.out.println("priorityQue = " + priorityQue);
        System.out.println("priorityQue.peek() = " + priorityQue.peek());
        System.out.println();
        System.out.println("priorityQue = " + priorityQue);

        System.out.println("priorityQue.poll() = " + priorityQue.poll()); // first element will be removed
        System.out.println("priorityQue = " + priorityQue);
        System.out.println("priorityQue.peek() = " + priorityQue.peek());
        System.out.println();
        System.out.println("arrayDeque.poll() = " + arrayDeque.poll());
        System.out.println("arrayDeque = " + arrayDeque);

        System.out.println();
        System.out.println("linkedList = " + linkedList);
        System.out.println("linkedList.poll() = " + linkedList.poll());  // FIFO
        System.out.println("linkedList = " + linkedList);


    }
}
