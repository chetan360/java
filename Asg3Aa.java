/*
a) Write a program for multilevel inheritance such that country is inherited from
continent. State is inherited from country. Display the place, state, country
and continent.
        Continent
            |   
           \|/
         Country
            |   
           \|/
          State

*/

class Continent {
    String continentName;
    Continent(String continentName) {
        this.continentName = continentName;
    }
    
    public void printContinent() {
        System.out.println("Continent = " + continentName);
    }
}

class Country extends Continent {
    String countryName;
    Country(String continentName, String countryName) {
        super(continentName);
        this.countryName = countryName;
    }

    public void printCountry() {
        System.out.println("Country = " + countryName);
    }
}

class State extends Country {
    String stateName;
    String place;
    
    State(String continentName, String countryName, String stateName, String place) {
        super(continentName, countryName);
        this.stateName = stateName;
        this.place = place;
    }

    public void printState() {
        System.out.println("State = " + stateName);
        System.out.println("Place = " + place);
    }
}

class Asg3Aa {
    public static void main(String args[]) {
        State Maharashtra = new State("Asia" , "India", "Maharashtra", "Dabhadi");
        
        Maharashtra.printContinent();
        Maharashtra.printCountry();
        Maharashtra.printState();
    }
}
