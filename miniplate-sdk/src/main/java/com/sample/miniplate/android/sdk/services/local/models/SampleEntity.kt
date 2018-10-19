package com.sample.miniplate.android.sdk.services.local.models

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by javierdepedrolopez@gmail.com on 8/21/17.
 */
@Entity
data class SampleEntity(
        @PrimaryKey val id: String
)