class Solution {
    public String solution(String new_id) {
        // level1
        new_id = new_id.toLowerCase();
        // level2
        new_id = new_id.replaceAll("[^a-z0-9-_.]*", "");
        // level3
        new_id = new_id.replaceAll("\\.{2,}", ".");
        // level4
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        // level4
        if(new_id.equals("")) new_id = "a";
        // level5
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }
        // level6
        new_id = new_id.replaceAll("[.]$", "");
        // level7
        if (new_id.length() <= 2) {
            char lastChar = new_id.charAt(new_id.length() - 1);

            while (new_id.length() < 3) {
                new_id += lastChar;
            }
        }

        return new_id;
    }
}