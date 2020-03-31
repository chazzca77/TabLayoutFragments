package com.geekpark.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /*TABLAYOUT
    *
    * Configuramos nuestro Layout con los 3 view necesarios para nuestro tablayout
    * AppbarLayout
    * TabLayout
    * ViewPager
    * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configurarViewPager()
        tabs?.setupWithViewPager(viewPager)

        configurarIconos()

    }

    //Podemos realizar configuraciones a nuestro view pager y agregamos su adaptador
    fun configurarViewPager(){
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(Fragmento1(),"Fragmento 01")
        adapter.addFragment(Fragmento2(),"Fragmento 02")
        adapter.addFragment(Fragmento1(),"Fragmento 03")
        adapter.addFragment(Fragmento2(),"Fragmento 04")

        viewPager.adapter = adapter
    }

    //Agregamos íconos
    fun configurarIconos(){
        tabs?.getTabAt(0)!!.setIcon(R.drawable.icono01)
        tabs?.getTabAt(1)!!.setIcon(R.drawable.icono02)
        tabs?.getTabAt(2)!!.setIcon(R.drawable.icono03)

    }


}
