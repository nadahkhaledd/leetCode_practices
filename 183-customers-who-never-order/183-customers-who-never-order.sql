# Write your MySQL query statement below
SELECT c.name AS Customers
FROM Customers AS c
WHERE c.id not in (SELECT customerId FROM Orders)


