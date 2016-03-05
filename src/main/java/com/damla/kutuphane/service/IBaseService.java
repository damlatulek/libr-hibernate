/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.damla.kutuphane.service;

import com.damla.kutuphane.framework.DBException;
import java.util.List;

public interface IBaseService<T> {

    public List<T> getAll();

    public T getbyId(Long id);

    public T save(T Obj)throws DBException;

    public Boolean delete(T Obj)throws DBException;

    public T Update(T Obj)throws DBException;
}
