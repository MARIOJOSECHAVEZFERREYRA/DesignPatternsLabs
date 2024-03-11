package org.example.LabsTP.LabN3.chain;

import org.jetbrains.annotations.NotNull;

public class PathChainHandler extends AbstractChainHandler {

    private static final String KEY = "path";

    @Override
    public void handle(
            @NotNull Request request
    ) {
        if (request.getHeaders().containsKey(KEY))
            request.setPath(request.getHeaders().get(KEY));
    }

}
