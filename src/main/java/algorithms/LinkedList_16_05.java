package algorithms;

import java.util.NoSuchElementException;

public class LinkedList_16_05 {
    private Node head;

    @Override
    public String toString() {
        return head + "";
    }

    public void pushToHead(int data) {
        Node temp = new Node();
        temp.value = data;
        temp.next = head;
        head = temp;
    }

    public void pushToTail(int data) {
        Node temp = new Node();
        temp.value = data;
        if (head == null) {
            // Список пустой, значит новый элемент и есть head.
            // Искать "хвост" не нужно
            head = temp;
        } else {
            // Список не пустой. Ищем "хвост" списка
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = temp;
        }
    }

    public void pushToIndex(int index, int data) {
        Node temp = new Node();
        temp.value = data;
        if (index <= 0) {
            // То вставляем temp со стороны "головы" списка
            pushToHead(data);
        }
        int count = 0;
        Node t = head;
        while (t.next != null) {
            if (count == index - 1) {
                break;
            }
            count++;
            t = t.next;
        }
        // t указывает на элемент, после которого мы должны вставить temp
        temp.next = t.next;
        t.next = temp;
    }

    public void removeFirst() {
        if (head == null) {
            // Список пустой
            throw new NoSuchElementException("Список пуст");
        }

        head = head.next; // Переназначаем голову на следующий узел
    }

    public void removeLast() {
        Node temp = new Node();
        if (head == null) {
            head = temp;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node prev = null;
        Node current = head;

        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        prev.next = null; // Удаляем ссылку на последний элемент
    }

    public void remove(int index) {
        if (head == null || index < 0) {
            return;
        }
        if (index == 0) {
            // Удаляем первый элемент
            removeFirst();
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        int count = 1;
        Node t = head.next;
        Node p = head;
        while (t.next != null) {
            if (count == index) {
                break;
            }
            count++;
            p = p.next;
            t = t.next;
        }

        p.next = t.next;
    }

    public int get(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException("Invalid index or empty list");
        }

        Node current = head;
        int currentIndex = 0;

        // Ищем узел с указанным индексом
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        // Если узел не найден, выбрасываем исключение
        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return current.value;
    }

    public int size() {
        Node current = head;
        int size;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        size = count;
        return size;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + ",");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList_16_05 list = new LinkedList_16_05();
        list.pushToTail(20);
        list.pushToTail(30);
        list.pushToTail(10);
        list.pushToTail(60);
        list.pushToTail(40);
        list.pushToTail(50);
        System.out.println(list.get(3));
        System.out.println(list);
        System.out.println(list.size());
        list.print();
        list.remove(2);
        System.out.println();
        list.print();
    }

    //    pushToHead(int data),
//    pushToTail(int data),+
//    pushToIndex(int index, int data)+
//    removeFirst(),+
//    removeLast(),+
//    remove(int index) -
//    get(int index)+
//    size()+
//    print()+
    class Node {
        int value;
        Node next;

        @Override
        public String toString() {
            return value + "," + next;
        }
    }

}

