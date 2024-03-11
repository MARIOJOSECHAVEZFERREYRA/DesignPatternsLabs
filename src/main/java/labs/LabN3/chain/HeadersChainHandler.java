package org.example.LabsTP.LabN3.chain;

import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

public class HeadersChainHandler extends AbstractChainHandler {

    private static final String DELIMITER = ":";

    @Override
    void handle(
            @NotNull Request request
    ) {
        String[] headers = StringUtils.split(request.getInputStream(), "\n");

        for (String header : headers) {
            if (header.isEmpty())
                continue;

            String[] arr = StringUtils.split(header, DELIMITER);
            if (0 == arr.length)
                continue;

            request.getHeaders().put(arr[0], arr[1]);
        }
    }

}