# Write your MySQL query statement below
select d.name AS Department,
        e1.name AS Employee,
        e1.salary AS Salary
from Employee e1 inner join Department d
ON e1.departmentID = d.id
where 3 > (
    select COUNT(DISTINCT (e2.Salary))
    from Employee e2
    where e2.Salary > e1.salary AND e1.DepartmentId = e2.DepartmentId
)