import java.util.ArrayList;

public class PeriodClass {
	
	private static int divideNum;
	private static int numerator = 1;
	private static ArrayList<Integer> remainders = new ArrayList<Integer>();
	
	public static int getPeriod(int num){
		while(true){
			divideNum = numerator / num;
			numerator -= divideNum * num;
			numerator *= 10;
			if (numerator == 0) return remainders.size();
			if (remainders.contains((Integer) numerator)){
				return remainders.size() - remainders.indexOf((Integer) numerator);
			}
			else remainders.add((Integer) numerator);
		}
	}

}
