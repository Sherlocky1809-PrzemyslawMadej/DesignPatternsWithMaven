package singletonWzorzec.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Servers implements IServers {

    private static Servers instance;

    public static Servers getInstance() {
        if (instance == null) {
            instance = new Servers();
        }
        return instance;
    }

    private final List<String> servers;

    private Servers() {
        servers = new ArrayList<>();
    }

    @Override
    public boolean addServer(String server) {
        if(server.startsWith("http") && server.startsWith("https") && !servers.contains(server)) {
            return servers.add(server);
        }
        return false;
    }

    @Override
    public List<String> getHttpServers() {
        return servers.stream()
                .filter(server -> server.startsWith("http"))
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public List<String> getServersStartingWith(final String prefix) {
        return servers.stream()
                .filter(server -> server.startsWith(prefix))
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public List<String> getHttpsServers() {
        return servers.stream()
                .filter(server -> server.startsWith("https"))
                .collect(Collectors.toUnmodifiableList());
    }
}
