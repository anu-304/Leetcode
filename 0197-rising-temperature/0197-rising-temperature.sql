# Write your MySQL query statement below
SELECT w1.id
FROM weather w1 join weather w2 
ON DATEDIFF(w1.recorddate, w2.recorddate) = 1
WHERE w1.Temperature > w2.Temperature;