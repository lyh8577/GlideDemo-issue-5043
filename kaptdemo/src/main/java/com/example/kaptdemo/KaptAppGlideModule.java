package com.example.kaptdemo;

import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

@GlideModule
public class KaptAppGlideModule extends AppGlideModule {
    @Override
    public boolean isManifestParsingEnabled() {
        return false;
    }
}
