/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author SCC-COLLEGE
 */
public class bankingClass {
    
    int accountNo = 10001;
    String name;
    float initialBalance = 1000;
    int pin = 1234;
    
    public boolean verifyAccount(int acc, int pn){
            if(acc == accountNo && pn == pin){
                return true;
            }else{
                return false;
            }
    }
    
}
