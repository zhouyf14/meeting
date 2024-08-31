package com.example;

import com.example.stage2.CharSimplifyExt;
import org.junit.Assert;
import org.junit.Test;

public class Stage2Test {
    /*
        验证需要简化的用力
     */
    @Test
    public void testEditWithCombineAndReplace() {
        String input = "abcccbad";
        CharSimplifyExt charSimplifyExt = new CharSimplifyExt();
        String result = charSimplifyExt.editWithCombineAndReplace(input);
        Assert.assertEquals("d", result);
    }

    /*
    验证不需要简化的用例
 */
    @Test
    public void testEditWithCombine2() {
        String input = "aabccbbad";
        CharSimplifyExt charSimplifyExt = new CharSimplifyExt();
        String result = charSimplifyExt.editWithCombineAndReplace(input);
        Assert.assertEquals("aabccbbad", result);
    }

    /*
        验证空字符串
     */
    @Test
    public void testEditWithCombine4() {
        String input = "";
        CharSimplifyExt charSimplifyExt = new CharSimplifyExt();
        String result = charSimplifyExt.editWithCombineAndReplace(input);
        Assert.assertEquals("", result);
    }

    /*
        验证空指针入参
     */
    @Test
    public void testEditWithCombine5() {
        CharSimplifyExt charSimplifyExt = new CharSimplifyExt();
        String result = charSimplifyExt.editWithCombineAndReplace(null);
        Assert.assertNull(result);
    }

}
