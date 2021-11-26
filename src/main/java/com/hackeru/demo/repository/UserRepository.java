package com.hackeru.demo.repository;

import com.hackeru.demo.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Copyright: Copyright (c) 2021 Asiainfo
 *
 * @className: com.hackeru.demo.dao.UserRepository
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
public interface UserRepository extends JpaRepository<User, Long> {
}
