// Write your code here

package com.example.player.repository;

import java.util.*;
import com.example.player.model.Player;
public interface PlayerRepository {
    ArrayList<Player> getPlayers();
    Player getPlayerById(int PlayerId);
    Player addPlayer(Player player);
    Player updatePlayer(int PlayerId,Player Player player);

    void deletePlayer(int playerId);
}