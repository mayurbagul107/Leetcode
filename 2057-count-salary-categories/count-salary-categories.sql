# Write your MySQL query statement below

select
    "Low Salary" AS category,
    COUNT(income) AS accounts_count
from Accounts
where income < 20000
UNION
select 
    "Average Salary" AS category,
    COUNT(income) AS accounts_count
from Accounts
where income >= 20000 AND income <= 50000
UNION
select 
    "High Salary" AS category,
    COUNT(income) AS accounts_count
from Accounts
where income > 50000