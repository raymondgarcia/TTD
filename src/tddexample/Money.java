/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddexample;

/**
 *
 * @author vpvenezuela
 */
public class Money {

    protected int amount;
    protected String currency;

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money bolivar(int amount) {
        return new Bolivar(amount, "BS");
    }

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return this.amount == money.amount && getCurrency().equals(money.getCurrency());
    }
    
    
    
     String getCurrency() {
       return currency;
    }
     
    Money times(int multiplier) {
       return new Money(amount * multiplier, currency);
    }

    Object add(Money dollar) {
        return new Money(amount + dollar.amount, currency);
    }
     
}
