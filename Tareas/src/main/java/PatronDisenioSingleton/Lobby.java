package PatronDisenioSingleton;

public class Lobby {
    public void mostrarLobby() {
        ConfiguracionGlobal config = ConfiguracionGlobal.getInstancia();

        System.out.println("[Lobby] Mostrando configuraciones:");
        config.mostrarConfiguraciones();
    }
}
