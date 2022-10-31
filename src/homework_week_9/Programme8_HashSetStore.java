package homework_week_9;
//Use a HashSet that stores Integer objects
//Store the numbers 4,7 and 8 to set.
//Show which numbers are between 1 to 10 are in the set

import java.util.HashSet;

public class Programme8_HashSetStore {
    public static void main(String[] args) {
        Programme8_HashSetStore obj = new Programme8_HashSetStore();
        obj.hashSetStoreIntegerAndNumber();
    }

    public void hashSetStoreIntegerAndNumber() {
        //Create HashSet object called numbers
        HashSet<Integer> numbers = new HashSet();
        //add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        //Show which number is between 1 to 10 in set
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set. ");
            } else {
                System.out.println(i + " was not found in the set.  ");
            }
        }
    }
}

