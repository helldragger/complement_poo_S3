import tp3.ChainedList;

public class Main {

    public static void main(String[] args){
        ChainedList<Integer> list = new ChainedList<>();

        list.insertToStart(1);
        list.insertToStart(2);
        list.insertToStart(3);
        list.insertToStart(4);
        list.insertToStart(9);
        list.insertToStart(5);

        System.out.println("Initial list: "+list);

        list.insertToEnd( 6 );
        System.out.println("After inserting 6 to the end: "+list);

        System.out.println("Contains 9? " + list.contains(9));

        System.out.println("Printing 9: "+ list.searchFirst(9));

        list.removeElement( 9 );
        System.out.println("after removing 9: "+list);

        list.removeElement( 6 );
        System.out.println("after removing 6: "+list);

        list.insertToEnd( 6 );
        System.out.println("After inserting 6 to the end: "+list);
    }
}
