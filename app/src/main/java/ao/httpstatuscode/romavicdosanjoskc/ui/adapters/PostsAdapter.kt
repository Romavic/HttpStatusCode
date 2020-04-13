package ao.httpstatuscode.romavicdosanjoskc.ui.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import ao.httpstatuscode.romavicdosanjoskc.R
import ao.httpstatuscode.romavicdosanjoskc.network.model.PostsModel

class PostsAdapter(
    private val context: Context,
    private val postsList: List<PostsModel>
) : RecyclerView.Adapter<PostsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.row_posts, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.userIdHolder.text = "User ID: " + postsList[position].userId
        holder.idHolder.text = "Id: " + postsList[position].id
        holder.titleHolder.text = "Title Post: " + postsList[position].title
        holder.bodyHolder.text = "Description Post: " + postsList[position].body
    }

    override fun getItemCount(): Int = postsList.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var userIdHolder: AppCompatTextView = itemView.findViewById(R.id.userIdRow)
        var idHolder: AppCompatTextView = itemView.findViewById(R.id.idRow)
        var titleHolder: AppCompatTextView = itemView.findViewById(R.id.titleRow)
        var bodyHolder: AppCompatTextView = itemView.findViewById(R.id.bodyRow)
    }
}