package com.example.stage2;

import com.example.service.StringEditorService;

public class CharSimplifyExt {
    public String editWithCombineAndReplace(String input) {
        StringEditorService stringEditor = new StringEditorService();
        return stringEditor.doEdit(input, true);
    }

}
