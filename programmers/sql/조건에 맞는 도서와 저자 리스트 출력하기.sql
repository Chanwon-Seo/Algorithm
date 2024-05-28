SELECT
    b.book_id,
    a.author_name,
    date_format(b.published_date,
                '%Y-%m-%d')
FROM
    book b
        JOIN author a ON
            b.author_id = a.author_id
WHERE
        b.category = '경제'
ORDER BY
    b.published_date;