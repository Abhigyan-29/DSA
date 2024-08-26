package Misc;

public class LL {
    class Node {
        Node head;
        Node tail;
        String data;
        //node ek type ka variable hai
        Node next;

        public Node(String data) {
            this.data = data;
            //jab bhi nya node banaenge , uske lie agla node null hoga
            this.next = null;
        }
    }
    //add --  first , last
     public void addfirst (String data){
        Node newnode = new Node (data);
        if (head == null){
            head = newnode;
            return;

        }
        newnode.next = head;
        head = newnode;
     }

    public static void main(String[] args) {
        LL list = new LL();
    }
}
