package PatronDisenioSingleton;

public class ConfiguracionGlobal {
    private static ConfiguracionGlobal instancia;

    // Configuraciones globales del juego
    private int volumen;
    private String resolucion;
    private boolean modoOscuro;

    // Constructor privado para evitar múltiples instancias
    private ConfiguracionGlobal() {
        // Valores por defecto
        volumen = 50;
        resolucion = "1920x1080";
        modoOscuro = false;
    }

    // Método estático para obtener la única instancia
    public static ConfiguracionGlobal getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionGlobal();
        }
        return instancia;
    }

    // Métodos getter y setter
    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isModoOscuro() {
        return modoOscuro;
    }

    public void setModoOscuro(boolean modoOscuro) {
        this.modoOscuro = modoOscuro;
    }

    public void mostrarConfiguraciones() {
        System.out.println("----- CONFIGURACIONES -----");
        System.out.println("Volumen: " + volumen);
        System.out.println("Resolución: " + resolucion);
        System.out.println("Modo Oscuro: " + (modoOscuro ? "Activado" : "Desactivado"));
        System.out.println("---------------------------");
    }
}
