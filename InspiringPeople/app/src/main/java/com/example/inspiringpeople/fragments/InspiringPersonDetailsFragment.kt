package com.example.inspiringpeople.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.inspiringpeople.databinding.FragmentInspiringPersonDetailsBinding
import com.example.inspiringpeople.model.InspiringPerson
import com.squareup.picasso.Picasso

class InspiringPersonDetailsFragment : Fragment()
{
    lateinit var personDetailsBinding: FragmentInspiringPersonDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        personDetailsBinding = FragmentInspiringPersonDetailsBinding.inflate(
            inflater,
            container,
            false
        )

        arguments?.let {
            val person = it.getSerializable(KEY_NOTE) as InspiringPerson
            personDetailsBinding.tvInspiringPersonName.text = person.name
            personDetailsBinding.tvInspiringPersonDob.text = person.dob
            personDetailsBinding.tvInspiringPersonDetails.text = person.details
            Picasso.get().load(person.imageSrc).into(personDetailsBinding.ivInspiringPersonPicture)
        }
        return personDetailsBinding.root
    }


    companion object
    {
        const val TAG = "Details"
        private const val KEY_NOTE = "InspiringPerson"

        fun create(person: InspiringPerson): InspiringPersonDetailsFragment
        {
            val args = Bundle()
            args.putSerializable(KEY_NOTE, person)
            val fragment =  InspiringPersonDetailsFragment()
            fragment.arguments = args
            return fragment
        }
    }
}