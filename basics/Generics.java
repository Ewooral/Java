import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(23);
        Printer<Double> printer2 = new Printer<>(23.89);
        printer.print();
        printer2.print();

        shout(null, "squeeze");
        shout(57, false);
        shout("merry christmas", 234.899);

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(56);
        printList(intList);
    }

    public static <T, V> void shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!");
    }

    // using wildcards "?"
    private static void printList(List<?> myList) {
        System.out.println(myList);
    }
}

class Printer<T> {
    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        // System.out.println(thingToPrint);
    }

}
