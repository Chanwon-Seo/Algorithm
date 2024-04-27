-- https://school.programmers.co.kr/learn/courses/30/lessons/131697
SELECT price as MAX_PRICE
from product
order by price desc
limit 1;