package com.example;

import com.example.stage1.CharSimplify;
import org.junit.Assert;
import org.junit.Test;

public class Stage1Test {

    /*
        验证需要简化的用例
     */
    @Test
    public void testEditWithCombine() {
        String input = "aabcccbbad";
        CharSimplify charSimplify = new CharSimplify();
        String result = charSimplify.editWithCombine(input);
        Assert.assertEquals("d", result);
    }

    /*
        验证不需要简化的用例
     */
    @Test
    public void testEditWithCombine2() {
        String input = "aabccbbad";
        CharSimplify charSimplify = new CharSimplify();
        String result = charSimplify.editWithCombine(input);
        Assert.assertEquals("aabccbbad", result);
    }

    /*
        验证去除非a-z的输入
     */
    @Test
    public void testEditWithCombine3() {
        String input = "Aaabccbbad";
        CharSimplify charSimplify = new CharSimplify();
        String result = charSimplify.editWithCombine(input);
        Assert.assertEquals("aabccbbad", result);
    }


}
