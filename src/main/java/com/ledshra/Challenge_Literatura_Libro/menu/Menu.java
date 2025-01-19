package com.ledshra.Challenge_Literatura_Libro.menu;

public class Menu {
    private String menu = """
    1-Buscar libro
    2-Mostrar libros guardados
    3-Mostrar autores guardados
    4-Mostrar autores vivos en un periodo de año
    5-Mostrar libros por idioma
    0-Salir
    
    Elija una opción: """;
    private String bienvenida = "*********************";

    public String getMenu() {
        return menu;
    }

    public String getBienvenida() {
        return bienvenida;
    }
}