/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplocuantificadores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Piruxb17
 */
public class EjemploCuantificadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto = "Esta atmmmatates una cadena con aa letras aaa y aaaa.";
        String patron = "atm{3,}"; // Buscar tres o más "a" consecutivas
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println("Coincidencia encontrada: " + matcher.group());
        }

    }
}
