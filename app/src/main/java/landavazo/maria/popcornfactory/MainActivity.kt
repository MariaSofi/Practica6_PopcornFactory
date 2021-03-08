package landavazo.maria.popcornfactory

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_detalle_pelicula.view.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.pelicula.view.*


class MainActivity : AppCompatActivity() {
    var adapter:PeliculaAdapter? =null
    var peliculas = ArrayList<Pelicula>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cargarPeliculas()
        adapter = PeliculaAdapter(this, peliculas)
        gridView.adapter = adapter
    }

    fun cargarPeliculas(){
        peliculas.add(Pelicula("Bones", R.drawable.bones, R.drawable.bonesheader, "Dr. Temperance Brennan is a brilliant, but lonely, anthropologist whom is approached by an\n" +
                "ambitious FBI agent, named Seely Booth, to help the bureau solve a series of unsolved crimes by\n" +
                "identifying the long-dead bodies of missing persons by their bone structure. But both Agent Booth\n" +
                "\n" +
                "and Dr. Brennan and her team come up again a variety of interference from red tape, corruption,\n" +
                "and local noncooperation."))
        peliculas.add(Pelicula("Dr.House", R.drawable.drhouse, R.drawable.drwhoheader, "The series follows the life of anti-social, pain killer addict, witty and arrogant medical doctor Gregory\n" +
                "House (Hugh Laurie) with only half a muscle in his right leg. He and his team of medical doctors try\n" +
                "to cure complex and rare diseases from very ill ordinary people in the United States of America."))
        peliculas.add(Pelicula("Big Hero 6", R.drawable.bighero6, R.drawable.headerbighero6, "When a devastating event befalls the city of San Fransokyo and catapults Hiro into the\n" +
                "midst of danger, he turns to Baymax and his close friends adrenaline junkie Go Go\n" +
                "Tomago, neatnik Wasabi, chemistry whiz Honey Lemon and fanboy Fred. Determined to\n" +
                "uncover the mystery, Hiro transforms his friends into a band of high-tech heroes called\n" +
                "&quot;Big Hero 6.&quot;"))
        peliculas.add(Pelicula("Dr, Who", R.drawable.drwho, R.drawable.drwhoheader, "Traveling across time and space, the immortal time-lord known as &#39;The Doctor&#39; travels across the\n" +
                "universe with his many companions and his loyal shape-shifting space-ship: The TARDIS. The\n" +
                "Doctor faces many threats across many generations: from The Daleks, The Cybermen and his time-\n" +
                "lord adversary The Master to the sinister Davros, creator of The Daleks."))
        peliculas.add(Pelicula("Friends", R.drawable.friends, R.drawable.friendsheader, "Rachel Green, Ross Geller, Monica Geller, Joey Tribbiani, Chandler Bing and Phoebe Buffay are\n" +
                "six 20 something year-olds, living off of one another in the heart of New York City. Over the course\n" +
                "of ten years, this average group of buddies goes through massive mayhem, family trouble, past and\n" +
                "future romances, fights, laughs, tears and surprises as they learn what it really means to be a\n" +
                "friend."))
        peliculas.add(Pelicula("Inception", R.drawable.inception, R.drawable.inceptionheader,"Dom Cobb is a skilled thief, the absolute best in the dangerous art of extraction, stealing\n" +
                "valuable secrets from deep within the subconscious during the dream state, when the\n" +
                "mind is at its most vulnerable. Cobb&#39;s rare ability has made him a coveted player in this\n" +
                "treacherous new world of corporate espionage, but it has also made him an international\n" +
                "fugitive and cost him everything he has ever loved. Now Cobb is being offered a chance at\n" +
                "redemption. One last job could give him his life back but only if he can accomplish the\n" +
                "impossible, inception. Instead of the perfect heist, Cobb and his team of specialists have to\n" +
                "pull off the reverse: their task is not to steal an idea, but to plant one. If they succeed, it\n" +
                "could be the perfect crime. But no amount of careful planning or expertise can prepare the\n" +
                "team for the dangerous enemy that seems to predict their every move. An enemy that only\n" +
                "Cobb could have seen coming."))
        peliculas.add(Pelicula("Leap Year", R.drawable.leapyear, R.drawable.leapyearheader,"A woman who has an elaborate scheme to propose to her boyfriend on Leap Day, an Irish\n" +
                "tradition which occurs every time the date February 29 rolls around, faces a major setback\n" +
                "when bad weather threatens to derail her planned trip to Dublin. With the help of an\n" +
                "innkeeper, however, her cross-country odyssey just might result in her getting engaged."))
        peliculas.add(Pelicula("Toy Story", R.drawable.toystory, R.drawable.toystoryheader, "Toy Story is about the &#39;secret life of toys&#39; when people are not around. When Buzz\n" +
                "Lightyear, a space-ranger, takes Woody&#39;s place as Andy&#39;s favorite toy, Woody doesn&#39;t like\n" +
                "the situation and gets into a fight with Buzz. Accidentaly Buzz falls out the window and\n" +
                "Woody is accused by all the other toys of having killed him. He has to go out of the house\n" +
                "to look for him so that they can both return to Andys room. But while on the outside they\n" +
                "get into all kind of trouble while trying to get home."))
        peliculas.add(Pelicula("Smallville", R.drawable.smallville, R.drawable.smallvilleheader, "Toy Story is about the &#39;secret life of toys&#39; when people are not around. When Buzz\n" +
                "Lightyear, a space-ranger, takes Woody&#39;s place as Andy&#39;s favorite toy, Woody doesn&#39;t like\n" +
                "the situation and gets into a fight with Buzz. Accidentaly Buzz falls out the window and\n" +
                "Woody is accused by all the other toys of having killed him. He has to go out of the house\n" +
                "to look for him so that they can both return to Andys room. But while on the outside they\n" +
                "get into all kind of trouble while trying to get home."))
    }


    class PeliculaAdapter:BaseAdapter{

        var peliculas =ArrayList<Pelicula>()
        var context: Context?=null

        constructor(context: Context, peliculas: ArrayList<Pelicula>){
            this.context=context
            this.peliculas =peliculas

        }
        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var pelicula = peliculas[p0]
            var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var vista = inflator.inflate(R.layout.pelicula, null)
            vista.iv_pelicula.setImageResource(pelicula.image)
            vista.tv_name_movie.setText(pelicula.titulo)

            vista.iv_pelicula.setOnClickListener(){
                var intent = Intent(context, DetallePelicula::class.java)
                intent.putExtra("titulo", pelicula.titulo)
                intent.putExtra("image", pelicula.image)
                intent.putExtra("header", pelicula.header)
                intent.putExtra("sinopsis", pelicula.sinopsis)
                context!!.startActivity(intent)
            }

            return vista
        }

        override fun getCount(): Int {
            return peliculas.size
        }

        override fun getItem(p0: Int): Any {
            return peliculas[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }


    }


}