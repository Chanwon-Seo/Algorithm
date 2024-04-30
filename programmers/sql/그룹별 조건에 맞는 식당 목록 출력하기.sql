-- https://school.programmers.co.kr/learn/courses/30/lessons/131124
select
    mp.member_name,
    rr.review_text,
    date_format(rr.review_date, '%Y-%m-%d') review_date
from
    rest_review as rr
        join member_profile as mp
             on
                     mp.member_id = rr.member_id
where
        rr.member_id = (
        select
            member_id
        from
            rest_review
        group by
            member_id
        order by
            count(review_score) desc
    limit 1
    )
order by
    review_date,
    review_text;
