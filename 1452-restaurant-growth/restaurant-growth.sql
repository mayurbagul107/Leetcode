# Write your MySQL query statement below
select visited_on,
    (
        select SUM(amount)
        from Customer
        where visited_on between date_sub(c.visited_on, interval 6 day)
        and c.visited_on
    ) AS amount,
    round ((
        select SUM(amount)/7
        from Customer
        where visited_on between date_sub(c.visited_on, interval 6 day)
        and c.visited_on
    ),2) AS average_amount
from Customer c
where visited_on >= (
    select date_add(min(visited_on), interval 6 day)
    from Customer
)
group by visited_on
order by visited_on

