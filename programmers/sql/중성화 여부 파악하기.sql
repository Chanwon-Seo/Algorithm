-- https://school.programmers.co.kr/learn/courses/30/lessons/59409
SELECT ANIMAL_ID, NAME,
       if(SEX_UPON_INTAKE like '%Neutered%' or SEX_UPON_INTAKE like '%Spayed%', 'O','X') '중성화'
from ANIMAL_INS
order by 1;