package cn.itcast.dao.impl;

import cn.itcast.domain.Account;

/**
 * Created by yvettee on 2017/10/1.
 */
public interface AccountDao {
    void add(Account account);

    void delete(int id);

    void update(Account account);

    Account find(int id);
}
