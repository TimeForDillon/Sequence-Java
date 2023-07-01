package Sequence;
/**
 * A class that generates a random number sequence.
 */
public class RandomSequence implements Sequence
{
	/**
	 * Returns next number in sequence.
	 * @return next number in sequence.
	 */
    public int next()
    {
       return (int) (Integer.MAX_VALUE * Math.random());
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