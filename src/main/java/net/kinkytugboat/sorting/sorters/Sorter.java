package net.kinkytugboat.sorting.sorters;

import net.kinkytugboat.sorting.sortingtools.SortTools;

public abstract class Sorter {
    protected final SortTools sortTool;
    Sorter(){
        sortTool = new SortTools();
    }

    protected abstract void sortLogic(int[] list);

    public void sort(int[] list){
        sortTool.reset();
        sortTool.startTimer();
        sortLogic(list);
        sortTool.saveTimerTime();
    }

    public int getCompareCount() {
        return sortTool.getCompareCount();
    }

    public int getChangeCount() {
        return sortTool.getChangeCount();
    }

    public long getTime() {
        return sortTool.getTime();
    }
}
