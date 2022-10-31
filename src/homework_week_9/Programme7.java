package homework_week_9;
//Write a java program to test an array list is empty or not. Define array list with underground tube names

import java.util.ArrayList;

public class Programme7 {
    public static void main(String[] args) {
        Programme7 obj = new Programme7();
        obj.arrayList();
    }

    public void arrayList() {
        ArrayList<String> Tube = new ArrayList<>();
        Tube.add("Waterloo");
        Tube.add("Circle");
        Tube.add("Bakerloo");
        Tube.add("Central");
        Tube.add("Piccadilly");
        Tube.add("Jubilee");
        Tube.add("Metropolitan");
        Tube.add("Victoria");
        Tube.add("Hamersmith");
        System.out.println("Original array list: " + Tube);
        System.out.println("Checking the above array list is empty or not! " + Tube.isEmpty());
        Tube.removeAll(Tube);
        System.out.println("Array list after remove all elemetns " + Tube);
        System.out.println("Checking the above array list is empty or not! " + Tube.isEmpty());
    }
}
