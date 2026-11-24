public class StackDemo {
    private int arr[];
    private int top;
    private int capicity;

    StackDemo(int size){
        arr = new int[size];
        capicity = size;
        top = -1;
    }
    public void push(int x){
        if (isFull()){
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        System.out.println("inserting "+ x);
        arr[++top] = x;
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack empty");
            System.exit(1);
        }
        return arr[top--];
    }
    public int getsize(){
        return top+1;
    }
    public Boolean isEmpty(){
        return top==-1;
    }
    public Boolean isFull(){
        return top == capicity-1;
    }
    public void printStack(){
        for(int i=0; i<=top; i++){
            System.out.print(arr[i]+",");

        }
    }
    public static void main(String[] args) {
        StackDemo st = new StackDemo(10);
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.print("\nstack: ");
        st.printStack();
        st.pop();
        System.out.println("\n\nAfter poping out");
        st.printStack();
    }
}
