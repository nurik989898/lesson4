package com.example.lesson4.fragments
import android.content.Intent
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lesson4.MainActivity
import com.example.lesson4.MainViewModel
import com.example.lesson4.R
import com.example.lesson4.base.BaseFragment
import com.example.lesson4.databinding.FragmentBottomBinding

class BottomFragment : BaseFragment<FragmentBottomBinding>() {
    private lateinit var viewModel: MainViewModel
    val fragment = Fragment()
    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun observe() {
    }

    override fun initClickListeners() {
        binding.btnCount.setOnClickListener {
            viewModel.increment() }
        binding.btnCountMin.setOnClickListener{
            viewModel.decrement()
        }
    }
    override fun inflateViewBinding(): FragmentBottomBinding {
        return FragmentBottomBinding.inflate(layoutInflater)
    }

    override fun initView() {

    }
}