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

Class LineMarker :


    private lateinit var map: GoogleMap
    private var lastSelectedMarker: Marker? = null

    private var Heritage = mapOf {
        "J_E_Gallo_Rec_Ctr" to LatLng(37.3654274, -120.4262007),
        "Emigrant_Pass" to LatLng(37.3637409, -120.4305694),
        "Yosemite_and_Cordova" to LatLng(37.332089, -120.4625951),
        "R_Street_Village_Apartments" to LatLng(37.3353841,-120.4867372)
    }
