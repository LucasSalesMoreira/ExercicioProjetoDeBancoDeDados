package controller;

import controller.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Address;
import model.Client;

/**
 *
 * @author lucas
 */

public class Recorder {
    
    private Client client;
    private Address address;
    
    public Recorder(Client client) {
        this.client = client;
    }
    
    public Recorder(Address address) {
        this.address = address;
    }
    
    public boolean createClientRegister() {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.connect();
            PreparedStatement stm = conn.prepareStatement("insert into cliente "
                    + "(nome, email) values (?, ?)");
            stm.setString(1, client.getName());
            stm.setString(2, client.getEmail());
            stm.executeUpdate();
            factory.finish(conn, stm);
            return true;
        } catch(SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean deleteClientRegister() {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.connect();
            PreparedStatement stm = conn.prepareStatement("delete from cliente "
                    + "where id_cliente = ?");
            stm.setInt(1, client.getId());
            stm.executeUpdate();
            factory.finish(conn, stm);
            return true;
        } catch(SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean updateClientRegister() {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.connect();
            PreparedStatement stm = conn.prepareStatement("update cliente set nome = ?, email = ? where id_cliente = ?");
            stm.setString(1, client.getName());
            stm.setString(2, client.getEmail());
            stm.setInt(3, client.getId());
            stm.executeUpdate();
            factory.finish(conn, stm);
            return true;
        } catch(SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean createAddressRegister() {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.connect();
            PreparedStatement stm = conn.prepareStatement("insert into endereco "
                    + "(logradouro, numero, cidade, estado, id_cliente) "
                    + "values (?, ?, ?, ?, ?)");
            stm.setString(1, address.getPublicPlace());
            stm.setInt(2, address.getNumber());
            stm.setString(3, address.getCity());
            stm.setString(4, address.getState());
            stm.setInt(5, address.getId_client());
            stm.executeUpdate();
            factory.finish(conn, stm);
            return true;
        } catch(SQLException e) {
            System.out.println(e);
            return false;
        }
    }
}
