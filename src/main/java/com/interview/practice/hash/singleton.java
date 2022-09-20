package com.interview.practice.hash;


import java.util.Date;

public class singleton {

    public static void main(String[] args) {
        singleton1 x = new singleton1();
        //System.out.println(x.getDateObject());
        System.out.println(x.getDateObject().hashCode());
        System.out.println(x.getDateObject().hashCode());
        System.out.println(x.getDateObject().hashCode());
        System.out.println(x.getDateObject().hashCode());
        System.out.println(x.getDateObject().hashCode());
        System.out.println(x.getDateObject().hashCode());
    }

}
 class singleton1 {

    private final static Date date = new Date(System.currentTimeMillis());

    public Date getDateObject(){
        //return new Date(System.currentTimeMillis());
        return  date;
    }
}
