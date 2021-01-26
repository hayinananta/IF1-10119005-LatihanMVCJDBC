/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hayinananta.latihanmvcjdbc.main;

import hayinananta.latihanmvcjdbc.database.KingsBarbershopDatabase;
import java.sql.SQLException;
import java.util.List;
import hayinananta.latihanmvcjdbc.entity.Pelanggan;
import hayinananta.latihanmvcjdbc.error.PelangganException;
import hayinananta.latihanmvcjdbc.service.PelangganDao;
import javax.swing.SwingUtilities;
import hayinananta.latihanmvcjdbc.view.MainViewPelanggan;
import java.util.logging.Logger;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
//                    Logger.getLogger(LatihanMVCJDBC.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }
}