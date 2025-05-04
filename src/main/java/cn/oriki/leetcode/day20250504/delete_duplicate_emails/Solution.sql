-- 196. 删除重复的电子邮箱
-- https://leetcode.cn/problems/delete-duplicate-emails/
delete from Person where id not in (select id from (select min(id) id from Person group by email) p)