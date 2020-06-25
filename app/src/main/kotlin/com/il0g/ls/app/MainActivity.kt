package com.il0g.ls.app

import com.github.javiersantos.piracychecker.PiracyChecker
import com.il0g.ls.app.BuildConfig
import com.il0g.ls.app.R
//import dev.jahir.blueprint.app.R
import dev.jahir.blueprint.ui.activities.BottomNavigationBlueprintActivity

/**
 * You can choose between:
 * - DrawerBlueprintActivity
 * - BottomNavigationBlueprintActivity
 */
class MainActivity : BottomNavigationBlueprintActivity() {

    /**
     * These things here have the default values. You can delete the ones you don't want to change
     * and/or modify the ones you want to.
     */
    override val billingEnabled = true

    override fun amazonInstallsEnabled(): Boolean = true
    override fun checkLPF(): Boolean = true
    override fun checkStores(): Boolean = true
    override val isDebug: Boolean = BuildConfig.DEBUG

    /**
     * This is your app's license key. Get yours on Google Play Dev Console.
     * Default one isn't valid and could cause issues in your app.
     */
    override fun getLicKey(): String? = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAk+lVkAd0YUAt2k+U/YiZCR2ESeeoQGVM2q2QGvIXfpt8mN6mnxuIgDljZxKQKj55olUUWfNVGYXhFST/SbBNlioUHBb4xg8G2O2R0Hg4oacqD96iY9Lggl6rjUAYTIlZd4UJTZ8cZJfY06nBAKQBfN9wjbO0WF+fYU1Bh/7cbsK7mspM74d+ZY/rvqjxP5XJsyh7DFGJCOkLL9/PixEX3lYW6vi5JBIQ+pNnYqsi0xl5mjcKxqvQyKhrM3iLIhi8QHdW+V1fcoqWGvtSeWccSDndHn9zNcSdSolkOBav1+tF+nO2+eHbgaI7+VU+AGC32VGEE4L2tKxFbry/ZitXqwIDAQAB"



    /**
     * This is the license checker code. Feel free to create your own implementation or
     * leave it as it is.
     * Anyways, keep the 'destroyChecker()' as the very first line of this code block
     * Return null to disable license check
     */
    override fun getLicenseChecker(): PiracyChecker? {
        destroyChecker() // Important
        return if (BuildConfig.DEBUG) null else super.getLicenseChecker()
    }

    override fun defaultTheme(): Int =
        R.style.MyApp_Default
    override fun amoledTheme(): Int =
        R.style.MyApp_Default_Amoled
}