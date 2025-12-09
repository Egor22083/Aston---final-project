package org.example.sortings.special;

import org.example.sortings.Sortings;

import java.util.HashMap;
import java.util.Map;

public class SpecialSortStrategy {
    Map<Sortings, SpecialSort> specialSortMap;

    public SpecialSortStrategy() {
        this.specialSortMap = new HashMap<>();
        init();
    }

    private void init(){
        specialSortMap.put(Sortings.BUBBLE, new SpecialBubbleSort());
        specialSortMap.put(Sortings.QUICK, new SpecialQuickSort());
        specialSortMap.put(Sortings.MERGE, new SpecialMergeSort());
    }

    public SpecialSort get(Sortings sortings){
        return specialSortMap.get(sortings);
    }
}
