package com.cqd.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tt_users")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;//员工id

    @Column(name = "login_name")
    private String loginName;//登录名

    @Column(name = "name")
    private String name;//名称

    @Column(name = "password")
    private String password;//密码

    @Column(name = "last_login_time")
    private String lastLoginTime;//最后登录时间

    @Column(name = "phone")
    private String phone;//电话

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;//地址

    @Column(name = "id_type")
    private String idType;//id类型

    @Column(name = "id_card")
    private String idCard;//身份证号

    @Column(name = "create_time")
    private String createTime;//创建时间

    @Column(name = "update_time")
    private String updateTime;//修改时间

    @Column(name = "admin")
    private Integer admin;//是否是管理员

    @Column(name = "status")
    private Integer status;//状态

    @Column(name = "del")
    private Integer del;//删除标识
}
