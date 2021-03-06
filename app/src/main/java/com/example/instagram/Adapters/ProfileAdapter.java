package com.example.instagram.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.instagram.Post;
import com.example.instagram.R;
import com.parse.ParseFile;

import java.util.List;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolder> {
    private Context context;
    private List<Post> posts;


    public ProfileAdapter(Context context, List<Post> posts) {
        this.context = context;
        this.posts = posts;

    }

    @NonNull
    @Override
    public ProfileAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_post, parent, false);
        return new ProfileAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileAdapter.ViewHolder holder, int position) {
        Post post = posts.get(position);


        holder.bind(post);


    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_User;
        private ImageView iv_Photo;
        private TextView tv_Description;
        private ImageView iv_ProfilePicture;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_User = itemView.findViewById(R.id.tv_userPost);
            iv_Photo = itemView.findViewById(R.id.iv_photo);
            tv_Description = itemView.findViewById(R.id.tv_Description);
            iv_ProfilePicture = itemView.findViewById(R.id.iv_postProfilePicture);

        }

        public void bind(Post post) {
            //Bind the post data into the view element
            ParseFile image = post.getImage();
            ParseFile profilePic = post.getUser().getParseFile("profilePicture");

            if(image != null){
                Glide.with(context).load(post.getImage().getUrl()).into(iv_Photo);
            }
            if(profilePic != null){
                Glide.with(context).load(post.getUser().getParseFile("profilePicture").getUrl()).into(iv_ProfilePicture);
            }


            tv_User.setText(post.getUser().getUsername());
            tv_Description.setText(post.getDescription());



        }
    }
}
