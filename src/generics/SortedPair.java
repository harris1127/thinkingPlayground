package generics;

/*
    Sorted pair of T class of a generic
    Type bounds T extends Comparable

 */
public class SortedPair<T extends Comparable> {

    private final T first;
    private final T second;

    //Construct our T
    public SortedPair(T left, T right){

       if(left.compareTo(right) < 0){
           first = left;
           second = right;
       } else {
           first = right;
           second = left;
       }

    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    /*
        Comparable is a generic method
     */
}
