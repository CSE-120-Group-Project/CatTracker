package com.cattracker

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.media.Image
import android.os.Bundle
import android.os.Handler
import android.os.SystemClock
import android.support.annotation.ColorInt
import android.support.annotation.DrawableRes
import android.support.v4.content.res.ResourcesCompat
import android.support.v4.graphics.drawable.DrawableCompat
import android.support.v7.app.AppCompatActivity
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.util.Log
import android.view.View
import android.view.animation.BounceInterpolator
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioGroup
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import android.widget.Toast
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
import com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener
import com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
import com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import java.util.ArrayList
import java.util.Random

class LineMarker {


    private lateinit var map: GoogleMap

    private var activeLine = Fastcat

    private var Heritage = mapOf(
            "Mammoth Lakes Rd." to LatLng(37.363256, -120.429404),
            "Student Activities & Athletics Center" to LatLng(37.3654274, -120.4262007),
            "Emigrant Pass at Scholars Lane" to LatLng(37.3637409, -120.4305694),
            "Yosemite Ave and Cordova Ave(Merced County Physicians" to LatLng(37.332089, -120.4625951),
            "R Street Village Apartments" to LatLng(37.3353841, -120.4867372)
    )

    private var CampusTrax = mapOf(
            "Mammoth Lakes Rd." to LatLng(37.363256, -120.429404),
            "Student Activities & Athletics Center" to LatLng(37.3654274, -120.4262007),
            "Emigrant Pass at Scholars Lane" to LatLng(37.3637409, -120.4305694),
            "Castle Air Park" to LatLng(37.3742624, -120.5766809)
    )

    private var C1 = mapOf(
            "Granville Apartments" to LatLng(37.315222, -120.502972),
            "Walmart on Loughborough Dr.(Pullout past Mistwood Dr.)" to LatLng(37.316995, -120.499007),
            "Meadows Ave. & Olivewood Dr.(Food Maxx)" to LatLng(37.318107, -120.490619),
            //"Swiss Colony Apts." to LatLng(),
            "G St. & W. Alexander Ave.(Bus Stop on G by Gas Station)" to LatLng(37.315778, -120.469213),
            "Rite Aid/Walgreens" to LatLng(37.319633, -120.469128),
            "El Portal & G Street(Bus Stop on G)" to LatLng(37.327045, -120.469015),
            "Mercy Hospital/Tri-College" to LatLng(37.339455, -120.468750),
            "Bellevue Ranch on Arrow Wood Dr." to LatLng(37.3526891, -120.4781953),
            "Mammoth Lakes Rd." to LatLng(37.363256, -120.429404),
            "Student Activities & Athletics Center" to LatLng(37.3654274, -120.4262007),
            "Emigrant Pass at Scholars Lane" to LatLng(37.3637409, -120.4305694),
            "Mercy Hospital/Tri-College" to LatLng(37.339455, -120.468750),
            "El Portal & G Street(Bus Stop on G)" to LatLng(37.327045, -120.469015),
            "G St. & W. Alexander Ave.(Bus Stop on G by Gas Station)" to LatLng(37.315778, -120.469213),
            //"Swiss Colony"
            "Meadows Ave. & Olivewood Dr.(Food Maxx)" to LatLng(37.318107, -120.490619)
            //"Walmart"
    )

    private var C2 = mapOf(
            "R Street Village Apartments" to LatLng(37.3353841, -120.4867372),
            "Compass Pointe Apts" to LatLng(37.335707, -120.490445),
            "Buena Vista Dr." to LatLng(37.326252, -120.502633),
            "Merced Mall Target" to LatLng(37.323303, -120.485577),
            "Villages Apts. M Street" to LatLng(37.324417, -120.478281),
            "Merced College The Bus Terminal" to LatLng(37.334558, -120.477976),
            "Ironstone Dr." to LatLng(37.342589, -120.4806),
            "Bellevue Ranch on Arrow Wood Dr." to LatLng(37.3526891, -120.4781953),
            "Mammoth Lakes Rd." to LatLng(37.363256, -120.429404),
            "Student Activities & Athletics Center" to LatLng(37.3654274, -120.4262007),
            "Emigrant Pass at Scholars Lane" to LatLng(37.3637409, -120.4305694)
    )

    private var E1 = mapOf(
            "Mammoth Lakes Rd." to LatLng(37.363256, -120.429404),
            "Student Activities & Athletics Center" to LatLng(37.3654274, -120.4262007),
            "Emigrant Pass at Scholars Lane" to LatLng(37.3637409, -120.4305694)
    )

    private var E2 = mapOf(
            "Mammoth Lakes Rd." to LatLng(37.363256, -120.429404),
            "Student Activities & Athletics Center" to LatLng(37.3654274, -120.4262007),
            "Emigrant Pass at Scholars Lane" to LatLng(37.3637409, -120.4305694)
    )

    private var Fastcat = mapOf(
            "Moraga Subdivision" to LatLng(37.332027, -120.438567),
            "Yosemite Church(McKee Rd.)" to LatLng(37.332027, -120.442899),
            "University Surgery Center" to LatLng(37.332207, -120.451404),
            "Starbucks/Promenade Center" to LatLng(37.332027, -120.460492),
            "Mercy Hospital/Tri-College" to LatLng(37.339455, -120.468750),
            "Cardella Rd & M Street" to LatLng(37.347495, -120.477322),
            "Bellevue Ranch on Arrow Wood Dr." to LatLng(37.3526891, -120.4781953),
            "Mammoth Lakes Rd." to LatLng(37.363256, -120.429404),
            "Student Activities & Athletics Center" to LatLng(37.3654274, -120.4262007),
            "Emigrant Pass at Scholars Lane" to LatLng(37.3637409, -120.4305694),
            "Bellevue Ranch on Arrow Wood Dr." to LatLng(37.3526891, -120.4781953),
            "Mercy Hospital/Tri-College" to LatLng(37.339455, -120.468750),
            "Yosemite Ave and Cordova Ave(Merced County Physicians" to LatLng(37.332089, -120.4625951),
            "University Surgery Center" to LatLng(37.332207, -120.451404),
            "Yosemite Church(McKee Rd.)" to LatLng(37.332027, -120.442899),
            "Moraga Subdivision" to LatLng(37.332027, -120.438567)
    )

    private var G = mapOf(
            "R Street Village Apartments" to LatLng(37.3353841, -120.4867372),
            "Compass Pointe Apts" to LatLng(37.335707, -120.490445),
            "Merced College The Bus Terminal" to LatLng(37.334558, -120.477976),
            "Ironstone Dr." to LatLng(37.342589, -120.4806),
            "Bellevue Ranch on Arrow Wood Dr." to LatLng(37.3526891, -120.4781953),
            "Mammoth Lakes Rd." to LatLng(37.363256, -120.429404),
            "Student Activities & Athletics Center" to LatLng(37.3654274, -120.4262007),
            "Emigrant Pass at Scholars Lane" to LatLng(37.3637409, -120.4305694),
            "Amtrak" to LatLng(37.307412, -120.477543),
            "K St. Between 18th St. & 19th St." to LatLng(37.302271, -120.481111)
    )

    fun onMapReady(googleMap: GoogleMap?) {
        map = googlemap ?: return

        addMarkers()
    }

    private fun addMarkers() {
        val placeDetailsMap = mutableMapOf(
                for (key in activeLine) {

                    $key to PlaceDetails (
                            position = activeLine.getValue($key),
                    title = $key,
                    draggable = false
                    )
                }
        )
    }
}