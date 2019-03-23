package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<SomeType> {
    private SomeType[] inputArray;

    public ArrayUtility(SomeType[] inputArray){
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(SomeType[] arrayToMerge, SomeType valueToEvaluate){
        ArrayUtility<SomeType> util = new ArrayUtility<>(inputArray);
        Integer count = 0;
        for (SomeType element : inputArray){
            if (element.equals(valueToEvaluate)){
                count++;
            }
        }
        for (SomeType element : arrayToMerge){
            if (element.equals(valueToEvaluate)){
                count++;
            }
        }
        return count;
    }

    public SomeType getMostCommonFromMerge(SomeType[] arrayToMerge){
        ArrayUtility<SomeType> util = new ArrayUtility<>(inputArray);
        List<SomeType> list = new ArrayList<>();
        list.addAll(Arrays.asList(inputArray));
        list.addAll(Arrays.asList(arrayToMerge));
        Integer count = 1, tempCount;
        SomeType mode = list.get(0);
        SomeType temp;
        for (int i = 0; i < list.size() - 1; i++){
            temp = list.get(i);
            tempCount = 0;
            for (int j = 1; j < list.size(); j++){
                if (temp == list.get(j)){
                    tempCount++;
                }
            }
            if (tempCount > count){
                mode = temp;
                count = tempCount;
            }
        }
        return mode;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate){
        return null;
    }

    public SomeType[] removeValue(SomeType valueToRemove){
        return null;
    }
}
