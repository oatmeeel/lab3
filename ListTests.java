import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListTests {
    @Test 
	public void testFilter() {
    String[] string = {"hello", "hellothere", "hi", "hithere"};
    List<String> input1 = new ArrayList<String>(string);
    StringChecker input2 = "hello";
    ListExamples.filter(input1, input2);
	}
}
