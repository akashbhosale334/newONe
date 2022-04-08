package interface_study;

public interface Father {
void money();
void looks();
default void property()
{
	System.out.println("fathers property");
	}
	static void intelligence()
	{
		System.out.println("fathers intelligence");
	}
}
