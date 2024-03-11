package org.example.LabsTP.LabN3.chain;


import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public abstract class AbstractChainHandler implements ChainHandler {

    private ChainHandler chainHandler;

    @Override
    public void process(
            @NotNull Request request
    ) {
        validate(request);
        handle(request);
        if (Objects.nonNull(next()))
            next().process(request);
    }

    @Override
    public ChainHandler next() {
        return chainHandler;
    }

    @Override
    public ChainHandler next(ChainHandler chainHandler) {
        this.chainHandler = chainHandler;
        return chainHandler;
    }

    private void validate(
            @NotNull Request request
    ) {
        if (Objects.isNull(request))
            throw new RuntimeException("request must not be null");
    }

    abstract void handle(@NotNull Request request);

}