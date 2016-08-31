/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp.tads.dsw.sisfin.DAO;

import br.edu.ifsp.tads.dsw.sisfin.model.Card;
import br.edu.ifsp.tads.dsw.sisfin.servlet.AddCard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class CardDAO {
    private String sql;
    private Connection conn;
    
    public CardDAO(){
        this.conn = new ConnectionFactory().getConnection();
    }
    public boolean add(Card clicard) {
        this.sql = "insert into CARD (Number,Validade) values (?,?)";
        try(PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1,clicard.getNumber());
            stmt.setString(2,clicard.getValidade());
            stmt.execute();
            conn.commit();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AddCard.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public List<Card> getList() {
        List<Card> clients = new ArrayList();
        this.sql = "SELECT * FROM CARD";
        try(PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Card cl = new Card(rs.getInt("number"),rs.getString("validade"));
                clients.add(cl);
            }
        } catch (SQLException ex) { 
            Logger.getLogger(CardDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clients;
    }
    
}
