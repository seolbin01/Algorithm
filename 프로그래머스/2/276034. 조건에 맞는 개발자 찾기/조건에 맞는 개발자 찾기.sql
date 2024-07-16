SELECT 
       DISTINCT ID 
     , EMAIL
     , FIRST_NAME
     , LAST_NAME 
  FROM DEVELOPERS
 WHERE SKILL_CODE& (
                     (SELECT CODE FROM SKILLCODES WHERE NAME = 'Python')
                   + (SELECT CODE FROM SKILLCODES WHERE NAME = 'C#')
                     )!= 0
ORDER BY ID;