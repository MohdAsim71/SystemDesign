package com.example.systemdesign.objectPoolPattern.objectPool

import android.graphics.Bitmap

class BitmapPool(private val maxPoolSize: Int) {

    // A list of available Bitmap objects in the pool
    private val availableBitmaps: MutableList<Bitmap> = mutableListOf()

    // Get a Bitmap from the pool or create a new one if necessary
    fun getBitmap(width: Int, height: Int): Bitmap {
        for (bitmap in availableBitmaps) {
            if (bitmap.width == width && bitmap.height == height) {
                availableBitmaps.remove(bitmap) // Remove bitmap from the pool
                return bitmap
            }
        }
        // No suitable bitmap in the pool, create a new one
        return Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
    }

    // Return a Bitmap to the pool for reuse
    fun releaseBitmap(bitmap: Bitmap) {
        if (availableBitmaps.size < maxPoolSize) {
            availableBitmaps.add(bitmap) // Add the bitmap to the pool if there's space
        } else {
            // If the pool is full, recycle the bitmap to release memory
            bitmap.recycle()
        }
    }
}
