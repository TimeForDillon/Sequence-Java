package Sequence;
/**
 * A class that generates a sequence of squared numbers.
 */
public class SquareSequence implements Sequence
{
   private int n;

	/**
	 * Returns next number in sequence.
	 * @return next number in sequence.
	 */
   public int next()
   {
      n++;
      return n * n; 
   }
   
   /**
    * Checks to see if sequence has another value.
    * @return true if sequence has another value.
    */
   public boolean hasNext()
   {
	   return true;
   }
}