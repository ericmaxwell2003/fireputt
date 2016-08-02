package com.acme.fireputt;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class PlayerListAdapter extends RecyclerView.Adapter<PlayerListAdapter.PlayerHolder> {
    private LayoutInflater layoutInflater;
    private List<Player> players = new ArrayList<>();

    public PlayerListAdapter(Context context, List<Player> players) {
        this.layoutInflater = LayoutInflater.from(context);
        this.players = players;
    }

    @Override
    public PlayerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.player_item, parent, false);
        PlayerHolder playerHolder = new PlayerHolder(view);
        return playerHolder;
    }

    @Override
    public void onBindViewHolder(PlayerHolder holder, int position) {
        Player player = players.get(position);
        holder.setViewData(player);
    }

    @Override
    public int getItemCount() {
        return players == null ? 0 : players.size();
    }

    public static class PlayerHolder extends RecyclerView.ViewHolder {
        private TextView nameView;
        private TextView scoreView;
        private TextView overUnderView;

        public PlayerHolder(View itemView) {
            super(itemView);
            nameView = (TextView) itemView.findViewById(R.id.name);
            scoreView = (TextView) itemView.findViewById(R.id.score);
            overUnderView = (TextView) itemView.findViewById(R.id.overUnder);
        }

        public void setViewData(Player player) {
            nameView.setText(player.getName());
            scoreView.setText("Score: " + player.getScore());
            overUnderView.setText("Par: " + player.getParStandingAsString());
        }
    }
}
