package demoCompareSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    //clasam atp de la tenis si sa ii sortam pe jucatori si sa-i afisam

    public static void main(String[] args) {
        List<TennisPlayer> listOfPlayers = new ArrayList<>();

        TennisPlayer tp1 = new TennisPlayer("Medvedev", 4);
        TennisPlayer tp2 = new TennisPlayer("Sinner", 3);
        TennisPlayer tp3 = new TennisPlayer("Djokovic", 1);
        TennisPlayer tp4 = new TennisPlayer("Alcaraz", 2);


        //  TennisPlayer.sort=false;
        tp3.setActive(true);


        listOfPlayers.add(tp1);
        listOfPlayers.add(tp2);
        listOfPlayers.add(tp3);
        listOfPlayers.add(tp4);


        CompartorActiveAsc compdesc = new CompartorActiveAsc();
        Collections.sort(listOfPlayers, compdesc);
        for (TennisPlayer player1 : listOfPlayers) {
            System.out.println(player1.getName() + player1.getRanking());
        }


//
//
//        for(TennisPlayer player: listOfPlayers) {
//            System.out.println(player.getName() + player.getRanking());
//        }
//
//
//            Collections.sort(listOfPlayers);
//
//            System.out.println("sortate --- ");
//
//            for(TennisPlayer player1: listOfPlayers) {
//                System.out.println(player1.getName() + player1.getRanking());
//            }
//
//        TennisPlayer.sort=true;
//
//
//        Collections.sort(listOfPlayers);
//
//        System.out.println("sortate invers--- ");
//
//        for(TennisPlayer player1: listOfPlayers) {
//            System.out.println(player1.getName() + player1.getRanking());
//        }
//    }

    }
}
