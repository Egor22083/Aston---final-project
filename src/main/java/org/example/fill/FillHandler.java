package org.example.fill;

import org.example.fill.strategy.*;

import java.util.HashMap;
import java.util.Map;

public class FillHandler {
    Map<FillOption, FillStrategy> fillMap;

    public FillHandler() {
        fillMap = new HashMap<>();
        fillMap.put(FillOption.RANDOM, new RandomFill());
        fillMap.put(FillOption.MANUAL, new ManualFill());
        fillMap.put(FillOption.FILE, new FileFill());
        fillMap.put(FillOption.JSON, new JsonFill());
    }

    public FillStrategy get(FillOption fillOption) {
        return fillMap.get(fillOption);
    }
}
