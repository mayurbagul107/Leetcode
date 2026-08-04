# Write your MySQL query statement below
select product_name, SUM(unit) as unit
from Products Inner Join Orders USING (product_id)
where month (order_date) = 2 AND year (order_date) = 2020 
group by product_name
having unit >= 100