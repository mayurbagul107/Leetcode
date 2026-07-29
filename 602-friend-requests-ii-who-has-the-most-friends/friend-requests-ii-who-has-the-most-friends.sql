# Write your MySQL query statement below
select id, COUNT(*) AS num 
from (
    select requester_id AS id from RequestAccepted
    UNION ALL
    select accepter_id AS id from RequestAccepted
) AS friend_count
group by id
order by num desc
limit 1