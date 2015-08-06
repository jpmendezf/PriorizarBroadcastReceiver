package spa.seccionuno.priorizarbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by USUARIO on 11/07/2015.
 */

    public class MiSegundaBroadcastReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context,Intent i)
        {
            Toast.makeText(context, "Emision recepcioanda en MiSegundaBroadcastReceiver," +
                    " valor recibido: " + i.getStringExtra("clave"), Toast.LENGTH_LONG).show();
        }
    }

