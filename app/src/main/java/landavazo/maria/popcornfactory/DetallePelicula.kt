package landavazo.maria.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle_pelicula.*

class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val bundle = intent.extras

        if(bundle != null){
            this.iv_movie_image.setImageResource(bundle.getInt("header"))
            tv_name_movie.setText(bundle.getString("nombre"))
            tv_movie_desc.setText(bundle.getString("sinopsis"))
        }
    }
}