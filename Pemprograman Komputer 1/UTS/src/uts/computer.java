/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

/**
 *
 * @author Lenovo
 */

/**
 * Nama : Firda Aulia Rakhmah
 * Nim : 21090119
 * Kelas :3c
 */

public class computer {
   private int compid;
   private String brand;
   private String model;
   private String disk;
   private int ram;
   private String gpu;
   private String cpu;
   private int yRelease;
   
   //enkapsulation pada atribut

    public int getCompid() {
        return compid;
    }

    public void setCompid(int compid) {
        this.compid = compid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getyRelease() {
        return yRelease;
    }

    public void setyRelease(int yRelease) {
        this.yRelease = yRelease;
    }
    
    //Buatlah 3 konstruktor pada kelas computer
    public computer(){
           computer om = new computer();
    }
    
    public computer(int compid,String brand,String model,String disk,int ram,String gpu,String cpu,int yRelease){}
    

    public computer(int compid){}

}
