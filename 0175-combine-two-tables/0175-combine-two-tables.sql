# Write your MySQL query statement below
select p.firstName, p.lastName, A.city, A.state 
from Person P left outer join Address A
on P.personId=A.personId;