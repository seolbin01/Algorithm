SELECT
       COUNT(A.FISH_TYPE) AS FISH_COUNT
     , A.FISH_NAME
  FROM FISH_NAME_INFO A
  JOIN FISH_INFO B USING (FISH_TYPE)
 GROUP BY A.FISH_TYPE, A.FISH_NAME
 ORDER BY FISH_COUNT DESC;
 
 