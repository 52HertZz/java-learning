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


# 2023 年 02 月 08 日
1. 部分配置信息修改

# 2023 年 02 月 09 日
> mybatis 一对一、一对多验证
1. 新建员工表
```sql
-- mybatis_learning.t_employee definition

CREATE TABLE `t_employee` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `real_name` varchar(60) NOT NULL,
  `sex` int(2) NOT NULL COMMENT '1 - 男 0 - 女',
  `birthday` date NOT NULL,
  `mobile` varchar(20) NOT NULL,
  `email` varchar(60) NOT NULL,
  `position_` varchar(60) NOT NULL,
  `note` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```

2. 新建员工任务表
```sql
-- mybatis_learning.t_employee_task definition

CREATE TABLE `t_employee_task` (
  `id` int(12) NOT NULL,
  `emp_id` int(12) NOT NULL,
  `task_id` int(12) NOT NULL,
  `task_name` varchar(60) NOT NULL,
  `note` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```

3. 新建女性员工健康表
```sql
-- mybatis_learning.t_female_health_form definition

CREATE TABLE `t_female_health_form` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `emp_id` int(12) NOT NULL,
  `heart` varchar(64) NOT NULL,
  `liver` varchar(64) NOT NULL,
  `spleen` varchar(64) NOT NULL,
  `lung` varchar(64) NOT NULL,
  `kidney` varchar(64) NOT NULL,
  `uterus` varchar(64) NOT NULL,
  `note` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```

4. 新建男性员工健康表
```sql
-- mybatis_learning.t_male_health_form definition

CREATE TABLE `t_male_health_form` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `emp_id` int(12) NOT NULL,
  `heart` varchar(64) NOT NULL,
  `liver` varchar(64) NOT NULL,
  `spleen` varchar(64) NOT NULL,
  `lung` varchar(64) NOT NULL,
  `kidney` varchar(64) NOT NULL,
  `prostate` varchar(64) NOT NULL,
  `note` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```


5. 新建任务表
```sql
-- mybatis_learning.t_task definition

CREATE TABLE `t_task` (
  `id` int(12) NOT NULL,
  `title` varchar(60) NOT NULL,
  `context` varchar(256) NOT NULL,
  `note` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```

6. 新建工牌表
```sql
-- mybatis_learning.t_word_card definition

CREATE TABLE `t_word_card` (
  `id` int(12) NOT NULL,
  `emp_id` int(12) NOT NULL,
  `real_name` varchar(60) NOT NULL,
  `department` varchar(20) NOT NULL,
  `mobile` varchar(20) NOT NULL,
  `position_` varchar(30) NOT NULL,
  `note` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```