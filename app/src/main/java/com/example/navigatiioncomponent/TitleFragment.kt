package com.example.navigatiioncomponent


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.navigatiioncomponent.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_title, container, false
        )

        //way-1
        binding.playButton.setOnClickListener {view:View->
            //One Way
             //Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_gameFragment)
            //another way
            view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
        }

        // way-2 Navigation creates onClick listener for us so we can skip lambda functions
        //binding.playButton.setOnClickListener { Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment) }

       //To display option menu only to title fragment
        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)

        inflater?.inflate(R.menu.overflow_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,view!!.findNavController())||super.onOptionsItemSelected(item)


    }
}
