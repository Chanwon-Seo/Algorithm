-- https://school.programmers.co.kr/learn/courses/30/lessons/59040
SELECT ANIMAL_TYPE, count(*) 'count'
from animal_ins
group by 1
order by 1