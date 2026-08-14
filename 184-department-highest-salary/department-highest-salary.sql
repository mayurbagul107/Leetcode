# Write your MySQL query statement below
select d.name AS Department,
    e.name AS Employee,
    e.salary AS Salary
from Employee e
join Department d ON e.departmentId = d.id
where (e.departmentId, e.salary) IN (
    select departmentId, MAX(salary)
    from Employee
    group by departmentId
)