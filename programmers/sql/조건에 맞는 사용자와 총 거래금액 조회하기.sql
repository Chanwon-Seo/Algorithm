SELECT
    user_id,
    nickname,
    sum(price) AS total_sales
FROM
    used_goods_user AS u
        JOIN used_goods_board AS b
             ON
                     u.user_id = b.writer_id
WHERE
        b.status = 'DONE'
GROUP BY
    user_id
HAVING
        total_sales >= 700000
ORDER BY
    total_sales