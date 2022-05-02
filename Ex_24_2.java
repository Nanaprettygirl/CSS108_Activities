package Activity_12;

public class Ex_24_2 extends LinkedList<E> {
    private Node<E> head;

    public E get(int index){
        int curr = 0;
        E cN = head;
        while (curr != index){
            cN = cN.next;
            curr++;
        }
        return cN.element;
    }
    public boolean contains(E e){
        for (E element: list) {
            if (element == e)
                return true;
        } return false;
    }
    public int indexOf(E e){
        int r = -1;
        int i = 0;
        E cN = head;
        while (cN != null){
            cN = cN.next;
            if (e == cN.element){
                r = i;
                break;
            }
            i++;
        }
        return r;
    }
    public int lastIndexOf(E e){
        int r = -1;
        int i = 0;
        E cN = head;
        while (cN != null){
            cN = cN.next;
            if (e == cN.element){
                r = i;
                break;
            }
            i++;
        }
        return r;
    }
    public E set(int index, E e){
        if (index == 0){
            Node<E> n = new Node<>(e);
            n.next = head;
            head = n;
        }
        else{
            int i = 0;
            Node<E> prev = null;
            Node<E> curr = head;
            while (i != index){
                i++;
                prev = curr;
                curr = curr.next;

            }
            Node<E> n = new Node<>(e);
            prev.next = n;
            n.next = curr;
        }
    }

}






