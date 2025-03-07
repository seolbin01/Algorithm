class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        String[] parr = pos.split(":");
        String[] sarr = op_start.split(":");
        String[] earr = op_end.split(":");
        String[] varr = video_len.split(":");
        
        int pmin = Integer.parseInt(parr[0]);
        int psec = Integer.parseInt(parr[1]);
        int pint = pmin * 60 + psec;
        
        int smin = Integer.parseInt(sarr[0]);
        int ssec = Integer.parseInt(sarr[1]);
        int sint = smin * 60 + ssec;
        
        int emin = Integer.parseInt(earr[0]);
        int esec = Integer.parseInt(earr[1]);
        int eint = emin * 60 + esec;
        
        int vmin = Integer.parseInt(varr[0]);
        int vsec = Integer.parseInt(varr[1]);
        int vint = vmin * 60 + vsec;
        
        if (pint >= sint && pint <= eint) {
                pmin = emin;
                psec = esec;
                pint = eint;
        }
        
        for (String c : commands) {
            
            if (c.equals("prev")) {
                if (pint < 10) {
                    pmin = 0;
                    psec = 0;
                    pint = 0;
                } else {
                    pint -= 10;
                    pmin = pint / 60;
                    psec = pint % 60;
                }
            }
            
            if (c.equals("next")) {
                if (vint - pint < 10) {
                    pmin = vmin;
                    psec = vsec;
                    pint = vint;
                } else {
                    pint += 10;
                    pmin = pint / 60;
                    psec = pint % 60;
                }
            }
            
            if (pint >= sint && pint <= eint) {
                pmin = emin;
                psec = esec;
                pint = eint;
            }
        }
        
        StringBuilder answer = new StringBuilder();
        
        if (pmin < 10) {
            answer.append(0);
        }
        
        answer.append(pmin);
        answer.append(":");
        
        if (psec < 10) {
            answer.append(0);
        }
        
        answer.append(psec);
        
        return answer.toString();
    }
}