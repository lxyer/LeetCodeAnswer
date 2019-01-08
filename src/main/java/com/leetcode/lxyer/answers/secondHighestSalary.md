### [176\. Second Highest Salary](https://leetcode.com/problems/second-highest-salary/description/)

Difficulty: **Easy**



Write a SQL query to get the second highest salary from the `Employee` table.

```
+----+--------+
| Id | Salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
```

For example, given the above Employee table, the query should return `200` as the second highest salary. If there is no second highest salary, then the query should return `null`.

```
+---------------------+
| SecondHighestSalary |
+---------------------+
| 200                 |
+---------------------+
```



#### Solution

Language: **MySQL**

```mysql
# Write your MySQL query statement below
select (select distinct salary from Employee order by salary desc limit 1,1) as SecondHighestSalary ;
```
