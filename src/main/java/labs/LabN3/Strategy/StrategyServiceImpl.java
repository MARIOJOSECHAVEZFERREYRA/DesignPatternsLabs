package org.example.LabsTP.LabN3.Strategy;


import org.jetbrains.annotations.NotNull;

import java.util.List;

public class StrategyServiceImpl implements StrategyService {

    private Strategy strategy;

    public StrategyServiceImpl(@NotNull Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    @NotNull
    public String exec(@NotNull List<String> strings) {
        String result = "";
        if (strings.isEmpty())
            return result;

        return strategy.process(strings);
    }

    public StrategyService setStrategy(@NotNull Strategy strategy) {
        this.strategy = strategy;
        return this;
    }
}