package homework_week_9;
//programme to iterate through all elements in an array list using Iterator

import java.util.ArrayList;
import java.util.List;

public class Programme5 {
    public static void main(String[] args) {
        Programme5 obj = new Programme5();
        obj.iterateElements();
    }

    public void iterateElements() {
        List<String> list_Strings = new ArrayList<>();
        list_Strings.add("Scotland");
        list_Strings.add("Liverpool");
        list_Strings.add("Cambridge");
        list_Strings.add("London");
        list_Strings.add("Nottingham");

        for (String element : list_Strings) {
            System.out.println(element);
        }

    }
}
