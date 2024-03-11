package org.example.LabsTP.LabN3.Strategy;


import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class SemicolonSeparatedStrategy implements Strategy {

    @NotNull
    @Override
    public String process(
            @NotNull List<String> stings
    ) {
        return StringUtils.join(stings, ";");
    }

}