package com.ubaya.week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val randomNumber1 = (1..100).random()
        val randomNumber2 = (1..100).random()

        val angka1 = txtAngka1.text.toString()
        val angka2 = txtAngka2.text.toString()

        val hasil = angka1 + angka2
        val answer = txtAnswer.text.toString()
        val point = 0

        btnSubmit.setOnClickListener {

            if(answer == hasil){
                val point = point + 1
            }
            else{
                val action = MainFragmentDirections.actionGameFragment(answer)
                Navigation.findNavController(it).navigate(action)
            }
        }
    }
}