package com.damla.kutuphane;

import com.damla.kutuphane.entity.Kisi;
import com.damla.kutuphane.framework.DBException;
import com.damla.kutuphane.service.KisiService;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        KisiService ks = new KisiService();
        try {
            System.out.println("Hello World!");

            
            ks.save(new Kisi(Long.MIN_VALUE, "damla", "tülek", new Date(), "mersin", "damlatulek@gmail.com", false));
        } catch (DBException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        List<Kisi> kisiListe = ks.getAll();

        for (Kisi kisi : kisiListe) {
            System.out.println("sdfds");
        }
    }
}
