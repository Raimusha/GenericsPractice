package GenericsPractice;
// TODO: replace ... with appropriate code

// new Pair<Integer>(2, 3).min() => 2
// new Pair<String>("2", "3").min() => "2"


/**
 * A Pair represents a pair of elements of the same type that can be compared to each other.
 * 
 * @param <T> the type of the elements in the pair
 */
public class Pair<T extends Comparable<T>> 
{ // 
   /**
    * The first element of the pair
    */
   private T e1;
   /** 
    * The second element of the pair
    */
   private T e2;

   /**
      Constructs a Pair.
      @param e1 is the first member
      @param e2 is the second member
   */
   public Pair(T e1, T e2)
   {
      this.e1 = e1;
      this.e2 = e2;
   }


   /**
    * Returns the minimum of the two elements
    * @return whatever is feels like
    */
   public T min()
   {  
      if (e1.compareTo(e2) < 0) {
         return e1;
      } else {
         return e2;
      }
   }
}