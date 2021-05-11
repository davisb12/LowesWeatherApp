package com.example.lowesweatherapp.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.lowesweatherapp.R
import com.example.lowesweatherapp.databinding.FragmentSelectedWeatherBinding
import com.example.lowesweatherapp.util.init

class SelectedWeatherFragment : Fragment(R.layout.fragment_selected_weather) {
    private val arguments by navArgs<SelectedWeatherFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        android.util.Log.i("SELECTED_WEATHER_FRAG", "onViewCreated: ")
        FragmentSelectedWeatherBinding.bind(view).apply {
            toolbar.init(arguments.city)
            tvMainTemp.text = arguments.selectedWeather.main?.temp.toString()
            tvFeelsTemp.text = arguments.selectedWeather.main?.feelsLike.toString()
            tvMainWeather.text = arguments.selectedWeather.weather?.get(0)?.main
            tvWeatherDescription.text = arguments.selectedWeather.weather?.get(0)?.description
        }
    }
}