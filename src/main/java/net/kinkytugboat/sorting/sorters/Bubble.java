package net.kinkytugboat.sorting.sorters;

public class Bubble extends Sorter {
    public void sortLogic(int[] list){
        //how many things to ignore
        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length - i - 1; j++){
                if (sortTool.compare(list[j], list[j + 1]) == 1){
                    sortTool.flip(list, j, j + 1 );
                }
            }
        }
    }
}
