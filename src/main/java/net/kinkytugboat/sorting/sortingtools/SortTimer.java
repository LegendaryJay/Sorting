package net.kinkytugboat.sorting.sortingtools;

public class SortTimer {
    private long start;
    private long time;
    public void startTimer(){
        start = System.currentTimeMillis();
    }
    public void saveTimerTime(){
        time = start > 0 ? System.currentTimeMillis() - start : 0;
    }

    public long getTime(){
        return time;
    }

}
