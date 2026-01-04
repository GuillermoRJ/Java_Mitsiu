class U1E2 {
    public static void main(String[] args) {
        Movie recommendation = new Movie();
        recommendation.title = "The Internet's Own Boy";
        recommendation.releaseYear = 2014;
        recommendation.cast = new Person[3];

        Person aaron = new Person();
        aaron.name = "Aaron Swartz";
        aaron.birthYear = 1986;
        recommendation.cast[0] = aaron;
    }
}

class Movie {
    String title;
    short releaseYear;
    Person[] cast;
}

class Person {
    String name;
    short birthYear;
}

class Theatre {
    String location;
    short numEmployees;
}
