/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.damla.kutuphane.service;

import com.damla.kutuphane.entity.Kisi;
import com.damla.kutuphane.framework.DBException;
import java.util.List;

/**
 *
 * @author vektorel
 */
public class KisiService implements IBaseService<Kisi> {

    public List<Kisi> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Kisi getbyId(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Kisi save(Kisi Obj) throws DBException {
        if (Obj == null) {
            throw new DBException("nesne boş olmamalıdır");
        }
        if (Obj.getAd() == null) {
            throw new DBException("ad boş olmamalıdır");
        }
        if (Obj.getSoyad() == null) {
            throw new DBException("soyad boş olmamalıdır");
        }
        return (Kisi) new BaseService().save(Obj);
        


    }

    public Boolean delete(Kisi Obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Kisi Update(Kisi Obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
