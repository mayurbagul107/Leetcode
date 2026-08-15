# Write your MySQL query statement below
select u.name, coalesce(sum(r.distance), 0) AS travelled_distance
from Users u
left join Rides r ON u.id = r.user_id
group by u.id, u.name
order by travelled_distance DESC, u.name ASC