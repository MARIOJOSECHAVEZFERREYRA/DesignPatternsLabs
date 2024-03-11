package org.example.LabsTP.LabN3.chain;


import org.jetbrains.annotations.NotNull;

public interface ChainHandler {

    void process(@NotNull Request request);

    ChainHandler next();

    ChainHandler next(ChainHandler chainHandler);

}