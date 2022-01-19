package net.kinkytugboat.sorting.sortingtools;

public class SortTools {
    private final SortCompare sortCompare;
    private final SortTimer sortTimer;
    private final SortModify sortModify;

    public SortTools() {
        sortCompare = new SortCompare();
        sortModify = new SortModify();
        sortTimer = new SortTimer();
    }

    public int compare(int a, int b) {
        return sortCompare.compare(a, b);
    }

    public int getCompareCount() {
        return sortCompare.getCompareCount();
    }

    public void flip(int[] array, int a, int b) {
        sortModify.flip(array, a, b);
    }

    public int getChangeCount() {
        return sortModify.getChangeCount();
    }

    public void startTimer() {
        sortTimer.startTimer();
    }

    public long getTime() {
        return sortTimer.getTime();
    }

    public void saveTimerTime() {
        sortTimer.saveTimerTime();
    }

    public void reset() {
        sortCompare.reset();
        sortModify.reset();
    }
}
