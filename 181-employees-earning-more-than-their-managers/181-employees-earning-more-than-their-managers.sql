# Write your MySQL query statement below
SELECT e.name AS employee
FROM Employee AS e, Employee AS m
WHERE e.managerId = m.id AND e.salary > m.salary
