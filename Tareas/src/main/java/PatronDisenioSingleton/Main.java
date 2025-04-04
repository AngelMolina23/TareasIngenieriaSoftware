package PatronDisenioSingleton;

public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();
        Lobby lobby = new Lobby();

        // Juego modifica la configuración
        juego.iniciar();

        // Lobby accede a la misma configuración modificada
        lobby.mostrarLobby();
    }
}
