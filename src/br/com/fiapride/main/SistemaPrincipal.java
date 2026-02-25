package br.com.fiapride.main;

import br.com.fiapride.model.LustreComVentilador;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Criando objeto 1
        LustreComVentilador lustre1 = new LustreComVentilador();
        lustre1.estrutura = "Três hélices e lâmpada";
        lustre1.tamanho = "Diâmetro variável";
        lustre1.material = "Plástico";

        // Criando objeto 2
        LustreComVentilador lustre2 = new LustreComVentilador();
        lustre2.estrutura = "Quatro hélices e lâmpada";
        lustre2.tamanho = "Grande";
        lustre2.material = "Metal";

        // Exibindo dados
        System.out.println("---- Sistema Lustre ----");
        System.out.println("Material do lustre 1: " + lustre1.material);
        System.out.println("Tamanho do lustre 1: " + lustre1.tamanho);
        System.out.println("Material do lustre 2: " + lustre2.material);
        System.out.println("Tamanho do lustre 2: " + lustre2.tamanho);
        
        // Executando ações
        lustre1.clarearAmbiente();
        lustre1.ventilarAmbiente();
    }
}