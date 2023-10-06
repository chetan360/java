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
    
    State(String continentName, String countryName, String stateName) {
        super(continentName, countryName);
        this.stateName = stateName;
    }

    public void printState() {
        System.out.println("State = " + stateName);
    }
}

class Asg3Aa {
    public static void main(String args[]) {
        State Maharashtra = new State("Asia" , "India", "Maharashtra");
        
        Maharashtra.printContinent();
        Maharashtra.printCountry();
        Maharashtra.printState();
    }
}