package com.example.phonecleaner.utils

import com.example.phonecleaner.R
import com.example.phonecleaner.data.HomeOptions

object HomeItems {

    val homeList = arrayListOf(
        HomeOptions("Phone Boost", R.drawable.booster, "45% Ram Available"),
        HomeOptions("Junk Files", R.drawable.junk, "Free up storage space"),
        HomeOptions("Phone Cooler", R.drawable.temp, "Temperature 26'C"),
        HomeOptions("Cache Cleaner", R.drawable.cleaner, "Clear cache to speed up"),
        HomeOptions("Antivirus", R.drawable.antivirus, "Clean phone from malware"),
        HomeOptions("Battery Manager", R.drawable.battery, "Save battery power"),
        HomeOptions("Power Saver", R.drawable.saver, "Save battery consumption"),
        HomeOptions("Notification Blocker", R.drawable.notification, "Mute unwanted notifications"),
    )

}