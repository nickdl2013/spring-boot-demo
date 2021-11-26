package com.hackeru.demo.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;


/**
 * Copyright: Copyright (c) 2021 Asiainfo
 *
 * @className: com.hackeru.demo.bean.User
 * @description:
 * @version: v1.0.0
 * @author: liangyl
 * @date: 2021/11/24
 * <p>
 * Modification History:
 * Date         Author         Version          Description
 * -----------------------------------------------------------------------*
 * 2021/11/24		liangyl        v1.0.0		    创建
 */
@Entity
@Data
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
