-- https://school.programmers.co.kr/learn/courses/30/lessons/132203
SELECT DR_NAME, DR_ID, MCDP_CD, date_format(HIRE_YMD, '%Y-%m-%d') 'HIRE_YMD'
from doctor
where MCDP_CD in ('CS','GS')
order by 4 desc, 1