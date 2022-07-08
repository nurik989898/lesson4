package com.example.lesson4.fragments
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lesson4.MainViewModel
import com.example.lesson4.adapter.AdapterForResponse
import com.example.lesson4.base.BaseFragment
import com.example.lesson4.databinding.FragmentResponseBinding


class ResponseFragment : BaseFragment<FragmentResponseBinding>() {
    private val adapter = AdapterForResponse()
    private lateinit var viewModel: MainViewModel
    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun inflateViewBinding(): FragmentResponseBinding {
        return FragmentResponseBinding.inflate(layoutInflater)

    }

    override fun observe() {

    }

    override fun initClickListeners(){

    }

    override fun initView() {
        initAdapter()
        viewModel.historyList.observe(viewLifecycleOwner){
            adapter.add(it)
        }
    }

    private fun initAdapter() {
        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        binding.recycler.adapter = adapter
    }

}