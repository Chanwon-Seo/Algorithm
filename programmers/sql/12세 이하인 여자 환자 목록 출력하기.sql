-- https://school.programmers.co.kr/learn/courses/30/lessons/132201
select
    pt_name,
    pt_no,
    gend_cd,
    age,
    ifnull(tlno, 'NONE') 'TLNO'
from
    PATIENT
where
    (age <= 12)
  and (gend_cd = 'W')
order by
    age desc,
    pt_name
