#创建表example
CREATE TABLE example(
`id` char(32) not null primary key comment '主键',
`name` varchar(40) not null comment '样例名称',
`description` varchar(255) default null comment '样例描述',
`create_user` varchar(20) default null comment '创建人',
`create_time` timestamp default current_timestamp comment '创建时间',
`update_user` varchar(20) default null comment '更新人',
`update_time` timestamp default current_timestamp on update current_timestamp comment '更新时间'
);

#测试插入语句
insert into
    example(id, name, description, create_user, update_user)
    value ('e23129c046494f639a70d2dd4ccdafaf','example','样例','admin','admin');
#测试更新语句
update example set name='example1' where id='e23129c046494f639a70d2dd4ccdafaf';