/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */

/**
 * Nama : Firda Aulia Rakhmah
 * Nim : 21090119
 * Kelas :3c
 */

public class computerManager extends JFrame implements CRUD, Search{
    private computer cm;

    @Override
    public void createData(computer cm) {
        this.cm = cm;
    }

    @Override
    public void readData() {
    }

    @Override
    public void updateData(computer cm) {
        this.cm = cm;
    }

    @Override
    public void deleteData(int comid) {
    }

    @Override
    public computer searchById(int compid) {
        return null;
    }

    @Override
    public computer searchBtBrand(String brand) {
        return null;
    }
}
