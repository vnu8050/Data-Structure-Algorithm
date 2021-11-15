package DataStructure;

public class Factorial_of_Numbers_Using_Recursion {
public static void main(String[] args) {
	int n = 6;
	System.out.println(fact(n));

}

static int fact(int n) {
	if(n == 1) {
		return 1;
	}else {
		return n*fact(n-1);
	}
}
}
