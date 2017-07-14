package base;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by xd031 on 2017/7/10.
 * String 本身提供的主要方法有indexOf,lastIndexOf,regionMatches(true)(true表示忽略大小写!)
 */
public class HandleStringTest {
    @Test
    public void matchStringRegion() throws Exception {
        HandleString handleString = new HandleString();
        String first_str = "Welcome to Xidian";
        String second_str = "I work with xidian";
        assertThat(handleString.matchStringRegion(first_str, 11, second_str, 12, 6), is(false));
        assertThat(handleString.matchStringRegionIngoreCase(first_str, 11, second_str, 12, 6), is(true));
    }

    @Test
    public void findStringIndex() throws Exception {
        String input = "Hello world ,Hello Xidian";
        String str = "Xidian";
        String str1 = "hs";
        String str2 = "Hello";
        HandleString handleString = new HandleString();
        assertThat(handleString.findStringIndex(input, str), is(19));
        assertThat(handleString.findStringIndex(input, str1), is(-1));
        assertThat(handleString.findStringIndex(input, str2), is(0));
        assertThat(handleString.findStringLastIndex(input, str), is(19));
        assertThat(handleString.findStringLastIndex(input, str1), is(-1));
        assertThat(handleString.findStringLastIndex(input, str2), is(13));
    }

    @Test
    public void reverseString() throws Exception {
        String test = "i love you";
        HandleString reverse = new HandleString();
        assertThat(reverse.reverseString(test), is("uoy evol i"));
    }

}
