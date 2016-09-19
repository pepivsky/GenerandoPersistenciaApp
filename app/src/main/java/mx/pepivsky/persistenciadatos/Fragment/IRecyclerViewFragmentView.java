package mx.pepivsky.persistenciadatos.Fragment;

import java.util.ArrayList;

import mx.pepivsky.persistenciadatos.Adapter.MascotaAdaptador;
import mx.pepivsky.persistenciadatos.model.Mascota;


/**
 * Created by noisecontrollers on 11/09/2016.
 */
public interface IRecyclerViewFragmentView {

    public void generarLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
