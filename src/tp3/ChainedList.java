package tp3;

public class ChainedList<T> {

    Cell start;

    public ChainedList(){
    }

    public void insertToStart(T data)
    {
        Cell newstart = new Cell(data);
        newstart.next=start;
        start = newstart;
    }

    public void insertToEnd(T data)
    {
        Cell cursor = start;
        while (cursor.next != null)
            cursor = cursor.next;
        cursor.next = new Cell(data);
    }

    public String toString(){
        String result = "";
        Cell cursor = start;
        while (cursor.next != null) {
            result += cursor.value.toString() + " => ";
            cursor = cursor.next;
        }
        result += cursor.value.toString() + " => ";
        return result + "end";
    }

    public Cell searchFirst(T target)
    {
        Cell cursor = start;
        while (cursor.next != null) {
            if (cursor.value == target)
                return cursor;
            cursor = cursor.next;
        }
        return null;
    }

    public boolean contains(T data)
    {
        return searchFirst(data) != null;
    }

    public void removeElement(Cell target)
    {
        if (target == start) {
            start = start.next;
            return;
        }

        Cell cursor = start;
        while (cursor.next != null) {
            if (cursor.next == target) {
                cursor.next = target.next;
                return;
            }
            cursor = cursor.next;
        }

    }

    public void removeElement(T data){
        removeElement(searchFirst(data));
    }
}

class Cell<T>{
    T value;
    Cell next;

    Cell(T v){
        value = v;
    }

    public String toString(){
        return "("+this.value+")";
    }
}