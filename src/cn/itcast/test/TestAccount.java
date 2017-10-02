package cn.itcast.test;

import cn.itcast.dao.impl.AccountDao;
import cn.itcast.dao.impl.AccountDaoImpl;
import cn.itcast.domain.Account;
import org.junit.Test;

/**
 * Created by yvettee on 2017/10/1.
 */
public class TestAccount {
    @Test
    public void testAdd() {
        Account a = new Account();
        a.setName("车村");
        a.setMoney(100.23);
        AccountDao dao = new AccountDaoImpl();
        dao.add(a);
        System.out.println(a);
    }

    @Test
    public void testDelete() {
        AccountDao dao = new AccountDaoImpl();
        dao.delete(10);
    }

    @Test
    public void testUpdate() {
        Account a = new Account();
        a.setName("车村");
        a.setMoney(100.23);
        a.setId(1);
        AccountDao dao = new AccountDaoImpl();
        dao.update(a);
    }

    @Test
    public void testQuery() {
        AccountDao dao = new AccountDaoImpl();
        dao.find(1);
        System.out.println(dao.find(1));
    }

}
