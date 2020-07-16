package com.lintcode.entrance;

/**
 * Example
 * Example 1:
 *
 * Input:  1->2->3
 * Output: 2
 * Explanation: return the value of the middle node.
 * Example 2:
 *
 * Input:  1->2
 * Output: 1
 * Explanation: If the length of list is  even return the value of center left one.
 */
public class MiddleNode {


    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        Node node = middleNode(node1);
        System.out.println(node.value);


    }

    /**
     * 这里使用快慢指针的方法来寻找终点。
     * 可以确保时间复杂度是 O(n/2)
     *
     * 快指针每次两步，慢指针每次一步。
     * 快指针到尾的时候，慢指针就是中点
     * @param head
     * @return
     */

    public static Node middleNode(Node head) {
        Node slow  =head;
        Node fast = head.next;
        while (fast!= null && fast.next !=null) {
             slow = slow.next;
             fast = fast.next.next;
        }
        return slow;
    }
}


class  Node{
    Node next;
    int value;

    public Node(int value) {
        this.value = value;
    }
}