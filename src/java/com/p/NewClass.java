/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.p;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.servlet.http.Part;

public class NewClass {
    public static void main(String[] args) throws IOException { 
        
        String h1="22:35:0";
        String h2="12:31:0";
        long an=0;
        long m=0;
        long j=0;
        Date d=Date.valueOf("2022-04-8");
        
        LocalDate n0 = LocalDate.now();
        Date n=Date.valueOf(n0);
        if(n.toLocalDate().getYear()<=d.toLocalDate().getYear()){
            an=d.toLocalDate().getYear()-n.toLocalDate().getYear();
            if(n.toLocalDate().getMonthValue()<=d.toLocalDate().getMonthValue()){
                m=d.toLocalDate().getMonthValue()-n.toLocalDate().getMonthValue();
                if(n.toLocalDate().getDayOfMonth()<=d.toLocalDate().getDayOfMonth()){
                    j=d.toLocalDate().getDayOfMonth()-n.toLocalDate().getDayOfMonth();
                }
                else{
                    j=n.toLocalDate().getDayOfMonth()-d.toLocalDate().getDayOfMonth();
                }
            }
            else{
                m=n.toLocalDate().getMonthValue()-d.toLocalDate().getMonthValue();
            }           
        }
        else{
            an=n.toLocalDate().getYear()-d.toLocalDate().getYear();
            if(n.toLocalDate().getMonthValue()<=d.toLocalDate().getMonthValue()){
                m=d.toLocalDate().getMonthValue()-n.toLocalDate().getMonthValue();
                if(n.toLocalDate().getDayOfMonth()<=d.toLocalDate().getDayOfMonth()){
                    j=d.toLocalDate().getDayOfMonth()-n.toLocalDate().getDayOfMonth();
                }
                else{
                    j=n.toLocalDate().getDayOfMonth()-d.toLocalDate().getDayOfMonth();
                }
            }
            else{
                m=n.toLocalDate().getMonthValue()-d.toLocalDate().getMonthValue();
            }
        }
        
        
        System.out.println("a="+an+"  m="+m+"    j="+j);
        //if(Time.valueOf(h1).getTime()>Time.valueOf(h2).getTime()){
            //System.out.println(lt1.toEpochDay());
        //}
        
        
        
  } 
}
