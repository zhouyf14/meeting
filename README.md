stage1：
  CharSimplify 简化字符串中相同的三个字母
  例子：
    Input: aabcccbbad
    Output:
    -> aabbbad
    -> aaad
    -> d

stage2：
    CharSimplifyExt 简化字符串中相同的三个字母并且插入该字母的前一个字母
    例子：
    Input: abcccbad
    Output:
    -> abbbad, ccc is replaced by b
    ->aaad, bbb is replaced by a
    ->d

使用栈结构和递归方式实现
入口为 com.example.Stage1Test 和 com.example.Stage2Test
