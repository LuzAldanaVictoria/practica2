package com.ort.tp3.ort.simulacro2.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ort.tp3.ort.simulacro2.R
import com.ort.tp3.ort.simulacro2.holders.NotificationHolder
import com.ort.tp3.ort.simulacro2.listener.OnNotificationClickedListener
import com.ort.tp3.ort.simulacro2.models.Notification

class NotificationAdapter (
    private val notificationList: List<Notification>,
    private val onNotificationClickedListener: OnNotificationClickedListener
) : RecyclerView.Adapter<NotificationHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_notification, parent, false)
        return NotificationHolder(view)
    }

    override fun onBindViewHolder(holder: NotificationHolder, position: Int) {
        val notification = notificationList[position]
        holder.bind(notification)
        holder.itemView.setOnClickListener {
            onNotificationClickedListener.onNotificationSelected(notification)
        }
    }

    override fun getItemCount() = notificationList.size
}