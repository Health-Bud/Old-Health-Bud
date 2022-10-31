package com.example.health_bud

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

private const val TAG = "LogFragment"

class LogFragment : Fragment() {
    private lateinit var medicineLogButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_log, container, false)
        medicineLogButton = view.findViewById(R.id.medicineLogButton)

        medicineLogButton.setOnClickListener {
            val intent = Intent(view?.context, MedicineLogActivity::class.java)
            view?.context?.startActivity(intent)
        }

        return view
    }

    companion object {
        fun newInstance(): LogFragment {
            return LogFragment()
        }
    }
}