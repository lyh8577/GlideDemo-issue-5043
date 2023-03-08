package com.example.kspdemo;

import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

@GlideModule
public class KspAppGlideModule extends AppGlideModule {
    @Override
    public boolean isManifestParsingEnabled() {
        return false;
    }
}
