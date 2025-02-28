package com.movieBuzz;

public class mahesh extends Thread {
    public void run() {
        String[] movies = {
            "Rajakumarudu", "Khadgam", "Takkari Donga", "Okkadu", "Athadu", "Pokiri", "Dookudu", 
            "Businessman", "Seethamma Vakitlo Sirimalle Chettu", "1: Nenokkadine", "Srimanthudu", 
            "Brahmotsavam", "Spyder", "Bharat Ane Nenu", "Maharshi", "Sarileru Neekevvaru", "Sarkaru Vaari Paata"
        };

        for (int i = 0; i < movies.length; i++) {
            System.out.println("Mahesh Babu Movie " + (i + 1) + ": " + movies[i]);
        }
    }

    
}
