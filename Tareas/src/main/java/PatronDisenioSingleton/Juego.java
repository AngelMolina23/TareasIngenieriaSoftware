package PatronDisenioSingleton;

public class Juego {
    public void iniciar() {
        ConfiguracionGlobal config = ConfiguracionGlobal.getInstancia();

        System.out.println("[Juego] Configuraciones actuales:");
        config.mostrarConfiguraciones();

        // Modificamos configuración desde el juego
        System.out.println("[Juego] Cambiando configuración...");
        config.setVolumen(75);
        config.setModoOscuro(true);
    }
}
