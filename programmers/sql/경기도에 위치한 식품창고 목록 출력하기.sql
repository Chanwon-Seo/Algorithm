-- https://school.programmers.co.kr/learn/courses/30/lessons/131114
SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, ifnull(FREEZER_YN,'N')
from FOOD_WAREHOUSE
where ADDRESS like '경기도%';