-- https://school.programmers.co.kr/learn/courses/30/lessons/131537
select
    date_format(sales_date, '%Y-%m-%d') sales_date,
    product_id,
    user_id,
    sales_amount
from
    online_sale
where
    month(sales_date) = 3
union
select
    date_format(sales_date, '%Y-%m-%d') sales_date,
    product_id,
    null user_id,
    sales_amount
from
    offline_sale
where
    month(sales_date) = 3
order by
    sales_date,
    product_id,
    user_id