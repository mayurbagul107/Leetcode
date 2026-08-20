# Write your MySQL query statement below
select u.name, SUM(t.amount) AS balance
from Users u
join Transactions t ON u.account = t.account
group by u.account, u.name
having SUM(t.amount) > 10000