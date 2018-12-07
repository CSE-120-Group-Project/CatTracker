package com.cattracker

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_closest_stop.*
import com.cattracker.LineMarker
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng

class ClosestStop : FragmentActivity(), OnMapReadyCallback{

    private lateinit var map: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_closest_stop)
        val uriString = "https://www.google.com/maps/dir/?api=1&destination="

        for(coords in activeLine[activeLine.indexOf(Heritage)]){
            uriString.plus(coords.value.latitude)
            uriString.plus(",")
            uriString.plus(coords.value.longitude)
            if(coords.key.equals("Student Activities & Athletics Center")){
                uriString.plus("&waypoints=")
            }
        }
        uriString.plus("&travelmode=walking")
        val mapUri = Uri.parse(uriString)
        val mapIntent = Intent(Intent.ACTION_VIEW, mapUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        try {
            startActivity(mapIntent)
        } catch (ex: ActivityNotFoundException) {
            try {
                val unrestrictedIntent = Intent(Intent.ACTION_VIEW, mapUri );
                startActivity(unrestrictedIntent)
            } catch (innerEx: ActivityNotFoundException) {
                Toast.makeText(this, "Please install a maps application", Toast.LENGTH_LONG).show()
            }
        }
        /*val mapFragment : SupportMapFragment? =
                supportFragmentManager.findFragmentById(R.id.map) as? SupportMapFragment
        mapFragment?.getMapAsync(this)*/
        this.bottomNavigationView.menu.getItem(2).setChecked(true)

        this.bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_favorites -> {
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                }
                R.id.action_itinerary_search -> {
                    val intent = Intent(this, Itinerary::class.java)
                    startActivity(intent)
                }
                R.id.action_timetables -> {
                    val intent = Intent(this, Timetables::class.java)
                    startActivity(intent)
                }
                R.id.action_closest_stop -> {
                    val intent = Intent(this, ClosestStop::class.java)
                    startActivity(intent)
                }
            }
            return@setOnNavigationItemSelectedListener true
        }

    }

    override fun onMapReady(googleMap: GoogleMap?) {
        map = googleMap ?: return
        with(map){
            uiSettings.isZoomControlsEnabled = false
        }


    }
    private var Heritage = mapOf(
            "Student Activities & Athletics Center" to LatLng(37.3654274, -120.4262007),
            "Emigrant Pass at Scholars Lane" to LatLng(37.3637409, -120.4305694),
            "Yosemite Ave and Cordova Ave(Merced County Physicians" to LatLng(37.332089, -120.4625951),
            "R Street Village Apartments" to LatLng(37.3353841, -120.4867372),
            "Mammoth Lakes Rd." to LatLng(37.363256, -120.429404)
    )

    private var CampusTrax = mapOf(
            "Student Activities & Athletics Center" to LatLng(37.3654274, -120.4262007),
            "Emigrant Pass at Scholars Lane" to LatLng(37.3637409, -120.4305694),
            "Castle Air Park" to LatLng(37.3742624, -120.5766809),
            "Mammoth Lakes Rd." to LatLng(37.363256, -120.429404)
    )

    private var C1 = mapOf(
            "Student Activities & Athletics Center" to LatLng(37.3654274, -120.4262007),
            "Emigrant Pass at Scholars Lane" to LatLng(37.3637409, -120.4305694),
            "Mercy Hospital/Tri-College" to LatLng(37.339455, -120.468750),
            "El Portal & G Street(Bus Stop on G)" to LatLng(37.327045, -120.469015),
            "G St. & W. Alexander Ave.(Bus Stop on G by Gas Station)" to LatLng(37.315778, -120.469213),
            //"Swiss Colony"
            "Meadows Ave. & Olivewood Dr.(Food Maxx)" to LatLng(37.318107, -120.490619),
            //"Walmart"
            "Granville Apartments" to LatLng(37.315222, -120.502972),
            "Walmart on Loughborough Dr.(Pullout past Mistwood Dr.)" to LatLng(37.316995, -120.499007),
            "Meadows Ave. & Olivewood Dr.(Food Maxx)" to LatLng(37.318107, -120.490619),
            //"Swiss Colony Apts." to LatLng(),
            "G St. & W. Alexander Ave.(Bus Stop on G by Gas Station)" to LatLng(37.315778, -120.469213),
            "Rite Aid/Walgreens" to LatLng(37.319633, -120.469128),
            "El Portal & G Street(Bus Stop on G)" to LatLng(37.327045, -120.469015),
            "Mercy Hospital/Tri-College" to LatLng(37.339455, -120.468750),
            "Bellevue Ranch on Arrow Wood Dr." to LatLng(37.3526891, -120.4781953),
            "Mammoth Lakes Rd." to LatLng(37.363256, -120.429404)
    )

    private var C2 = mapOf(
            "Student Activities & Athletics Center" to LatLng(37.3654274, -120.4262007),
            "Emigrant Pass at Scholars Lane" to LatLng(37.3637409, -120.4305694),
            "R Street Village Apartments" to LatLng(37.3353841, -120.4867372),
            "Compass Pointe Apts" to LatLng(37.335707, -120.490445),
            "Buena Vista Dr." to LatLng(37.326252, -120.502633),
            "Merced Mall Target" to LatLng(37.323303, -120.485577),
            "Villages Apts. M Street" to LatLng(37.324417, -120.478281),
            "Merced College The Bus Terminal" to LatLng(37.334558, -120.477976),
            "Ironstone Dr." to LatLng(37.342589, -120.4806),
            "Bellevue Ranch on Arrow Wood Dr." to LatLng(37.3526891, -120.4781953),
            "Mammoth Lakes Rd." to LatLng(37.363256, -120.429404)
    )

    private var E1 = mapOf(
        "Student Activities & Athletics Center" to LatLng(37.3654274, -120.4262007),
            "Emigrant Pass at Scholars Lane" to LatLng(37.3637409, -120.4305694),
            "Mammoth Lakes Rd." to LatLng(37.363256, -120.429404)

    )

    private var E2 = mapOf(
            "Student Activities & Athletics Center" to LatLng(37.3654274, -120.4262007),
            "Emigrant Pass at Scholars Lane" to LatLng(37.3637409, -120.4305694),
            "Mammoth Lakes Rd." to LatLng(37.363256, -120.429404)
    )

    private var Fastcat = mapOf(
            "Student Activities & Athletics Center" to LatLng(37.3654274, -120.4262007),
            "Emigrant Pass at Scholars Lane" to LatLng(37.3637409, -120.4305694),
            "Bellevue Ranch on Arrow Wood Dr." to LatLng(37.3526891, -120.4781953),
            "Mercy Hospital/Tri-College" to LatLng(37.339455, -120.468750),
            "Yosemite Ave and Cordova Ave(Merced County Physicians" to LatLng(37.332089, -120.4625951),
            "University Surgery Center" to LatLng(37.332207, -120.451404),
            "Yosemite Church(McKee Rd.)" to LatLng(37.332027, -120.442899),
            "Moraga Subdivision" to LatLng(37.332027, -120.438567),
            "Moraga Subdivision" to LatLng(37.332027, -120.438567),
            "Yosemite Church(McKee Rd.)" to LatLng(37.332027, -120.442899),
            "University Surgery Center" to LatLng(37.332207, -120.451404),
            "Starbucks/Promenade Center" to LatLng(37.332027, -120.460492),
            "Mercy Hospital/Tri-College" to LatLng(37.339455, -120.468750),
            "Cardella Rd & M Street" to LatLng(37.347495, -120.477322),
            "Bellevue Ranch on Arrow Wood Dr." to LatLng(37.3526891, -120.4781953),
            "Mammoth Lakes Rd." to LatLng(37.363256, -120.429404)
    )

    private var G = mapOf(
            "Student Activities & Athletics Center" to LatLng(37.3654274, -120.4262007),
            "Emigrant Pass at Scholars Lane" to LatLng(37.3637409, -120.4305694),
            "Amtrak" to LatLng(37.307412, -120.477543),
            "K St. Between 18th St. & 19th St." to LatLng(37.302271, -120.481111),
            "R Street Village Apartments" to LatLng(37.3353841, -120.4867372),
            "Compass Pointe Apts" to LatLng(37.335707, -120.490445),
            "Merced College The Bus Terminal" to LatLng(37.334558, -120.477976),
            "Ironstone Dr." to LatLng(37.342589, -120.4806),
            "Bellevue Ranch on Arrow Wood Dr." to LatLng(37.3526891, -120.4781953),
            "Mammoth Lakes Rd." to LatLng(37.363256, -120.429404)
    )

    private var activeLine = listOf(Heritage, CampusTrax, C1, C2, E1, E2, Fastcat, G)

    private fun addMarkers() {
        for (s in activeLine)
        {
            var y: Int = 1
            for (t in s.keys)
            {
                Log.i(" " + ": " + y.toString() + ". PLACE: ", t)
                y += 1
                val placeDetailsMap = mutableMapOf(
                        t to LineMarker.PlaceDetails(
                                position = s[t],
                                title = "Marker",
                                draggable = false
                        )
                )
            }
        }
    }
}