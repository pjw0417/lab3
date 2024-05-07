import static org.junit.Assert.*;
import org.junit.*;

public class ArrayBugTest {
    // a failure inducing input for the buggy program
    @Test 
	public void testBugreverseInPlace() {
    int[] input1 = { 3,2,1 };
    ArrayBugExamples.BugreverseInPlace(input1);
    assertArrayEquals(new int[]{ 1,2,3 }, input1);
	}

    // an input that doesn't induce failure
    @Test 
	public void testBugPassreverseInPlace() {
    int[] input1 = { 3,2,1 };
    ArrayBugExamples.BugreverseInPlace(input1);
    assertArrayEquals(new int[]{ 1,2,1 }, input1);
	}
}