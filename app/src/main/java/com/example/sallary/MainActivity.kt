package com.example.sallary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.sallary.constance.Constance
import com.example.sallary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
       // findViewById<Button>("button")



        bindingClass.button.setOnClickListener{

           val resultValue = bindingClass.edValue.text.toString()
           val incorrectPassword = "incorrect password"

            bindingClass.imageView.visibility = View.VISIBLE

            when(resultValue){

                Constance.DIRECTOR -> {
                    bindingClass.salary.visibility = View.VISIBLE
                    val tempText = "Take your ${Constance.DIRECTOR_SALARY}"
                    if(bindingClass.password.text.toString() == Constance.DIRECTOR_PASSWORD){
                        bindingClass.salary.text = tempText
                        bindingClass.imageView.setImageResource(R.drawable.dice_2)
                    } else {
                        bindingClass.salary.text = incorrectPassword
                        bindingClass.imageView.setImageResource(R.drawable.dice_1)

                    }
                }

                Constance.MANAGER -> {
                    bindingClass.salary.visibility = View.VISIBLE
                    val tempText = "Take your ${Constance.MANAGER_SALARY}"
                    if(bindingClass.password.text.toString() == Constance.MANAGER_PASSWORD){
                        bindingClass.salary.text = tempText
                        bindingClass.imageView.setImageResource(R.drawable.dice_3)

                    } else {
                        bindingClass.salary.text = incorrectPassword
                        bindingClass.imageView.setImageResource(R.drawable.dice_1)

                    }
                }

                Constance.ENGINEER -> {
                    bindingClass.salary.visibility = View.VISIBLE
                    val tempText = "Take your ${Constance.ENGINEER_SALARY}"
                    if(bindingClass.password.text.toString() == Constance.ENGINEER_PASSWORD){
                        bindingClass.salary.text = tempText
                        bindingClass.imageView.setImageResource(R.drawable.dice_4)

                    } else {
                        bindingClass.salary.text = incorrectPassword
                        bindingClass.imageView.setImageResource(R.drawable.dice_1)

                    }
                }

                else -> {
                    bindingClass.salary.visibility = View.VISIBLE
                    bindingClass.salary.text = "Employee are absented"

                }
            }
        }
    }




}