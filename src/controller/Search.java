package controller;

/**
 *
 * @author lucas
 */

import controller.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import view.AddressView;
import view.ControlPanel;

public class Search {
    
    public static void searchAllAddress() {
        ConnectionFactory factory = new ConnectionFactory();
        Connection conn = factory.connect();
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            stm = conn.prepareStatement("select c.nome, c.email, e.logradouro, "
                    + "e.numero, e.cidade, e.estado from "
                    + "cliente c inner join endereco e "
                    + "on c.id_cliente = e.id_cliente"); 
            rs = stm.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel) AddressView.myJTable.getModel();
            tableModel.setNumRows(0);
            
            while (rs.next()) { 
                tableModel.addRow(new String[] { 
                    rs.getString("nome"), 
                    rs.getString("email"),
                    rs.getString("logradouro"),
                    String.valueOf(rs.getInt("numero")),
                    rs.getString("cidade"),
                    rs.getString("estado")
                });
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            factory.finish(conn, stm , rs); 
        }
    }
    
    public static void searchAddressByCity(String city) {
        String sql = "select c.nome, c.email, e.logradouro, e.numero, e.cidade, e.estado "
                + "from cliente c inner join endereco e "
                + "on c.id_cliente = e.id_cliente "
                + "where e.cidade = ?";
        
        ConnectionFactory factory = new ConnectionFactory();
        Connection conn = factory.connect();
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            stm = conn.prepareStatement(sql); 
            stm.setString(1, city);
            rs = stm.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel) AddressView.myJTable.getModel();
            tableModel.setNumRows(0);
            
            while (rs.next()) { 
                tableModel.addRow(new String[] { 
                    rs.getString("nome"), 
                    rs.getString("email"),
                    rs.getString("logradouro"),
                    String.valueOf(rs.getInt("numero")),
                    rs.getString("cidade"),
                    rs.getString("estado")
                });
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            factory.finish(conn, stm , rs); 
        }
    }
    
    public static void searchAddressByState(String state) {
        String sql = "select c.nome, c.email, e.logradouro, e.numero, e.cidade, e.estado "
                + "from cliente c inner join endereco e "
                + "on c.id_cliente = e.id_cliente "
                + "where e.estado = ?";
        
        ConnectionFactory factory = new ConnectionFactory();
        Connection conn = factory.connect();
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            stm = conn.prepareStatement(sql); 
            stm.setString(1, state);
            rs = stm.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel) AddressView.myJTable.getModel();
            tableModel.setNumRows(0);
            
            while (rs.next()) { 
                tableModel.addRow(new String[] { 
                    rs.getString("nome"), 
                    rs.getString("email"),
                    rs.getString("logradouro"),
                    String.valueOf(rs.getInt("numero")),
                    rs.getString("cidade"),
                    rs.getString("estado")
                });
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            factory.finish(conn, stm , rs); 
        }
    }
    
    public static void searchAddressByCityAndState(String state, String city) {
        String sql = "select c.nome, c.email, e.logradouro, e.numero, e.cidade, e.estado "
                + "from cliente c inner join endereco e "
                + "on c.id_cliente = e.id_cliente "
                + "where e.estado = ? and e.cidade = ?";
        
        ConnectionFactory factory = new ConnectionFactory();
        Connection conn = factory.connect();
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            stm = conn.prepareStatement(sql); 
            stm.setString(1, state);
            stm.setString(2, city);
            rs = stm.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel) AddressView.myJTable.getModel();
            tableModel.setNumRows(0);
            
            while (rs.next()) { 
                tableModel.addRow(new String[] { 
                    rs.getString("nome"), 
                    rs.getString("email"),
                    rs.getString("logradouro"),
                    String.valueOf(rs.getInt("numero")),
                    rs.getString("cidade"),
                    rs.getString("estado")
                });
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            factory.finish(conn, stm , rs); 
        }
    }
    
    public static void searchAllClients() {
        ConnectionFactory factory = new ConnectionFactory();
        Connection conn = factory.connect();
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            stm = conn.prepareStatement("select * from cliente"); 
            rs = stm.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel) ControlPanel.myJTable.getModel();
            tableModel.setNumRows(0);
            
            while (rs.next()) { 
                tableModel.addRow(new String[] { 
                    String.valueOf(rs.getInt("id_cliente")), 
                    rs.getString("nome"), 
                    rs.getString("email")
                });
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            factory.finish(conn, stm , rs); 
        }
    }
}
