package trial;

public class Countscore {
	public void score(int val)
	{
		if(val<=10)
		{
			System.out.println("no need to worry!");
		}
		else if(val<=18 && val>10 ) {
			System.out.println("situation is near to critical!!");
		}
		else if(val>18 && val<=22)
		{
			System.out.println("very critical situation!!!");
		}
		else
		{
			System.out.println("invalid data");
		}
	}

}
