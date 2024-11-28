
package com.mycompany.curs9_2;

public class AdresaEmail {
    private String adresa;

    public AdresaEmail(String adresa) {
        this.adresa = adresa;
    }

    public String getAdresa() {
        return adresa;
    }

    public void afiseazaAdresa() {
        System.out.println(adresa);
    }
}
