# Write your MySQL query statement below
SELECT distinct event_day AS day, emp_id,
sum(out_time - in_time) AS total_time
from Employees
group by emp_id, event_day;