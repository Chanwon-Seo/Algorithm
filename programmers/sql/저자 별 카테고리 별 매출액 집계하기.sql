-- https://school.programmers.co.kr/learn/courses/30/lessons/144856
select a.author_id, author_name, category, sum((sales * price)) total_sales
from book_sales bs
         join book b on bs.book_id = b.book_id
         join author a on b.author_id = a.author_id
where year(bs.sales_date) = 2022 and month(bs.sales_date) = 1
group by category, author_id
order by a.author_id, category desc