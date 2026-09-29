class Solution {
    public String simplifyPath(String path) {
        String[] s = path.split("/");
        Stack<String> st = new Stack<>();

        for (String s1 : s) {

            if (s1.equals("") || s1.equals(".")) {
                continue;
            }

            if (s1.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
                continue;
            }

            st.push(s1);
        }

        return "/" + String.join("/", st);
    }
}