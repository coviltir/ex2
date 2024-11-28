
package com.mycompany.curs9_2;
public class Main {
    public static void main(String[] args) {
        AdresaEmail expeditor = new AdresaEmail("expeditor@example.com");
        AdresaEmail destinatar = new AdresaEmail("destinatar@example.com");

        Email email = new Email(expeditor, destinatar, "Salut!", "Salut!");
        email.trimite();
        email.primeste();
    }
}

