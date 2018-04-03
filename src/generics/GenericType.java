package generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GenericType {

    public static void main(String[] args) {

        Person donDraper = new Person("Don Draper", 89);
        Person peggyOlson = new Person("Peggy Olson", 65);
        Person ryanHarris = new Person("Ryan Harris", 25);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggyOlson);
        madMen.add(ryanHarris);

        /*
            To summarize,
            if sorting of objects needs to be based on natural order then use
            Comparable whereas if you sorting needs to be done on attributes of different objects,
            then use Comparator in Java.

         */

        Person youngestPerson = (Person) min(madMen, new AgeComparator());
        Person youngestPersonGenerics = (Person) min(madMen, new AgeComparator());
        System.out.println(youngestPerson);

    }

    @Test
    public void shouldRetainOrderOfOrderedPair() {

        SortedPair<Integer> pair = new SortedPair<>(1, 2);

        assertEquals(1, pair.getFirst().intValue());
        assertEquals(2, pair.getSecond().intValue());

    }

    public static Object min(List values, Comparator comparator) {

        if(values.isEmpty()) {

            throw new IllegalArgumentException("List is empty, cannot find minimum");
        }

        Object lowestElement = values.get(0);

        for(Object value : values) {

            final Object element = value;

            if(comparator.compare(element, lowestElement) < 0) {

                lowestElement = element;
            }
        }

        return lowestElement;

    }

    public static <T> T minGeneric(List<T> values, Comparator<T> comparator) {

        if(values.isEmpty()) {

            throw new IllegalArgumentException("List is empty, cannot find minimum");
        }

        T lowestElement = values.get(0);

        for(T value : values) {

            final T element = value;

            if(comparator.compare(element, lowestElement) < 0) {

                lowestElement = element;
            }
        }

        return lowestElement;

    }


}
