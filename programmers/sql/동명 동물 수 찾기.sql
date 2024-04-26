SELECT name, count(name) 'count'
FROM animal_ins
group by name
having count(name) > 1
order by name