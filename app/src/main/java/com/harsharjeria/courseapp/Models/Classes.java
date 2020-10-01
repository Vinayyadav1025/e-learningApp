package com.harsharjeria.courseapp.Models;
import java.util.Scanner;
public class Classes {

 public class(int idclass, String nameclass, String imageclasslink) {
        this.idclass = idclass;
        this.nameclass = nameclass;
        this.imageclasslink = imageclasslink;
    }

    public int getIdclass() {
        return idclass;
    }

    public void setIdclass(int idclass) {
        this.idclass = idclass;
    }

    public String getNameclass() {
        return nameclass;
    }

    public void setNameclass(String nameclass) {
        this.nameclass = nameclass;
    }

    public String getImageclasslink() {
        return imageclasslink;
    }

    public void setImageclasslink(String imageclasslink) {
        this.imageclasslink = imageclasslink;
    }
    public static void main(String [] args){
        Classes c=new Classes();
    Scanner sc=new Scanner(System.in);
      int idclass = sc.nextInt();
      String nameclass = sc.next();
      String imageclasslink=  sc.next();
        c.class(idclass,nameclass,imageclasslink);
    }
}
