/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tjnk1
 */
public class DBConnect {
     static String cn = "jdbc:sqlserver://DESKTOP-HRMC28G:1433;databaseName=QuanLyQuanCF;user=sa;password=123;integratedSecurity=false;encrypt=true;trustServerCertificate=true;";

	public static Connection getConnection() throws SQLException
	{
			return DriverManager.getConnection(cn);
	}
}
