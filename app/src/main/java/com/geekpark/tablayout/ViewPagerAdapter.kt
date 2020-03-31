package com.geekpark.tablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

/*Adaptar de tipo FragmentPagerAdapter
* le enviamos nuestro fragment manager para utilizar nuestros fragmentos dentro del adaptador*/
class ViewPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    var fragmentList:ArrayList<Fragment>? = null
    var fragmentTitleList:ArrayList<String>? = null

    init {
        fragmentList = ArrayList()
        fragmentTitleList = ArrayList()
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList?.get(position)!!
    }

    override fun getCount(): Int {
        return fragmentList?.size!!
    }

    fun addFragment(fragment:Fragment, title:String){
        fragmentList?.add(fragment)!!
        fragmentTitleList?.add(title)!!
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitleList?.get(position)!!
    }


}