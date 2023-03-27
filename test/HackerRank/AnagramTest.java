package HackerRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void test (){
        Anagram ana = new Anagram();
  var   check =   ana.isAnagram("madam","madam");
        System.out.println(check);
    }

}