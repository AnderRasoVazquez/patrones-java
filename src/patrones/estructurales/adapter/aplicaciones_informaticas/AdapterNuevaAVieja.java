package patrones.estructurales.adapter.aplicaciones_informaticas;

public class AdapterNuevaAVieja implements ISoftwareViejo {

    AppNueva appNueva;

    public AdapterNuevaAVieja(AppNueva appNueva) {
    }

    @Override
    public void ejecutar(String nombre_apellido) {

    }
}
