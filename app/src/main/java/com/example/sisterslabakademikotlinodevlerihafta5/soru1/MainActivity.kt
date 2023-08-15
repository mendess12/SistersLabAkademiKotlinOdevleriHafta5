package com.example.sisterslabakademikotlinodevlerihafta5.soru1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.sisterslabakademikotlinodevlerihafta5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var carAdapter: CarAdapter
    private lateinit var carList: ArrayList<Cars>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager =
            StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL)
        addData()
    }

    private fun addData() {
        val car1 = Cars(1, "Audi Q7", 45.225, "audi_q7")
        val car2 = Cars(2, "Maybach", 70.525, "maybach")
        val car3 = Cars(3, "BMW M3", 50.205, "bmw_m3")
        val car4 = Cars(4, "Volvo XC90", 35.785, "volvoxc90")
        val car5 = Cars(5, "Lamborghini", 48.999, "lamborghini_revuelto")
        val car6 = Cars(6, "Passat", 20.225, "passat")
        val car7 = Cars(7, "Mercedes G63", 30.956, "mercedes_g63")
        val car8 = Cars(8, "Audi R8", 48.99, "audi_r8")
        val car9 = Cars(9, "Mercedes GLA180", 25.985, "mercedes_gla180")

        carList = ArrayList<Cars>()
        carList.add(car1)
        carList.add(car2)
        carList.add(car3)
        carList.add(car4)
        carList.add(car5)
        carList.add(car6)
        carList.add(car7)
        carList.add(car8)
        carList.add(car9)

        carAdapter = CarAdapter(this, carList)
        binding.rv.adapter = carAdapter
    }
}