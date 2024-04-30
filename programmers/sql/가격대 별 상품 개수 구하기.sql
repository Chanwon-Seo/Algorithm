-- https://school.programmers.co.kr/learn/courses/30/lessons/131530
select truncate (price,-4) price_group,
       count(product_id) products
from product
group by price_group
order by price_group