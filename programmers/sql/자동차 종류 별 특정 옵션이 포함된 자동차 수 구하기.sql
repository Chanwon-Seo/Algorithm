-- https://school.programmers.co.kr/learn/courses/30/lessons/151137
SELECT car_type,count(*) cars
from car_rental_company_car
where options like ('%시트%')
group by car_type
order by car_type;