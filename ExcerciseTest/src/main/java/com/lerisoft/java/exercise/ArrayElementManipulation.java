package com.lerisoft.java.exercise;

import java.util.*;

public class ArrayElementManipulation {

    public static void main(String[] args) {

        /* Predefined Array Element */
        Integer fixedArray[] = {2, 3, 5, 3, 7, 3, 4, 5, 3, 4};

        /* Given Array - Take the input from user, remove occurrence and shift rest of the element to that position  */
        Scanner in = new Scanner(System.in);
        System.out.print("For Given Array : "+Arrays.toString(fixedArray) +"\nEnter valid value: ");

        /* Creating new array list and iterating array, doing the manipulation */
        try {
            Integer givenNumber = in.nextInt();
            List<Integer> outArray = new ArrayList<Integer>(fixedArray.length);

            int j = 0;
            for (int i = 0; i < fixedArray.length; i++) {
                outArray.add(fixedArray[i]);
                if (outArray.contains(givenNumber)) {
                    outArray.remove(givenNumber);
                    j++;
                }
            }
            /* Compensating the removed values */
            for (int i = 0; i < j; i++) {
                outArray.add(0);
            }

            /* Print before and after values */
            System.out.println("Array before deletion" + Arrays.toString(fixedArray));
            System.out.println("Array post deletion" + outArray);
            in.close();
        } catch (InputMismatchException ex) {
            System.out.println("Invalid number entered, Exit ..");
            return;
        }
    }
}
