package net.kinkytugboat.sorting;

import net.kinkytugboat.sorting.sortfactory.SortFactory;
import net.kinkytugboat.sorting.arraystuff.SortableList;
import net.kinkytugboat.sorting.sorters.Sorter;

public class Main {
    public static void main(String[] args) {

        SortableList sortableList = new SortableList(50);
        Sorter sorter = new SortFactory().getBubble();
        sorter.sort(sortableList.getNewUnsortedList());
        System.out.println(sortableList.getUnsortedString());
        System.out.println("\n\n\n");
        System.out.println(sortableList.getCurrentString());
    }
}
