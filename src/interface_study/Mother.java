package interface_study;

public interface Mother {
void nature();
default void property()
{
	System.out.println("mothers property");
	}
static void intelligence()
{
	System.out.println("mothers intelligence");
	}
}
