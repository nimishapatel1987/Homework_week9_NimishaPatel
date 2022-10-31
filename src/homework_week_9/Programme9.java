package homework_week_9;
//Create a HashMap object called people that will store String Keys and Integer values:And use for each loop to iterate
//the value from MAP.

import java.util.HashMap;
import java.util.Map;

public class Programme9 {
    public static void main(String[] args) {
        Programme9 obj = new Programme9();
        obj.people();
    }

    public void people() {
        Map<Integer, String> people = new HashMap<>();
        //enter number and name
        people.put(1, "Prime");
        people.put(2, "Testing");
        people.put(3, "Manual");
        people.put(4, "Automation");
        people.put(5, "Java");
        people.put(6, "Postman");
        //using for each loop for iteration over Map.entrySet()
        for (Map.Entry<Integer, String> entry : people.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }
}
