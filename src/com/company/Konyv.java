package com.company;

public class Konyv {
    private String cim;
    private String szerzo;
    private String kiado;
    private int kiadDatum;
    private String isbn;

    public String getCim() {
        return cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getKiado() {
        return kiado;
    }

    public int getKiadDatum() {
        return kiadDatum;
    }

    public String getIsbn() {
        return isbn;
    }
    private boolean kolcson;
    private String kinekadtam;

    public void setKolcson(boolean kolcson){
        this.kolcson=kolcson;
    }
    public void setKinekadtam (String kinekadtam){
        this.kinekadtam=kinekadtam;
    }

    public String toString(){
        return "Cím:"+ this.cim+"\n Szerző:"+this.szerzo+"\n Kiadó:"+this.kiado;
    }
    public Konyv(String cim, String szerzo, String kiado, int kiadDatum, String isbn) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.kiado = kiado;
        this.kiadDatum = kiadDatum;
        this.isbn = isbn;

        this .kolcson=false;
        this.kinekadtam = kinekadtam;
    }

	public boolean isKolcson() {
		return false;
	}
}
