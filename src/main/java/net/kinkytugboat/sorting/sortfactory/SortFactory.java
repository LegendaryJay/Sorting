package net.kinkytugboat.sorting.sortfactory;

import net.kinkytugboat.sorting.sorters.Bubble;
import net.kinkytugboat.sorting.sorters.MergeSort;
import net.kinkytugboat.sorting.sorters.Sorter;

public class SortFactory {
    public Sorter getBubble(){
        return new Bubble();
    }
    public Sorter getMergeSort(){
        return new MergeSort();
    }
}
