import static org.junit.Assert.assertEquals;

import java.util.NoSuchElementException;

import org.junit.Test;

public class LinkedListTests {

    @Test
    public void testConstructor1() {
        LinkedList list1 = new LinkedList();
        list1.append(0);

        assertEquals(list1.first(), 0);
    }

    @Test
    public void testConstructor2() {
        LinkedList list1 = new LinkedList();
        list1.append(0);
        list1.append(1);
        list1.append(2);
        list1.append(3);

        assertEquals(list1.first(), 0);
    }

    @Test
    public void testConstructor3() {
        LinkedList list1 = new LinkedList();
        list1.append(0);
        list1.append(1);
        list1.append(2);
        list1.append(3);

        assertEquals(list1.last(), 3);
    }

    @Test
    public void testConstructor4() {
        LinkedList list1 = new LinkedList();
        list1.append(0);
        list1.append(1);
        list1.append(2);
        list1.append(3);


        assertEquals(list1.toString(), "0 1 2 3 ");

    }

    @Test
    public void testConstructor5() {
        LinkedList list1 = new LinkedList();
        list1.append(0);
        list1.append(1);
        list1.append(2);
        list1.append(3);

        assertEquals(list1.length(), 4);
    }

    @Test
    public void testPrepend() {
        LinkedList list1 = new LinkedList();
        list1.append(0);
        list1.append(1);
        list1.append(2);
        list1.append(3);
        list1.prepend(4);

        assertEquals(list1.first(), 4);
        assertEquals(list1.last(), 3);
        assertEquals(list1.toString(), "4 0 1 2 3 ");
        assertEquals(list1.length(), 5);
    }

    @Test
    public void testPrependEmpty() {
        LinkedList list1 = new LinkedList();
        list1.prepend(0);

        assertEquals(list1.first(), 0);
        assertEquals(list1.last(), 0);
        assertEquals(list1.toString(), "0 ");
        assertEquals(list1.length(), 1);
    }

    @Test
    public void testEmpty1() {
        LinkedList list1 = new LinkedList();

        assertEquals(list1.first(), null);
    }
    
    @Test
    public void testEmpty2() {
        LinkedList list1 = new LinkedList();

        try {
            list1.last();
        } catch (Exception e) {
            throw new NoSuchElementException();
        }

    }   

    @Test
    public void testEmpty3() {
        LinkedList list1 = new LinkedList();

        assertEquals(list1.toString(), "  ");

    }   

    @Test
    public void testEmpty4() {
        LinkedList list1 = new LinkedList();

        assertEquals(list1.length(), 0);
    }   
}
