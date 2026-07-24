class Solution {
    public String[] findWords(String[] words) {

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        ArrayList<String> list = new ArrayList<>();

        for (String word : words) {

            String s = word.toLowerCase();

            String row;

            if (row1.indexOf(s.charAt(0)) != -1)
                row = row1;
            else if (row2.indexOf(s.charAt(0)) != -1)
                row = row2;
            else
                row = row3;

            boolean ok = true;

            for (char ch : s.toCharArray()) {
                if (row.indexOf(ch) == -1) {
                    ok = false;
                    break;
                }
            }

            if (ok)
                list.add(word);
        }

        return list.toArray(new String[0]);
    }
}
