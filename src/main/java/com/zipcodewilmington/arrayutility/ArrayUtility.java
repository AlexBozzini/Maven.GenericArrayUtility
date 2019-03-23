package com.zipcodewilmington.arrayutility;

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
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate){
        return null;
    }

    public SomeType[] removeValue(SomeType valueToRemove){
        return null;
    }
}
