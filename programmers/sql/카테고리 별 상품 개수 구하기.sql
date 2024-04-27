-- https://school.programmers.co.kr/learn/courses/30/lessons/131529
SELECT substr(product_code, 1,2), count(*)
from product
group by 1;