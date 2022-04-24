package com.example.projetandroid

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
         drawer = findViewById(R.id.drawerLayout)

        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.open, R.string.close)
        drawer.addDrawerListener(toggle)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        val navigationView: NavigationView = findViewById(R.id.nav_menu)
        navigationView.setNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val APaint = Intent(this, PaintActivity::class.java)
        val ACalcul = Intent(this, CalculatorActivity::class.java)
        val ACalender = Intent(this, CalendrierActivity::class.java)

        when (item.itemId) {
            R.id.paint -> startActivity(APaint)
            R.id.calculatrice -> startActivity(ACalcul)
            R.id.calendrier -> startActivity(ACalender)
        }
        return true
    }

}