// This class is implementing stack using linked list
class StackClass{

    //Creating a Node class
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Creating a Stack class
    static class Stack {

        public static Node head;

        public static boolean isEmpty(){
            return head == null;
        }

        //Pushing the data into the stack
        public static void push(int data){

            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //Popping the data from the stack
        public static int pop(){

            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        //Peeking the data from the stack
        public static int peek(){
            
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        
        Stack s = new Stack();

        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.err.println(s.peek()); //Peeking the top element of the stack
            s.pop(); //Popping the top element of the stack after peeking
        }
    }
}

// Output:
// 4
// 3
// 2
// 1
// 0