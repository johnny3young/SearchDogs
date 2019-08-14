package com.black3.app.searchdogs

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.black3.app.searchdogs.Model.Dog
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_dog.view.*
import kotlinx.android.synthetic.main.item_dog.view.textViewTitle

class AdapterDog(val dogs: ArrayList<Dog>) : RecyclerView.Adapter <AdapterDog.ViewHolder>() {
    
    val PATH_URL_IMAGE= "https://dog.ceo/api/breed/"
    
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_dog, p0,false))
    }
    override fun getItemCount(): Int {
        return dogs.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.vote_average.text = dogs[position].message.toString()
        holder.title.text = dogs[position].message.toString()

        Picasso.get().load(PATH_URL_IMAGE+"${dogs[position].message}").transform(CircleTransformation()).into(holder.imageView)

        //Show the poster in ImageActivity
        holder.itemView.ivDog.setOnClickListener{
            /*val z = Intent(holder.itemView.context,ImageActivity::class.java)
            z.putExtra("posterpath",dogs[position].poster_path)
           holder.imageView.animate().scaleX(1.0f).scaleY(1.0f).duration = 2000
            holder.itemView.context.startActivity(z)*/
        }
        //Show the details dogs in DetailActivity
        holder.itemView.setOnClickListener {

            /*val z = Intent(holder.itemView.context,DetailActivity::class.java)
            z.putExtra("popularity",dogs[position].popularity.toString() )
            z.putExtra("votecount",dogs[position].vote_count.toString())
            z.putExtra("posterpath",dogs[position].poster_path)
            z.putExtra("overview", dogs[position].overview)
            z.putExtra("title", dogs[position].title)
            holder.itemView.context.startActivity(z)*/
        }

    }

    class ViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        val vote_average = itemView.textViewVote_Average
        val title = itemView.textViewTitle
        val imageView = itemView.ivDog
    }
}
