class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
        
        for (String[] account : db) {
            if (account[0].equals(id)) {
                if (account[1].equals(pw)) {
                    return "login";
                } else {              
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }
}
