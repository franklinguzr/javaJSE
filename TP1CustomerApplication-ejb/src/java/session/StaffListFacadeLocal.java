/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.StaffList;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FRANKLIN
 */
@Local
public interface StaffListFacadeLocal {

    void create(StaffList staffList);

    void edit(StaffList staffList);

    void remove(StaffList staffList);

    StaffList find(Object id);

    List<StaffList> findAll();

    List<StaffList> findRange(int[] range);

    int count();
    
}
