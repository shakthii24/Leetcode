class Solution {
    private void generate(String str, int n, int open, int close, ArrayList<String> list) {
        if (str.length() == 2 * n) {
            list.add(str);
            return;
        }

        if (open < n) {
            generate(str + "(", n, open + 1, close, list);
        }

        if (close < open) {
            generate(str + ")", n, open, close + 1, list);
        }
    }

    public List<String> generateParenthesis(int n) {
        var list = new ArrayList<String>();
        generate("", n, 0, 0, list);
        return list;
    }
}