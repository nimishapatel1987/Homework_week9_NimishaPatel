package homework_week_9;

import java.util.ArrayList;
import java.util.List;

//java programme to retrieve an element(at a specified index) from a given array list
public class Programme6 {
    public static void main(String[] args) throws Exception {

        List aList = new ArrayList();
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Orange");
        list_Strings.add("violet");
        list_Strings.add("Purple");
        list_Strings.add("Black");
        list_Strings.add("white");

        System.out.println("The element at index 4 in the Arraylist is: " + aList.get(4));
    }
}
