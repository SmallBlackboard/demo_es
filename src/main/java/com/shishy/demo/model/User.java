package com.shishy.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name = "USER_INFO")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String name;
    private Date birthday;
    private String password;
    private Timestamp createTime;
    private Timestamp updateTime;
}
