import java.lang.reflect.Array;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {

    private static class Node<T> {
        private T value;
        private Node<T> next;
        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node<T> head;
    private int size;

    SimpleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    SimpleLinkedList(T[] values) {
        for(T value : values){
            push(value);
        }
    }

    void push(T value) {
        Node<T> newNode = new Node<T>(value);
        newNode.value = value;
        newNode.next = head;
        head = newNode;
        size++;
    }

    T pop() {
        if(isEmpty()){
            throw new NoSuchElementException("The list is empty, no element found!");
        }
        T value = head.value;
        head = head.next;
        size--;
        return value;
    }

    void reverse() {
        Node<T> prev = null, current = head, next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    T[] asArray(Class<T> clazz) {
        T[] array = (T[]) Array.newInstance(clazz, size);
        Node<T> current = head;
        int currentIndex = 0;
        while(current != null){
            array[currentIndex] = current.value;
            current = current.next;
            currentIndex++;
        }
        return array;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }
}
