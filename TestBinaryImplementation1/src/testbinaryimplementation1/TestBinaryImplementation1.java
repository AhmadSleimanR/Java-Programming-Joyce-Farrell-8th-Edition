package testbinaryimplementation1;

public class TestBinaryImplementation1 {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node node = new Node(8);
        bt.add(3);
        bt.add(4);
        bt.add(5);
        bt.add(7);
        System.out.println(bt.getSize());
    }
}
