package com.damla.kutuphane;

import com.damla.kutuphane.entity.Kisi;
import com.damla.kutuphane.framework.DBException;
import com.damla.kutuphane.service.KisiService;
import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            System.out.println( "Hello World!" );
            
            KisiService ks = new KisiService();
            ks.save(new Kisi());
        } catch (DBException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
