import java.util.HashMap;

class Solution {
    
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        int count = 0;
        for(String player : players) {
            map.put(player, count);
            count++;
        }
        
        for(String call : callings) {
            int index = map.get(call);
            String temp = players[index];
            players[index] = players[index-1];
            players[index-1] = temp;
            
            map.put(players[index-1], map.get(call)-1);
            map.put(players[index], map.get(players[index-1])+1);
        }
        
        return players;
    }
}