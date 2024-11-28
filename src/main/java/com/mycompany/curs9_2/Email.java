
package com.mycompany.curs9_2;

public class Email {
    private AdresaEmail expeditor;
    private AdresaEmail destinatar;
    private String subiect;
    private String continut;

    public Email(AdresaEmail expeditor, AdresaEmail destinatar, String subiect, String continut) {
        this.expeditor = expeditor;
        this.destinatar = destinatar;
        this.subiect = subiect;
        this.continut = continut;
    }

    public void trimite() {
        System.out.println("Email trimis!");
        System.out.println("De la: " + expeditor.getAdresa());
        System.out.println("Către: " + destinatar.getAdresa());
        System.out.println("Subiect: " + subiect);
        System.out.println("Conținut: " + continut);
    }

    public void primeste() {
        System.out.println("Email primit!");
        System.out.println("De la: " + expeditor.getAdresa());
        System.out.println("Subiect: " + subiect);
        System.out.println("Conținut: " + continut);
    }
}
