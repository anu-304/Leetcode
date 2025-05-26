# Write your MySQL query statement below
select MAX(distinct salary)as SecondHighestSalary 
from Employee
WHERE salary <(select MAX(distinct salary) from Employee);