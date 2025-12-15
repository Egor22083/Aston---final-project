package org.example.sortings.sorting;

import org.example.comparators.strategy.CompareStrategy;
import org.example.comparators.strategy.Comparisons;

import java.util.HashMap;
import java.util.Map;

public class SortingStrategy {
    Map<Sortings, Sorting> sortingMap;
    CompareStrategy compareStrategy;

    public SortingStrategy() {
        sortingMap = new HashMap<>();
        init();
        compareStrategy = new CompareStrategy();
    }

    private void init(){
        sortingMap.put(Sortings.BUBBLE, new BubbleSort());
        sortingMap.put(Sortings.QUICK, new QuickSort());
    }

    public Sorting get(Sortings sortings, Comparisons comparisons){
        Sorting sorting = sortingMap.get(sortings);
        if (compareStrategy.get(comparisons) != null)
            sorting.setComparator(compareStrategy.get(comparisons));

        return sorting;
    }
}
