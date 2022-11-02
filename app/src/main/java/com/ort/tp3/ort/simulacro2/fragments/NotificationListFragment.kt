package com.ort.tp3.ort.simulacro2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ort.tp3.ort.simulacro2.R
import com.ort.tp3.ort.simulacro2.adapters.NotificationAdapter
import com.ort.tp3.ort.simulacro2.listener.OnNotificationClickedListener
import com.ort.tp3.ort.simulacro2.models.Notification

class NotificationListFragment : Fragment(), OnNotificationClickedListener {
    lateinit var v:View
    lateinit var recyclerNotification: RecyclerView
    lateinit var notificationList : List<Notification>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notification_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerNotification = view.findViewById(R.id.notificationRecyclerView)
        fillNotificationList()
    }


    private fun fillNotificationList() {
        val notification1 = Notification("Notificacion 1", "10:00")
        val notification2 = Notification("Notificacion 2", "11:00")
        val notification3 = Notification("Notificacion 3", "12:00")
        val notification4 = Notification("Notificacion 4", "13:00")
        val notification5 = Notification("Notificacion 5", "14:00")
        val notification6 = Notification("Notificacion 6", "15:00")
        val notification7 = Notification("Notificacion 7", "16:00")
        val notification8 = Notification("Notificacion 8", "17:00")
        val notification9 = Notification("Notificacion 9", "18:00")
        val notification10 = Notification("Notificacion 10", "19:00")
        val notification11 = Notification("Notificacion 11", "20:00")
        val notification12 = Notification("Notificacion 12", "21:00")
        val notification13 = Notification("Notificacion 13", "22:00")
        val notification14 = Notification("Notificacion 14", "23:00")




        // Lleno una lista con productos que cree a mano
        notificationList = listOf(notification1, notification2, notification3, notification4, notification5, notification6, notification7, notification8, notification9, notification10, notification11, notification12, notification13, notification14)

        // Configuro el recyclerview y le paso un Adapter
        val layoutManager = LinearLayoutManager(context)
        recyclerNotification.layoutManager = layoutManager
        recyclerNotification.adapter = NotificationAdapter(notificationList, this)
    }

    override fun onNotificationSelected(notification: Notification) {
        //findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToProductDetailFragment(product))
    }


}