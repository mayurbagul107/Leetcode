# Write your MySQL query statement below

Select e1.name
From Employee e1
Inner Join Employee e2
ON e1.id = e2.managerId
Group BY e2.managerID
Having COUNT(e2.managerId) >= 5