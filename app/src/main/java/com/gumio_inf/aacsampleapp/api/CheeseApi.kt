package com.gumio_inf.aacsampleapp.api

import android.support.annotation.WorkerThread
import com.gumio_inf.aacsampleapp.vo.Cheese
import com.gumio_inf.aacsampleapp.vo.Cheeses

class CheeseApi {

    @WorkerThread
    fun fetchCheeses(): List<Cheese> {
        // This method only returns a list, but let's pretend that this is a network call.
        return Cheeses.CHEESES.mapIndexed { i, name -> Cheese((i + 1).toLong(), name, false) }
    }

}