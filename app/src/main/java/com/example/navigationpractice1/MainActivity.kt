package com.example.navigationpractice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.navigationpractice1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var navController: NavController
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolBar.root)

        val drawerLayout = binding.drawerLayout
        val navView = binding.navigationView
        navController = findNavController(R.id.fragmentContainerView)

        appBarConfiguration = AppBarConfiguration(

            setOf(

                R.id.signInFragment,
                R.id.homeFragment,
                R.id.profileFragment,
                R.id.userFragment
            ), drawerLayout
        )

        setupActionBarWithNavController(navController, drawerLayout)
        navView.setupWithNavController(navController)


    }

    override fun onSupportNavigateUp(): Boolean {


        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.top_tool_bar, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {



        when(item.itemId){
            R.id.sendMenu->{
                Toast.makeText(this,"Send Menu Clicked",Toast.LENGTH_LONG).show()
            }

            R.id.gallery->{
                Toast.makeText(this,"Gallery Menu Clicked",Toast.LENGTH_LONG).show()
            }
            R.id.callMenu->{
                Toast.makeText(this,"Call Menu Clicked",Toast.LENGTH_LONG).show()
            }
            R.id.calculatorMenu->{
                navController.navigate(R.id.calculatorFragment)
                Toast.makeText(this,"Calculator Menu Clicked",Toast.LENGTH_LONG).show()
            }

            R.id.exitMenu ->{
                finish()
                Toast.makeText(this,"exit Menu Clicked",Toast.LENGTH_LONG).show()
            }
        }


        return super.onOptionsItemSelected(item)
    }
}