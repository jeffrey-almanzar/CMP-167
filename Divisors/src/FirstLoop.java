
import java.util.ArrayList;
public class FirstLoop {

	public static void main(String[] args) {
		int num = 1;
		ArrayList<Integer> odds = new ArrayList<Integer>();
		odds.add(3);
		odds.add(5);
		odds.add(7);
		odds.add(9);
		
		for (int i=num; i<=30; i++){
			if (i%2== 0) {
				System.out.println(i+" is an even number");
				div(odds,i);
			}else {
				
				System.out.println(i+ " is an odd number");
				div(odds,i);
			}
		}
	}
	
	public static void div(ArrayList<Integer> array, int x) {
		for (int i=0; i<array.size(); i++) {
			int num = array.get(i);
			if (x % num == 0) {
				System.out.println(x+" is divisible by "+num);
			}
		}
		
	}

}
