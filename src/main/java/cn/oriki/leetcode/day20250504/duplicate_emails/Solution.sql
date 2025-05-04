-- 182. 查找重复的电子邮箱
-- https://leetcode.cn/problems/duplicate-emails/
-- TO SNIP
select Email from
(
  select Email, count(Email) as num
  from Person
  group by Email
) as t
where num > 1;
