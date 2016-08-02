package com.acme.fireputt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private PlayerListAdapter playerListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerListAdapter = new PlayerListAdapter(this, dummyPlayers());
        recycler = (RecyclerView) findViewById(R.id.playerScores);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(playerListAdapter);
    }

    private List<Player> dummyPlayers() {
        List<Player> players = new ArrayList<>();
        players.add(makePlayer("Rohan", 23, 1));
        players.add(makePlayer("Trish", 21, -1));
        players.add(makePlayer("Eric", 26, 4));
        return players;
    }

    private Player makePlayer(String name, int score, int parStanding) {
        Player player = new Player();
        player.setName(name);
        player.setParStanding(parStanding);
        player.setScore(score);
        return player;
    }


}


