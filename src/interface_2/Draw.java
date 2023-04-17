package interface_2;

public interface Draw {
	void draw();
	
	default void msg() {
		System.out.println("Default Method");
	}
	

}
