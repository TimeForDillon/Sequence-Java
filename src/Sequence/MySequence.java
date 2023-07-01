package Sequence;
/**
 * A class for a sequence of my numbers.
 */
public class MySequence implements Sequence
{
	// 500 of my lucky numbers
	int[] myData = {871,572,56,665,997,892,389,587,895,568,436,538,513,941,679,286,91,52,217,957,419,499,953,658,746,166,82,822,446,258,803,93,51,604,422,912,660,910,334,181,998,123,466,171,426,142,695,478,868,798,560,846,242,519,274,420,76,41,30,961,565,858,250,98,968,922,819,850,979,684,633,787,46,706,486,834,22,289,16,948,260,770,778,606,355,911,611,707,240,509,975,649,321,734,971,19,903,918,773,280,463,745,835,130,807,561,210,630,789,738,557,542,493,391,342,42,1000,159,828,774,593,346,416,754,348,809,410,283,252,670,464,511,298,741,726,603,652,105,197,33,96,318,960,1,131,848,354,222,407,845,808,921,681,947,60,175,450,140,709,241,235,443,636,656,438,116,300,293,152,442,133,924,461,755,351,424,472,814,588,933,485,417,18,626,927,995,126,47,613,950,687,801,448,75,369,304,397,533,194,180,906,429,191,791,177,742,425,944,954,383,780,220,786,139,990,483,596,692,61,401,715,204,94,120,719,575,759,851,824,345,211,693,931,480,964,495,386,370,73,97,81,445,523,914,462,199,640,373,865,349,455,25,404,326,657,296,573,338,632,932,537,395,249,301,490,567,423,643,618,704,195,173,331,387,186,717,677,332,476,412,208,266,680,983,465,629,216,728,694,718,864,83,454,35,282,767,584,473,256,343,516,290,460,908,124,820,100,891,444,996,437,271,813,17,732,111,748,107,328,965,653,816,6,193,297,381,725,795,815,546,232,730,77,545,831,243,157,541,268,676,382,59,917,708,569,818,44,325,635,757,634,69,967,723,415,958,101,118,599,531,581,833,12,505,90,638,974,896,288,335,299,178,305,666,28,905,158,710,856,810,84,103,185,38,685,937,939,421,29,367,799,563,651,597,872,294,641,839,879,744,559,517,590,433,804,279,683,414,14,65,866,329,806,385,89,246,179,206,860,986,840,48,231,566,112,980,628,675,972,592,471,7,408,989,496,849,176,667,125,207,428,224,551,261,276,291,576,50,411,156,702,502,117,451,739,577,503,558,253,141,532,724,696,468,508,247,500,700,393,984,230,285,981,150,281,589,161,673,515,341,275,586,712,753,413,520,267,578,785,377,607,113,619,378,484,5,388,470,155,594};
	int n=0;
	
	/**
	 * Returns next number in sequence.
	 * @return next number in sequence.
	 */
	public int next()
	{
		int rv = myData[n];
		n++;
		return rv;
	}
	
    /**
     * Checks to see if sequence has another value.
     * @return true if sequence has another value.
     */
	public boolean hasNext()
    {
		if(n<=myData.length-1) return true;
		else return false;
    }
}
