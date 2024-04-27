-- https://school.programmers.co.kr/learn/courses/30/lessons/59414
SELECT ANIMAL_ID, NAME, DATE_FORMAT(datetime, '%Y-%m-%d') '날짜'
from ANIMAL_INS
order by 1;