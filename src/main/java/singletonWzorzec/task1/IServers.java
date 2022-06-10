package singletonWzorzec.task1;

//Stwórz singleton Servers typu lazy. Singleton ten przechowuje listę serwerów (jako String).
// Zaimplementuj następujące funkcjonalności:
//
//        dodanie serwera do listy

//        metoda dodająca serwer do listy powinna zwracać boolean
//        (true jeżeli serwer został dodany do listy, false w przeciwnym wypadku)

//        dodanie jest możliwe, jeżeli jego nazwa zaczyna się od http lub https

//        dodanie zduplikowanej nazwy jest niemożliwe

//        pobranie listy serwerów, których nazwa zaczyna się od http

//        pobranie listy serwerów, których nazwa zaczyna się od https


import java.util.List;

public interface IServers {

     boolean addServer(String server);
     List<String> getHttpServers();
     List<String> getServersStartingWith(final String prefix);
     List<String> getHttpsServers();

}
