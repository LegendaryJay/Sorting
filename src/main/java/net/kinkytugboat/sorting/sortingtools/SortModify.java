package net.kinkytugboat.sorting.sortingtools;

public class SortModify {
    private int changeCount;

    public void flip(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        changeCount++;
    }

    public int getChangeCount() {
        return changeCount;
    }

    public void reset() {
        changeCount = 0;
    }
}
