-- # Write your MySQL query statement below
-- SELECT unique_id, name FROM EmployeeUNI;
-- WHERE id
SELECT eu.unique_id, e.name
FROM Employees e
LEFT JOIN EmployeeUNI eu
ON e.id = eu.id