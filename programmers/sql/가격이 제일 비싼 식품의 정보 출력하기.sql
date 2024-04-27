-- https://school.programmers.co.kr/learn/courses/30/lessons/131115
SELECT PRODUCT_ID, PRODUCT_NAME, PRODUCT_CD, CATEGORY, PRICE
from FOOD_PRODUCT
order by price desc
limit 1;