package org.example.LabsTP.LabN3;

import org.example.LabsTP.LabN3.Strategy.CommaSeparatedStrategy;
import org.example.LabsTP.LabN3.Strategy.SemicolonSeparatedStrategy;
import org.example.LabsTP.LabN3.Strategy.StrategyServiceImpl;
import org.example.LabsTP.LabN3.chain.ChainService;
import org.example.LabsTP.LabN3.chain.Request;
import org.example.LabsTP.LabN3.iterator.ItemType;
import org.example.LabsTP.LabN3.iterator.TreasureChest;
import org.example.LabsTP.LabN3.iterator.TreasureChestItemIterator;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {


        TreasureChest treasureChest = new TreasureChest();
        TreasureChestItemIterator treasureChestItemIterator = new TreasureChestItemIterator(treasureChest, ItemType.WEAPON);
        while (treasureChestItemIterator.hasNext()) {
            System.out.println(treasureChestItemIterator.next());
            System.out.println("+-+-+-+");
        }


        String[] StrategyArray = {"My","name","is","my","name","eminem" };
        StrategyServiceImpl strategyService1 = new StrategyServiceImpl(new SemicolonSeparatedStrategy());
        StrategyServiceImpl strategyService2 = new StrategyServiceImpl(new CommaSeparatedStrategy());
        System.out.println("Semicolon separate: "+strategyService1.exec(Arrays.asList(StrategyArray)));
        System.out.println("Comma separate: "+ strategyService2.exec(Arrays.asList(StrategyArray)));
        System.out.println("+-+-+-+");

        String requestImitation = "method:method \npath:path \nsession:session";
        ChainService chainService = new ChainService();
        Request request = chainService.exec(requestImitation);
        System.out.println("method:" + request.getMethod());
        System.out.println("path:" + request.getPath());
        System.out.println("session:"+request.getSession());

    }

}


