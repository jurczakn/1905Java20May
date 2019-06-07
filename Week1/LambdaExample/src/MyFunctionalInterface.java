
@FunctionalInterface
public interface MyFunctionalInterface {

	public Integer myMethod(Integer i, Integer j);

	public default void thisIsAConcreteMethod() {
		System.out.println("THis is a concrete method inside of an interface!!!!");
	}

}
