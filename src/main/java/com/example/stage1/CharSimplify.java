package com.example.stage1;

import com.example.service.StringEditorService;

public class CharSimplify {
    public String editWithCombine(String input) {
        StringEditorService stringEditor = new StringEditorService();
        return stringEditor.doEdit(input, false);
    }
}
