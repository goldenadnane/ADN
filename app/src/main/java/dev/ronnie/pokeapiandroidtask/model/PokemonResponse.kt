package dev.ronnie.pokeapiandroidtask.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PokemonResponse(
    val count: Int,
    val next: String?,
    val previous: String?,

    //list contenant les infos de chaque pokemon
    val results: List<PokemonResult>
) : Parcelable
