-- https://school.programmers.co.kr/learn/courses/30/lessons/131533
SELECT
    p.product_code,
    p.price * sum(os.sales_amount) 'sales'
FROM
    product p
        JOIN offline_sale os ON
            p.product_id = os.product_id
GROUP BY
    p.product_code
ORDER BY
    sales DESC,
    p.product_code;