import java.util.function.Predicate;

public class Driver {

	public static void main(String[] args) {

		
		MyFunctionalInterface f = (j, k) -> j - k;
		
		isLargeEnough((i) -> i>7, 12);
		
		isLargeEnough(i -> {
							i *= 17/3;
							i /= 3;
							if (i>=20) {
								return true;
							} else {
								return false;
							}
		}, 1);
		
		useLambda((j, k) -> {return j + k;}, 12, 17);
		
	}
	
	public static void isLargeEnough(Predicate<Integer> p, Integer i) {
		if (p.test(i)) {
			System.out.println("It is large enough");
		} else {
			System.out.println("It is not large enough");
		}
	}
	
	public static void useLambda(MyFunctionalInterface i, Integer j, Integer k) {
		System.out.println(i.myMethod(j, k));
	}

}
