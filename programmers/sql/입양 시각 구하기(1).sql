-- https://school.programmers.co.kr/learn/courses/30/lessons/59412
select
    hour(datetime),
    count(datetime)
from
    animal_outs
where
    hour(datetime) >= 9
  and hour(datetime)<= 19
group by
    1
order by
    1;