package cn.itcast.dao.impl;

import cn.itcast.domain.Account;
import cn.itcast.utils.BeanHandlerImpl;
import cn.itcast.utils.JdbcUtils;

/**
 * Created by yvettee on 2017/9/30.
 */
public class AccountDaoImpl implements AccountDao {

    @Override
    public void add(Account account) {
        String sql = "insert into account(name,money) values(?,?)";
        Object params[] = {account.getName(), account.getMoney()};
        JdbcUtils.update(sql, params);
    }

    @Override
    public void delete(int id) {
        String sql = "delete from account where id=?";
        Object params[] = {id};
        JdbcUtils.update(sql, params);
    }

    @Override
    public void update(Account account) {
        String sql = "update account set name=?,money=? where id=?";
        Object params[] = {account.getName(), account.getMoney(), account.getId()};
        JdbcUtils.update(sql, params);
    }

    @Override
    public Account find(int id) {
        String sql = "select * from account where id=?";
        Object params[] = {id};
        return (Account)JdbcUtils.query(sql,params,new BeanHandlerImpl(Account.class));
    }
}
