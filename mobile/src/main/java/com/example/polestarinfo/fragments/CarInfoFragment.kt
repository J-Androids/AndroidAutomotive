package com.example.polestarinfo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.polestarinfo.R
import com.google.android.material.tabs.TabLayout

class CarInfoFragment : Fragment() {
    private lateinit var tabLayout: TabLayout

    override fun onResume() {
        super.onResume()
        tabLayout.getTabAt(1)!!.select()
        tabLayout.getTabAt(0)!!.select()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_car_info, container, false)

        tabLayout = view.findViewById(R.id.tab_layout)
        for (i in 0 until tabLayout.tabCount) {
            tabLayout.getTabAt(i)?.setCustomView(R.layout.custom_tab_layout)
        }

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when(tab!!.position){
                    0 -> replaceFragment(CarInfoTabFragment())
                    1 -> replaceFragment(CarSensorsTabFragment())
                }
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {}
            override fun onTabUnselected(tab: TabLayout.Tab?) {}
        })

        return view
    }

    private fun replaceFragment(fragment: Fragment,  addToBackStack:Boolean = false){
        val transaction = requireActivity().supportFragmentManager.beginTransaction()
        transaction.replace(R.id.car_fragment_container, fragment)
        when(addToBackStack){
            true -> {
                transaction.addToBackStack(null)
            }
        }
        transaction.commit()
    }
}