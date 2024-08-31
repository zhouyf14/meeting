package com.example;


import org.junit.Assert;
import org.junit.Test;


public class StringEditorTest {


    @Test
    public void testEditWithCombine() {
        String input = "aabcccbbad";
        StringEditor stringEditor = new StringEditor();
        String result = stringEditor.editWithCombine(input);
        Assert.assertEquals("d", result);
    }

    @Test
    public void testEditWithCombineAndReplace() {
        String input = "abcccbad";
        StringEditor stringEditor = new StringEditor();
        String result = stringEditor.editWithCombineAndReplace(input);
        Assert.assertEquals("d", result);
    }

    @Test
    public void testEditWithCombine1() {
        String input = "aabccccbbad";
        StringEditor stringEditor = new StringEditor();
        String result = stringEditor.editWithCombine(input);
        Assert.assertEquals("aabcbbad", result);
    }

    @Test
    public void testEditWithCombine2() {
        String input = "aabccbbad";
        StringEditor stringEditor = new StringEditor();
        String result = stringEditor.editWithCombine(input);
        Assert.assertEquals("aabccbbad", result);
    }

    @Test
    public void testEditWithCombine3() {
        String input = "Aaabccbbad";
        StringEditor stringEditor = new StringEditor();
        String result = stringEditor.editWithCombine(input);
        Assert.assertEquals("aabccbbad", result);
    }


    @Test
    public void testEditWithCombineAndReplace1() {
        String input = "aabccccbbad";
        StringEditor stringEditor = new StringEditor();
        String result = stringEditor.editWithCombineAndReplace(input);
        Assert.assertEquals("aabbcbbad", result);
    }

    @Test
    public void testEditWithCombine4() {
        String input = "";
        StringEditor stringEditor = new StringEditor();
        String result = stringEditor.editWithCombine(input);
        Assert.assertEquals("", result);
    }

    @Test
    public void testEditWithCombine5() {
        StringEditor stringEditor = new StringEditor();
        String result = stringEditor.editWithCombine(null);
        Assert.assertNull(result);
    }

}
