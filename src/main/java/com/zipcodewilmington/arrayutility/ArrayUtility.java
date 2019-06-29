package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <T> {
    private T array[];

    public ArrayUtility(T[] array) {
        this.array = array;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        Integer count = 0;
        for(int x=0; x< arrayToMerge.length;x++){
            if(arrayToMerge[x].equals(valueToEvaluate))
                count++;}
//        T [] inputArray= array;
//        for(int x=0;x<inputArray.length;x++){
//            if(inputArray[x].equals(valueToEvaluate))
//                count++;
//        }
        count = getNumberOfOccurrences(valueToEvaluate)+count;
        return count;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer count =0;
        T [] inputArray= array;
        for(int x=0;x<inputArray.length;x++){
            if(inputArray[x].equals(valueToEvaluate))
                count++;
        }
        return count;
    }

    public T[] removeValue(T valueToRemove) {
        List<T> list= new ArrayList<>();
        T [] inputArray = array;
        for(int x=0; x<inputArray.length;x++){
            if(!(inputArray[x].equals(valueToRemove)))
                list.add(inputArray[x]);
        }

        return list.toArray(Arrays.copyOf(inputArray,list.size()));

    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        List<T> list = new ArrayList<>();
        T [] inputArray=array;
        T mostCommon = list.get(0);
        for(int x= 0; x<inputArray.length;x++)
            list.add(inputArray[x]);
        for(int x= 0; x<arrayToMerge.length;x++)
            list.add(arrayToMerge[x]);
        Integer number =0;
        for(int x=0; x<list.size()-1;x++){
           Integer y= getNumberOfOccurrences(list.get(x));
            if(y > number){
                number =y;
                mostCommon=list.get(x);
            }


        }

        return mostCommon;
    }
}

