# 2023 年 02 月 04 日
1. mybatis 工具类 SqlSessionFactoryUtils 获取 SqlSession 优化
2. mybatis 连接数据库测试
```sql
-- mybatis_learning.`role` definition

CREATE TABLE `role` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `roleName` varchar(30) DEFAULT NULL COMMENT '角色名',
  `note` varchar(20) DEFAULT NULL COMMENT '说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
```