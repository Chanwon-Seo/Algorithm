-- https://leetcode.com/problems/article-views-i/
select distinct author_id 'id'
from views
where author_id in (4, 7)
order by author_id