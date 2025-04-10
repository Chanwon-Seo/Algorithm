-- https://school.programmers.co.kr/learn/courses/30/lessons/164673
select
	b.title,
	b.board_id,
	r.reply_id,
	r.writer_id,
	r.contents,
	date_format(r.created_date, '%Y-%m-%d') CREATED_DATE
from
	used_goods_board b
join used_goods_reply r on
	b.board_id = r.board_id
where
	b.created_date like '2022-10%'
order by
	r.created_date,
	b.title;