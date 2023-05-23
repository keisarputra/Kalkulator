package com.example.kalkulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.kalkulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btnTambah.setOnClickListener(){
            tambah()
        }
        binding.btnKurang.setOnClickListener(){
            kurang()
        }
        binding.btnKali.setOnClickListener(){
            kali()
        }
        binding.btnBagi.setOnClickListener(){
            bagi()
        }
        binding.btnHapus.setOnClickListener(){
            hapus()
        }
        setContentView(binding.root)

    }
    private fun tambah(){
        var angka1 = binding.etInput1.text.toString().toInt()
        var angka2 = binding.etInput2.text.toString().toInt()
        var hasil = angka1 + angka2
        var kesimpulan = "$angka1 + $angka2 = $hasil"
        binding.tvHasil.text = kesimpulan
    }

    private fun kurang(){
        var angka1 = binding.etInput1.text.toString().toInt()
        var angka2 = binding.etInput2.text.toString().toInt()
        var hasil = angka1 - angka2
        var kesimpulan = "$angka1 - $angka2 = $hasil"
        binding.tvHasil.text = kesimpulan
    }

    private fun kali(){
        var angka1 = binding.etInput1.text.toString().toInt()
        var angka2 = binding.etInput2.text.toString().toInt()
        var hasil = angka1 * angka2
        var kesimpulan = "$angka1 * $angka2 = $hasil"
        binding.tvHasil.text = kesimpulan
    }

    private fun bagi(){
        var angka1 = binding.etInput1.text.toString().toDouble()
        var angka2 = binding.etInput2.text.toString().toDouble()
        var hasil = angka1 / angka2
        var kesimpulan = "$angka1 / $angka2 = $hasil"
        binding.tvHasil.text = kesimpulan
    }

    private fun hapus(){
        binding.etInput1.text.clear()
        binding.etInput2.text.clear()
        binding.tvHasil.text = "hasil"
    }
}