package com.example.service;

import java.util.Stack;

public class StringEditorService {
    // the number of char need to combine
    final int COMBINE_NUM = 3;

    public String doEdit(String input, boolean isNeedAddBeforeChar) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char charredAt = input.charAt(i);
            pushAndCombine(stack, charredAt, isNeedAddBeforeChar);
        }
        return charStackToString(stack);
    }

    // join char stack element to string
    private String charStackToString(Stack<Character> stack) {
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }

    // when itemChar push into the stack make the same char count meet with the requirement num, the same char need to combine
    private void pushAndCombine(Stack<Character> resultStack, Character itemChar, boolean isNeedAddBeforeChar) {
        // only push a-z char
        if (itemChar < 'a' || itemChar > 'z') {
            return;
        }

        if (resultStack.size() < COMBINE_NUM - 1) {
            resultStack.push(itemChar);
            return;
        }

        Stack<Character> tmpStack = new Stack<>();
        boolean isNeedPushBack = false;
        // check the stack's top char is equal the itemChar
        for (int i = 0; i < COMBINE_NUM - 1; i++) {
            // transfer the top char from stack to tmp stack until the different char appear
            Character charOnTop = resultStack.pop();
            tmpStack.push(charOnTop);
            if (charOnTop.charValue() != itemChar.charValue()) {
                isNeedPushBack = true;
                break;
            }
        }

        // the same char had been pop
        if (isNeedPushBack) {
            // transfer the tmp stack element back to the result stack
            while (!tmpStack.isEmpty()) {
                resultStack.push(tmpStack.pop());
            }
            resultStack.push(itemChar);
        } else {
            if (isNeedAddBeforeChar) {
                // push the (itemChar - 1) element to the result stack
                pushAndCombine(resultStack, (char) (itemChar - 1), true);
            }
        }

    }

}
