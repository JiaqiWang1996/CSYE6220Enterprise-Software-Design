/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5.dao;

import com.mycompany.lab5.pojo.Message;
import java.sql.Connection;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 *
 * @author dedhi
 */
//Contains CRUD operations of Message Model
public class MessageDAO {
    public List<Message> getMessages(){
        Connection connection = null;
        List<Message> result = null;
        try {
            //creates an object of DAO class and gets the connection to database
            DAO dbdao = new DAO();
            connection = dbdao.getConnection();
            //creates an object of QueryRunner class
            QueryRunner queryRunner = new QueryRunner();
            //creates an object of result handler which would be a List of Message object
            ResultSetHandler<List<Message>> h = new BeanListHandler<Message>(Message.class);
            String query = "SELECT * FROM messages";
            //Runs the query on database and returns the result
            result = queryRunner.query(connection, query, h);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return result;
    }
    
    public Message getMessage(int messageId){
        Connection connection = null;
        List<Message> result = null;
        try {
            DAO dbdao = new DAO();
            connection = dbdao.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            ResultSetHandler<List<Message>> h = new BeanListHandler<Message>(Message.class);
            String query = "SELECT * FROM messages where messageId = ?";
            result = queryRunner.query(connection, query, h, messageId);
            System.out.println(result.get(0));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return result.get(0);
    }
    
    public int addMessage(String from, String message, String date) {
        Connection connection = null;
        int result = 0;
        try {
            DAO dbdao = new DAO();
            connection = dbdao.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            String query = "INSERT INTO messages (fromUser, message, messageDate) VALUES (?,?,?)";
            result = queryRunner.update(connection, query, from, message, date);
            result = 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return result;
    }
    
    public int updateMessage(String from, String message, String date, int messageId) {
        Connection connection = null;
        int result = 0;
        try {
            DAO dbdao = new DAO();
            connection = dbdao.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            String query = "UPDATE messages SET fromUser = ?, message = ?, messageDate = ? where messageId = ?";
            result = queryRunner.update(connection, query, from, message, date, messageId);
            result = 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return result;
    }
    
    public int deleteMessage(int messageId) {
        Connection connection = null;
        int result = 0;
        try {
            DAO dbdao = new DAO();
            connection = dbdao.getConnection();
            QueryRunner queryRunner = new QueryRunner();
            String query = "DELETE FROM messages where messageId = ?";
            result = queryRunner.update(connection, query, messageId);
            result = 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return result;
    }
    
}
