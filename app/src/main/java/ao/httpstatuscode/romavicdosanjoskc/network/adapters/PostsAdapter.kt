package ao.httpstatuscode.romavicdosanjoskc.network.adapters

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
    private val postsModelList: List<PostsModel>
) : RecyclerView.Adapter<PostsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.row_posts, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.userId_row.text = "User ID: " + postsModelList[position].userId
        holder.id_row.text = "Id: " + postsModelList[position].id
        holder.title_row.text = "Title Post: " + postsModelList[position].title
        holder.body_row.text = "Description Post: " + postsModelList[position].body
    }

    override fun getItemCount(): Int {
        return postsModelList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var userId_row: AppCompatTextView = itemView.findViewById(R.id.userId_row)
        var id_row: AppCompatTextView = itemView.findViewById(R.id.id_row)
        var title_row: AppCompatTextView = itemView.findViewById(R.id.title_row)
        var body_row: AppCompatTextView = itemView.findViewById(R.id.body_row)
    }
}