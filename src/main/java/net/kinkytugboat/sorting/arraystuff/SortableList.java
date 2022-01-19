package net.kinkytugboat.sorting.arraystuff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static java.util.stream.Collectors.joining;

public class SortableList {
    private final int[] unsorted;
    private ArrayList<int[]> oldLists;
    private int[] currentList;
    final Random rnd;

    public SortableList(int length){
        rnd = new Random();
        oldLists = new ArrayList<>();

        unsorted = new int[length];
        for (int i = 0; i < length; i++){
            unsorted[i] = i + 1;
        }
        for (int i = 0; i < length; i++){
            int randomIndex = rnd.nextInt(0, length);
            int tempVal = unsorted[i];
            unsorted[i] = unsorted[randomIndex];
            unsorted[randomIndex] = tempVal;
        }
        currentList = unsorted.clone();
    }

    public int[] getCurrentList(){
        return currentList;
    }

    public int[] getNewUnsortedList(){
        oldLists.add(currentList.clone());
        currentList = unsorted.clone();
        return currentList;
    }

    public String getCurrentString(){
        return Arrays.stream(currentList).mapToObj("█"::repeat).collect( joining( "\n" ));
    }
    public String getUnsortedString(){
        return Arrays.stream(unsorted).mapToObj("█"::repeat).collect( joining( "\n" ));
    }
}
