package com.ort.tp3.ort.simulacro2.holders

import com.ort.tp3.ort.simulacro2.models.Notification
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ort.tp3.ort.simulacro2.R

class NotificationHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val description: TextView
    private val time: TextView

    init {
        description = itemView.findViewById(R.id.txtDescription)
        time = itemView.findViewById(R.id.txtTime)
    }

    fun bind(notification: Notification) {
        description.text = notification.description
        time.text = "$${notification.time}"

    }
}