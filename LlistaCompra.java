/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package llistacompra;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * V1.1
 */

public class LlistaCompra {

    public static void main(String[] args) {
        // Llista de la compra predefinida
        List<String> llista = new ArrayList<>();
        llista.add("Pa");
        llista.add("Llet");
        llista.add("Ous");
        llista.add("Formatge");
        llista.add("Tomàquets");
        llista.add("Arroz");

        // Mostrar la llista de la compra
        System.out.println("Llista de la compra:");
        for (String article : llista) {
            System.out.println("- " + article);
        }
    }
}
