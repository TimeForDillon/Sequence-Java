package Sequence;
/**
   This class analyzes the distribution of the last digit of values
   from a sequence.
*/
public class LastDigitDistribution
{
   private int[] counters;

   /**
      Constructs a distribution whose counters are set to zero.
   */
   public LastDigitDistribution()
   {
      counters = new int[10];
   }

   /**
      Processes values from this sequence.
      @param seq the sequence from which to obtain the values
      @param valuesToProcess the number of values to process
   */
   public void process(Sequence seq, int valuesToProcess)
   {
      for (int i = 1; i <= valuesToProcess; i++)
      {
    	 if(seq.hasNext())
    	 {
         int value = seq.next();
         int lastDigit = value % 10;
         counters[lastDigit]++;
    	 }
    	 else break;
      }
   }
   
   /**
      Displays the counter values of this distribution.
   */
   public String toString()
   {
	  String output = "";
	  double scale = (this.largestDigit() / 40.0);
      for (int i = 0; i < counters.length; i++)
      {
         output += i + ": ";
         for (int j = 0; j < counters[i]/scale; j++)
         {
        	 output += "*";
         }
         output += "\r";
      }
      return output;
   }
   
   /**
    * Finds the largest number in array.
    * @return largest number in array.
    */
   private int largestDigit()
   {
	   int largest = this.counters[0];
	   for(int i=0; i<this.counters.length; i++)
	   {
		   if(this.counters[i] > largest)
		   {
			   largest = this.counters[i];
		   }
	   }
	   return largest;
   }
}