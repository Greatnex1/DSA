package Leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    @Test
    void lastWordLength() {
        LengthOfLastWord length = new LengthOfLastWord();

        var check   =   length.lastWordLength("ours");
        System.out.print( "total length of word is  " + check);

    }
}