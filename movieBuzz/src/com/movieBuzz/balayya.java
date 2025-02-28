package com.movieBuzz;

public class balayya extends Thread {
    public void run() {
        String[] movies = {
            "Samarasimha Reddy", "Narasimha Naidu", "Simha", "Legend", "Akhanda", "Gautamiputra Satakarni",
            "Lakshmi Narasimha", "Chennakesava Reddy", "Aditya 369", "Bhargava Ramudu",
            "Muddula Mogudu", "Rowdy Inspector", "Peddannayya", "Palnati Brahmanayudu", "Allari Pidugu",
            "Pandurangadu", "Ruler", "Veera Bhoga Vasantha Rayalu", "Jai Simha", "NBK 108"
        };

        for (int i = 0; i < movies.length; i++) {
            System.out.println("Balayya Movie " + (i + 1) + ": " + movies[i]);
        }
    }

    public static void main(String[] args) {
        balayya balayyaThread = new balayya();
        balayyaThread.start();
    }
}