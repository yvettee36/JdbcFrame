package cn.itcast.utils;

import java.sql.*;

/**
 * Created by yvettee on 2017/9/30.
 */
public class JdbcUtils {

    //add update delete
    // sql="insert into account(id,name,money) values(?,?,?) Object[]{1,"a",100}"
    public static void update(String sql, Object params[]) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils_DBCP.getConnection();
            ps = conn.prepareStatement(sql);
            //Object params[]替换sql里面的参数
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils_DBCP.release(conn, ps, rs);
        }
    }

    //查找的优化是最难的
    public static Object query(String sql, Object params[], ResultSetHandler handler) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils_DBCP.getConnection();
            ps = conn.prepareStatement(sql);
            //Object params[]替换sql里面的参数
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            //不知道sql语句是怎样的，也就不知道怎么处理rs，但是用户知道怎么处理
            rs = ps.executeQuery();
            return handler.handler(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils_DBCP.release(conn, ps, rs);
        }
        return null;
    }
}
