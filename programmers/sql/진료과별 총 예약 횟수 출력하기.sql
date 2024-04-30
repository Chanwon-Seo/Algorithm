-- https://school.programmers.co.kr/learn/courses/30/lessons/132202
select MCDP_CD, count(*)
from APPOINTMENT
where apnt_ymd like '2022-05%'
group by 1
order by 2, 1;