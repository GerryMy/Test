package com.hr.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
	protected static Connection conn;
	protected PreparedStatement pstat;
	protected ResultSet rs;

	public static void main(String[] args) {
		System.out.println(getconConnection());
	}

	// 获取属性文件内容
	private static String username;
	private static String password;
	private static String url;
	private static String driver;
	static {
		Properties prop = new Properties();
		try {
			prop.load(DBUtils.class.getClassLoader().getResourceAsStream(
					"db.properties"));
			username = (String) prop.get("jdbc.username");
			password = (String) prop.get("jdbc.password");
			url = (String) prop.get("jdbc.url");
			driver = (String) prop.get("jdbc.driver");

			/*
			 * System.out.println(username + "," + url + "," + driver + "," +
			 * password);
			 */

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 四个方法
	// 1.连接
	public static Connection getconConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("连接成功");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 2.增删改的方法
	public int update(String sql, Object... args) {
		int count = 0;
		try {
			pstat = conn.prepareStatement(sql);
			if (args != null && args.length > 0) {
				for (int i = 0; i < args.length; i++) {
					pstat.setObject(i + 1, args[i]);
				}
			}
			System.out.println(pstat);// 输出完整的sql
			// 提交
			count = pstat.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	// 查询的方法
	public ResultSet query(String sql, Object... args) {
		try {
			pstat = conn.prepareStatement(sql);
			// 为问号赋值
			if (args != null && args.length > 0) {
				for (int i = 0; i < args.length; i++) {
					pstat.setObject(i + 1, args[i]);
				}
			}
			System.out.println(pstat);// 输出完整的sql
			// 提交
			rs = pstat.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	public void closeAll(Connection conn, PreparedStatement pstat, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (pstat != null) {
				pstat.close();
				pstat = null;
			}
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
