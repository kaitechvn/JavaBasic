package stackheap;

class Main {
    public static void main(String[] args) {
        StackAndHeap D1 = new StackAndHeap(); // reference variable + object in Heap, D1 in stack

        System.out.println(D1);

        System.out.println(D1.display());
    }
}
