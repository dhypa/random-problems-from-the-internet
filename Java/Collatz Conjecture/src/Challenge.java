// https://edabit.com/challenge/8s2jBHWKXCrT5oQ63

public class Challenge {
	public static int collatzConjecture(int n) {
		int x = n;
		int counter =0;
		while (!(x == 1)&&(x>1)){		
			if (x%2==0) {
				x/=2;	
			}
			else {
				x=(x*3)+1;
			}
			counter++;
			
		}
		return counter;}
	
	
	public static void main(String args[]){
				
		
		System.out.println(collatzConjecture(5));
	}
			
}

