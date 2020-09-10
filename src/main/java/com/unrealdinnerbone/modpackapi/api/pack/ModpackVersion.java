package com.unrealdinnerbone.modpackapi.api.pack;

import com.unrealdinnerbone.modpackapi.api.base.BaseVersion;
import com.unrealdinnerbone.modpackapi.api.version.Spec;
import lombok.Getter;

@Getter
public class ModpackVersion extends BaseVersion {
    private Spec specs;
}
