package br.com.fiapride.model;

public class LustreComVentilador {

    // Atributos
    public String estrutura;
    public String tamanho;
    public String material;

    // Métodos (ações)
    public void clarearAmbiente() {
        System.out.println("O lustre está clareando o ambiente.");
    }

    public void ventilarAmbiente() {
        System.out.println("O ventilador está ventilando o ambiente.");
    }
}