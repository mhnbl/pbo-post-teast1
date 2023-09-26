/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

import java.util.ArrayList;

/**
 *
 * @author ACER TRAVELMATE
 */
public class Posttest1 {

    public static void main(String[] args) {
        //ArrayList untuk menyimpan objek Film
        ArrayList<Film> films = new ArrayList<>();

        //Menambah objek Film ke dalam ArrayList
        films.add(new Film("DUNE", "Denis Villeneuve"));
        films.add(new Film("Inception", "Christopher Nolan"));
        films.add(new Film("Pulp Fiction", "Quentin Tarantino"));
        films.add(new Film("Fargo", "Joel & Ethan Cohen"));
        films.add(new Film("Goodfellas", "Martin Scorsese"));

        //Perulangan untuk menampilkan informasi tentang setiap film
        for (Film film : films) {
            System.out.println("Film berjudul '" + film.title + "' disutradarai oleh " + film.director + ".");
        }
    }
    
}
