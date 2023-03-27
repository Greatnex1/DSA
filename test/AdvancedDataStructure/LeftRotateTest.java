package AdvancedDataStructure;

import Leetcode.RotateArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeftRotateTest {

    @Test
    void leftRotate() {
        LeftRotate rotateArray = new LeftRotate();
        int arr []=   {6,3,2,7,9,1};
        rotateArray.leftRotate(arr,3);
        rotateArray.displayArray(arr);
    }

    @Test
    void displayArray() {
        LeftRotate rotateArray = new LeftRotate();
        int arr []=   {6,3,2,7,9,1};
        rotateArray.displayArray(arr);

    }
}