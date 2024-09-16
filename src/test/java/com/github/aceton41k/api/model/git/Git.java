package com.github.aceton41k.api.model.git;

import lombok.Getter;

@Getter
public class Git {

    private String branch;
    private Commit commit;
    private Build build;
}
