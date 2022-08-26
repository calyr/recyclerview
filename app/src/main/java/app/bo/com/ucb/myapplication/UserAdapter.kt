package app.bo.com.ucb.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class UserAdapter(val list: ArrayList<User>, val applicationContext: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_row, parent, false)
        return UserListViewHolder(view)

    }

    class UserListViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list.get(position)
        holder.itemView.findViewById<TextView>(R.id.tv_name).text = item.name + applicationContext.getString(R.string.app_name)
        holder.itemView.findViewById<TextView>(R.id.tv_email).text = item.email

    }

    override fun getItemCount(): Int {
        return list.size
    }

}
