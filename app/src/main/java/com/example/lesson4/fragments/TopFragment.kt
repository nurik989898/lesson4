package com.example.lesson4.fragments

import androidx.lifecycle.ViewModelProvider
import com.example.lesson4.MainViewModel
import com.example.lesson4.base.BaseFragment
import com.example.lesson4.databinding.FragmentTopBinding

class TopFragment : BaseFragment<FragmentTopBinding>() {
private lateinit var viewModel: MainViewModel
    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun observe() {
        viewModel.counter.observe(this){count ->
            binding.tvCount.text = count.toString()
        }
    }

    override fun initClickListeners() {
    }
    override fun inflateViewBinding(): FragmentTopBinding {
    return FragmentTopBinding.inflate(layoutInflater)
    }

    override fun initView() {

    }

}