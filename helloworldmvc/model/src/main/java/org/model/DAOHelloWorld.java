package org.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOHelloWorld {
	
	private static String INSTANCE;
	private static String LOGIN = "root";
	private static String PASSWORD = "";
	private static String URL = "jdbc:mysql://localhost/helloworldmvc?autoReconnect=true&useSSL=false";
	private Connection connection;
	private Statement statement;
	private ResultSet resultset;
	
	public DAOHelloWorld(){
		this.connection = null;
		this.statement = null;
	}
	
	public static DAOHelloWorld getInstance(){
		return null;
	}
	
	public static String getQuerySelectFirstHelloWorld(){
		return "SELECT * FROM `helloworld`";
	}
	
	protected boolean open(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = (Connection) DriverManager.getConnection(DAOHelloWorld.URL,
			DAOHelloWorld.LOGIN, DAOHelloWorld.PASSWORD);
			this.statement = (Statement) this.connection.createStatement();
			System.out.println("blavla");
		}catch (final ClassNotFoundException e){
			e.printStackTrace();
			return false;
		}catch (final SQLException e){
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public boolean close(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			this.connection =  (Connection) DriverManager.getConnection(DAOHelloWorld.URL, DAOHelloWorld.LOGIN, DAOHelloWorld.PASSWORD);
			this.statement = (Statement) (((java.sql.Connection) this.connection).createStatement());
			System.out.println("kdsdgjsd");
		}catch (final ClassNotFoundException e){
			e.printStackTrace();
			return false;
		}catch (final SQLException e){
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	private ResultSet executeQuery(String query){
		try{
			return this.statement.executeQuery(query);
		}catch (SQLException e){
			e.printStackTrace();
		}
		return resultset;
	}

}
