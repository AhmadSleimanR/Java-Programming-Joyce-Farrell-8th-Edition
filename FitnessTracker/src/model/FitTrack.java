/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Usuario
 */
public class FitTrack {
        private String fitActivity;
        private int numOfMin;
        private LocalDate date;


        public String getFitActivity(){
            return fitActivity;
        }

        public int getNumOfMin(){
            return numOfMin;
        }

        public LocalDate getDate() {
            return date;
        }

        public FitTrack(){
            this.fitActivity = "running";
            this.numOfMin = 0;
            this.date = LocalDate.now();
            this.date = LocalDate.of(date.getYear(),Month.JANUARY,1);
        }
        
        public FitTrack(String fitActivity, int numOfMin, LocalDate date){
            this.fitActivity = fitActivity;
            this.numOfMin = numOfMin;
            this.date = date;
        }
        
        
}
