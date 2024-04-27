-- https://school.programmers.co.kr/learn/courses/30/lessons/131535
SELECT count(*)
from USER_INFO
where joined like '2021%' and age between 20 and 29
;