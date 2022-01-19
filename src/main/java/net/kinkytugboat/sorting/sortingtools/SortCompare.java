package net.kinkytugboat.sorting.sortingtools;

public class SortCompare {
    private int compares;
    public int compare(int a, int b) {
        compares++;
        return Integer.compare(a, b);
    }

    public int getCompareCount() {
        return compares;
    }
    public void reset() {
        compares = 0;
    }
}
