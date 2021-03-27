package br.com.cjafet.strategy;

public class Strategy {

    public static void main(String[] args) {
        CreditCard amex = new CreditCard(new AmexStrategy());

        amex.setNumber("379185883464283");
        amex.setDate("04/2022");
        amex.setCvv("123");

        System.out.println("Is Amex valid: " + amex.isValid());


        CreditCard visa = new CreditCard(new VisaStrategy());
        visa.setNumber("4539589763663402");
        visa.setDate("05/2022");
        visa.setCvv("321");

        System.out.println("Is Visa valid: " + visa.isValid());


    }
}
