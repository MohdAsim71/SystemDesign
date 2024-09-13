package com.example.systemdesign.objectPoolPattern.client

import com.example.systemdesign.objectPoolPattern.objectPool.BitmapPool

fun main() {
    val bitmapPool = BitmapPool(5)

// Request a bitmap from the pool
    val bitmap = bitmapPool.getBitmap(100, 100)
    //now you can use this bitmap to image view

// Use the bitmap and then release it back to the pool
    bitmapPool.releaseBitmap(bitmap)
}