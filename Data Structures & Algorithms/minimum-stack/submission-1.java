class MinStack {
    public int top;
    public int[] arr;
    public int[] minStack;
    public MinStack() {
        arr= new int[3000];
        minStack = new int[3000];
        top=-1;
    }
    
    public void push(int val) {
        if(top==arr.length-1){
            return;
        }
        top++;
        arr[top]=val;

        // first element
        if(top==0){
            minStack[top]=val;

        }
        //new value is smaller 
        else if(val<=minStack[top-1]){
            minStack[top]=val; 
        }
        // previous minimum is still minimum
        else{
            minStack[top]=minStack[top-1];
        }
    }
    
    public void pop() {
        if(top==-1){
            return ;
        }
        top--;
    }
    
    public int top() {
        if(top==-1){
            return -1;
        }
        return arr[top];
    }
    
    public int getMin() {
        if(top==-1){
            return -1;
        
        }
        return minStack[top];
    }
}
