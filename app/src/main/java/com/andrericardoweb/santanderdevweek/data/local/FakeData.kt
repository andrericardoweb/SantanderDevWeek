package com.andrericardoweb.santanderdevweek.data.local

import com.andrericardoweb.santanderdevweek.data.Cartao
import com.andrericardoweb.santanderdevweek.data.Cliente
import com.andrericardoweb.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData() : Conta {
        val cliente = Cliente("Andre")
        val cartao = Cartao("3495736494852938")

        return Conta(
            "3028687-4",
            "8832-4",
            "R$ 1.250,80",
            "R$ 2.2250,80",
            cliente,
            cartao
        )
    }
}