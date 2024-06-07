-- https://school.programmers.co.kr/learn/courses/30/lessons/131530
SELECT
    truncate (price,
              -4) price_group,
    count(product_id) products
FROM
    product
GROUP BY
    price_group
ORDER BY
    price_group