package firebase.app.firebaseloginkotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import firebase.app.firebaseloginkotlin.R
import firebase.app.firebaseloginkotlin.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val title: TextView = view.findViewById(R.id.descriptionTextView)
        title.text = "Bienvenido"
        return view

    }

}