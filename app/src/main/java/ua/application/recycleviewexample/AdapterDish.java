package ua.application.recycleviewexample;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterDish extends RecyclerView.Adapter<AdapterDish.DishViewHolder> {

    private View viewNotificationCounter;

    public static class DishViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        TextView nameDish;
        TextView priceDish;
        TextView amountDish;
        ImageView photoDish;
        ImageButton imageButton;

        NotificationCounter notificationCounter;

        public DishViewHolder(View itemView, View notificationView) {
            super(itemView);

            cv = (CardView) itemView.findViewById(R.id.cv);

            nameDish = (TextView) itemView.findViewById(R.id.name_dishes);
            priceDish = (TextView) itemView.findViewById(R.id.price_dishes);
            amountDish = (TextView) itemView.findViewById(R.id.amount_dishes);
            photoDish = (ImageView) itemView.findViewById(R.id.dishes_photo);
            imageButton = (ImageButton) itemView.findViewById(R.id.cartButton);

            nameDish.setTextColor(Color.WHITE);
            priceDish.setTextColor(Color.WHITE);
            amountDish.setTextColor(Color.WHITE);

            notificationCounter = new NotificationCounter(notificationView);
            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    notificationCounter.increaseNumber();
                    imageButton.setBackgroundResource(R.drawable.roudered_button_pressed);
                    imageButton.setClickable(false);
                }
            });
        }
    }

    List<Dish> dishes;

    public AdapterDish(List<Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public DishViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent,false);
        DishViewHolder  dvh = new DishViewHolder(v, getNotificationView());
        return dvh;
    }

    @Override
    public void onBindViewHolder(DishViewHolder holder, int position) {
        holder.photoDish.setImageResource(dishes.get(position).getPhotoId());
        holder.nameDish.setText(dishes.get(position).getName());
        holder.amountDish.setText(dishes.get(position).getAmount());
        holder.priceDish.setText(dishes.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return dishes.size();
    }

    public void setViewOnFragment(View v){
        viewNotificationCounter  = v;
    }

    public View getNotificationView(){
        return viewNotificationCounter;
    }
}
