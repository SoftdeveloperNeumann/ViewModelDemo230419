package de.softdeveloper.viewmodeldemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import de.softdeveloper.viewmodeldemo.databinding.FragmentDataBinding


class DataFragment : Fragment() {

    private lateinit var binding: FragmentDataBinding
    lateinit var model: Data

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDataBinding.inflate(inflater, container,false)

        activity?.let {fragmentActivity ->
            model = ViewModelProvider(fragmentActivity)[Data::class.java]
            model.content.observe(fragmentActivity){value ->
                binding.tvFragmentOutput.text = value
            }
        }

        return binding.root
    }


}