package HTLlists.Linkedlists;

import HTLlists.HTLlist;


public class linkedList implements HTLlist {
    private Node root;

    @Override
    public void add(int value) {
        Node n = new Node(4);
        if (root==null){
            root = n;
        } else{
            Node actual = root;
            while (actual.getNext()!=null){
                actual = actual.getNext();
            }
            actual.setNext(n);
        }
    }

    @Override
    public int get(int index) {

        return -1;
    }

    @Override
    public void remove(int index) {
        Node actual = root;
        Node previous = root;
        Node n = new Node(4);


        if (root==null){
            return;
        } else if (root.getNext()==null){
            root.setNext(root.getNext());
        }
        for (int i = 0; i < index; i++) {
            previous = actual;
            actual = actual.getNext();
        }
        previous.setNext(actual.getNext());
       // actual.setNext(actual.getNext().getNext());

        }
    }

