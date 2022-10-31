package homework_week_9;
//java programme to create a new array list, add some colours(String) and printout the collection using for each loop

import java.util.ArrayList;

public class Programme4 {
    public static void main(String[] args) {
        ArrayList<String> colourlist = new ArrayList<String>();
        colourlist.add("Green");
        colourlist.add("Violet");
        colourlist.add("Orange");
        colourlist.add("White");
        colourlist.add("Black");
        colourlist.add("Red");

        for (String colourName : colourlist) {
            System.out.println(colourName);
        }
        ArrayList<Object> List = new ArrayList<>();
        colourlist.add("colours");
        colourlist.add("6");

    }
}
