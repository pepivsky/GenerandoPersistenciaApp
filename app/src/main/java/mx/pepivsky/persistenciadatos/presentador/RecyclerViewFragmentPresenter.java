package mx.pepivsky.persistenciadatos.presentador;

import android.content.Context;

import java.util.ArrayList;

import mx.pepivsky.persistenciadatos.Fragment.IRecyclerViewFragmentView;
import mx.pepivsky.persistenciadatos.model.Mascota;
import mx.pepivsky.persistenciadatos.model.constructorMascotas;


/**
 * Created by noisecontrollers on 11/09/2016.
 */
public class RecyclerViewFragmentPresenter implements IRecyclerViewFragmentPresenter {



    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private constructorMascotas constructorMascota;
    private ArrayList<Mascota>mascotas;

    public RecyclerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context) {
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerMascotasBaseDatos();
    }


    @Override
    public void obtenerMascotasBaseDatos() {
        constructorMascota = new constructorMascotas(context);
        mascotas = constructorMascota.obtenerDatos();
        mostrarMascotasRV();

    }

    @Override
    public void mostrarMascotasRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador(mascotas));
        iRecyclerViewFragmentView.generarLayoutVertical();

    }
}
