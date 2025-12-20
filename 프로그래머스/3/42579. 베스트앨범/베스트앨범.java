import java.util.*;

class Solution {
    
    static class Music {
        int play;
        int index;
        
        Music(int play, int index) {
            this.play = play;
            this.index = index;
        }
    }
    
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        Map<String, List<Music>> hm = new HashMap<>();
        Map<String, Integer> genreTotal = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            List<Music> list = hm.getOrDefault(genres[i], new ArrayList<>());
            list.add(new Music(plays[i], i));
            hm.put(genres[i], list);

            genreTotal.put(
                genres[i],
                genreTotal.getOrDefault(genres[i], 0) + plays[i]
            );
        }

        List<String> genreOrder = new ArrayList<>(genreTotal.keySet());
        genreOrder.sort((a, b) -> genreTotal.get(b) - genreTotal.get(a));

        List<Integer> result = new ArrayList<>();

        for (String genre : genreOrder) {
            List<Music> list = hm.get(genre);

            list.sort((a, b) -> {
                if (b.play != a.play) return b.play - a.play;
                return a.index - b.index;
            });

            for (int i = 0; i < Math.min(2, list.size()); i++) {
                result.add(list.get(i).index);
            }
        }

        answer = new int[result.size()];
        for (int i=0;i<result.size();i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}